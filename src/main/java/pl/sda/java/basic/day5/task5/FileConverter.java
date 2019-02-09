package pl.sda.java.basic.day5.task5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Michal Jaszczyk
 **/
public class FileConverter {

    private List<FileParser> fileParsers = new ArrayList<>();

    public void addParser(FileParser fileParser) {
        fileParsers.add(fileParser);
    }

    public void displayConvertedFiles() {
        // pobieram listę plików znajdującą się w folderze src/Main/resources/testFiles
        try (Stream<Path> paths = Files.list(new File("src/Main/resources/testFiles").toPath())) {
            List<Path> filePaths = paths.collect(Collectors.toList()); // zapisujemy ścieżki do plików do listy
            for (Path filePath : filePaths) { // iterujemy się po wszystkich plikach
                List<String> fileContent = Files.readAllLines(filePath); // wczytujemy wszystkie linie z pliku
                for (FileParser fileParser : fileParsers) { // iterujemy się po każdym parserze z listy
                    if (fileParser.validFormat(filePath.getFileName().toString())) { // jeżeli dany parser obsługuje rozszerzenie pliku to wyświetl wynik parsowania
                        System.out.println("Original content: " + fileContent);
                        System.out.println("Parser: " + fileParser.name() + " Content: " + fileParser.parse(fileContent));
                    }
                }
            }
        } catch (IOException e) { // złapanie wyjątku w przypadku problemu z ostworzniem pliku z dysku
            System.out.println("Nieoczekiwany błąd " + e.getMessage());
            e.printStackTrace();
        }
    }
}

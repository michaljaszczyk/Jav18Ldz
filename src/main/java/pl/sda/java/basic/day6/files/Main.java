package pl.sda.java.basic.day6.files;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Michal Jaszczyk
 **/
public class Main {
    public static void main(String[] args) {
        IoExample ioExample = new IoExample();
        System.out.println("--- Old style ---");
        String pathname = "src/main/resources/exampleFile.txt";
//        String pathname = "c:/Programowanie/JavaTraining/src/main/resources/exampleFile.txt"; // jest możliwość podania pełnej ścieżki, ale nie zadziała na innym komputerze
        ioExample.readFile(pathname);

        System.out.println("--- Using try with resources ---");
        File file = new File(pathname);
        ioExample.readFileUsingTryWithResources(file);

        System.out.println("--- Using IOUtils ---");
        ioExample.readFileUsingIOUtils(file);

        System.out.println("--- Using FileUtils ---");
        ioExample.readFileUsingFileUtils(file);

        System.out.println("--- From classpath ---");
        InputStream inputStream = Main.class.getResourceAsStream("/exampleFile.txt");
        ioExample.readFileUsingInputStream(inputStream);

        System.out.println("--- Using new I/O ---");
        Path path = Paths.get(pathname);
        Path path0 = Paths.get("src/Main/resources/exampleFile.txt"); // Tworzenie ścieżki do pliku
        Path path1 = Paths.get("src", "Main", "resources", "exampleFile.txt"); // To samo co wyżej, ale nie martwimy się o obsługę ścieżki przez system operacyjny
        System.out.println(path1);
        // Polecam!
        ioExample.readFileUsingNio(path);

        System.out.println("--- Using Streams ---");
        ioExample.readFilesUsingStreams(path);

    }
}

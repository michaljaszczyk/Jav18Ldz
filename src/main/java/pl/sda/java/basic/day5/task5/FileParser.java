package pl.sda.java.basic.day5.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michal Jaszczyk
 **/
public interface FileParser {

    // poniśze 2 metody nie mają implementacji, więc klasy implementujące ten interfejs będą musiały je zaimplementować
    String name();

    boolean validFormat(String filename);

    // domyślna implementacja
    default List<String> parse(List<String> fileContent) {
        List<String> result = new ArrayList<>();
        for (String line : fileContent) {
            // Zamienia wszystkie spacje na _ oraz zapisuje tak zamieniony ciąg znaków do zmiennej parsedLine
            String parsedLine = line.replaceAll(" ", "_");
//            String parsedLine = line.replaceAll("\\s", "_"); // to samo co wyżej, ale z użyciem wyrażenia regularnego
            result.add(parsedLine);
        }

        return result;
    }
}

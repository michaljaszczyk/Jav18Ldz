package pl.sda.java.basic.day5.task5;

import java.util.ArrayList;
import java.util.List;

public class AbcFileParser implements FileParser {
    @Override
    public String name() {
        return "AbcFileParser";
    }

    @Override
    public boolean validFormat(String filename) {
        return filename.endsWith(".abc");
    }

    @Override
    public List<String> parse(List<String> fileContent) {
        List<String> result = new ArrayList<>();
        for (String line : fileContent) {
            String parsedLine = line.replaceAll("abc", " "); // zamienia wszystkie wystapienia abc na spacje
            result.add(parsedLine); // dodaje utowrzony ciąg znaków do wynikowej listy
//            result.add(line.replaceAll("abc", " ")); // to samo co powyższe 2 linie
        }

        return result;
    }
}

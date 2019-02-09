package pl.sda.java.basic.day5.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michal Jaszczyk
 **/
public class TxtFileParserToQuestionMark implements FileParser {
    @Override
    public String name() {
        return "TxtFileParserToQuestionMark";
    }

    @Override
    public boolean validFormat(String filename) {
        return filename.endsWith(".txt");
    }

    @Override
    public List<String> parse(List<String> fileContent) {
        List<String> result = new ArrayList<>();
        for (String line : fileContent) {
            String parsedLine = line.replaceAll(" ", "?"); // zamienia wszystkie wystapienia abc na spacje
            result.add(parsedLine); // dodaje utowrzony ciąg znaków do wynikowej listy
        }

        return result;
    }
}

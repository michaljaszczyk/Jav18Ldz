package pl.sda.java.basic.day5.task5;

/**
 * @author Michal Jaszczyk
 **/
public class Main {
    public static void main(String[] args) {
        // Stworzenie klasy z główną logiką aplikacji
        FileConverter fileConverter = new FileConverter();
        // Konfiguracja głównej klasy
        fileConverter.addParser(new TxtFileParser());
        fileConverter.addParser(new ZxcFileParser());
        fileConverter.addParser(new AbcFileParser());
        fileConverter.addParser(new TxtFileParserToQuestionMark());

        // Wywołanie funkcjonalności głównej klasy
        fileConverter.displayConvertedFiles();
    }
}

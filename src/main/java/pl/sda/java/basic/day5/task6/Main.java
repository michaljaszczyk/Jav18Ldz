package pl.sda.java.basic.day5.task6;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class Main {
    // wymagane jest dodanie pliku konfiguracyjnego log4j.properties w folderze resources (src/main/resources)
    private static Logger logger = Logger.getLogger(Main.class); // stworzenie loggera
    public static void main(String[] args) {
        StringEscapeUtils stringEscapeUtils; // nieaktualna (deprecated) klasa. Nie powinniśmy jej używać (to samo tyczy się przekreślonych metod)
        String jakasZmienna = StringUtils.EMPTY; // aby wskazać, że świadomie używamy pustego znaku możemy użyć stałej z klasy StringUtils
        String jakasZmienna2 = ""; // to samo co wyżej, ale tutaj można pomyśleć, że zapomnieliśmy wstawić odpowiedni tekst
        // klasa StringUtils z biblioteki Apache Commons Lang ma wiele przydatnych funkcji do manipulacji łańcucham iznakowymi

        System.out.println("Ala ma kota");
        logger.debug("poziom debug"); // bardzo szczegółowy poziom logowania, głównie na potrzeby analizy kodu. Wyłączany w aplikacji produkcyjnej za pomocą pliku konfiguracyjnego
        logger.info("poziom info"); // normalne działanie aplikacji
        logger.warn("poziom warning"); // ostrzeżenie, że coś może być nei tak, ale nie wpływa to na stabilność aplikacji
        logger.error("poziom error"); // błąd w aplikacji w wypadku kiedy wydarzyło się coś nieoczekiwanego i może to wpływać na stabilność aplikacji
        logger.info(fun()); // możemy też przekazywać wynik z metod jak w przypadku sout
    }

    public static String fun() {
        return "Hello world";
    }
}

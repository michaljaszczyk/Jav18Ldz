package pl.sda.java.basic.day7.task1;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // utworzenie mapy dni tygodnia na zakres godzin
        Map<DayOfWeek,TimeRange> openningHours = new HashMap<>();
        // dodanie godzin otwarcia dla poniedziałku
        openningHours.put(DayOfWeek.MONDAY, new TimeRange(LocalTime.of(8, 0), LocalTime.of(18, 0)));
        // utworzenie nowego sklepu podając godziny otwarcia
        Shop zabka = new Shop(openningHours);
        // sprawdzenie czy sklep jest otwarty w poniedziałek o 12
        boolean isOpen = zabka.isOpen(
                DayOfWeek.MONDAY,
                LocalTime.of(12, 0)
        );
        System.out.println("Czy Zabka jest otwarta w poniedziałek o 12? " + isOpen);
        try {
            // pobranie godziny od której jest otwarty sklep w piątek
            LocalTime localTime = zabka.openFrom(DayOfWeek.FRIDAY);
            // jeżeli udało się pobrać godziny otwarcia to wyświetla komunikat
            System.out.println("W piątek godziny otwarcia to: " + localTime);
        } catch (MissingDayOfWeekException e) {
            // informacja w przypadku kiedy godziny otwarcia nie obejmują danego dnia tygodnia
            System.out.println(
                    "W dniu " + e.getMissingDayOfWeek() + " sklep jest zamknięty"
            );
            // zostanie wyświetlony ten sam komunikat co powyżej
            // String.format zamienia %s na kolejne wartości argumentów
            System.out.println(
                    String.format("W dniu %s sklep jest zamknięty", e.getMissingDayOfWeek())
            );
        }

    }
}

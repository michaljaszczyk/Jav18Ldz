package pl.sda.java.basic.day7.homework.allergy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Michal Jaszczyk
 **/
public class AllergyCalendar {

    // Formatowanie daty. MM oznacza miesiąc, a dd dzień. Czyli używając tego formatera data
    // zostanie zwrócona w formacie miesiąc-dzień (z pominięciem roku)
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("MM-dd");

    // Dobra praktyka jeżeli jakieś pole ma niezmienną wartość to deklarujemy je jako static final
    private static final int DEFAULT_YEAR = 2000;
    // Mapa nazw alergenów na zakres dat
    private Map<String, DatesRange> allergies = new HashMap<>();

    public void addAllergy(String allergy, DatesRange datesRange) {
        // Obejście problemu porównywania dat z pominięciem roku (można zawsze ustawić ten sam rok, dla każdej daty)
        datesRange.setYear(DEFAULT_YEAR);
        allergies.put(allergy, datesRange);
    }

    public void printAllergyDates(String allergy) {
        // Pobieramy z mapy zakres dat dla podanego alergenu
        DatesRange datesRange = allergies.get(allergy);
        // Jeżeli w mapie był alergen to wartość powinna być != null
        if (datesRange != null) {
            // Wypisujemy nazwę alergenu oraz zakres dat kozystając z naszego formatera wyświetlającego tylko miesiąc i dzień
            System.out.println(allergy + " pyli " + datesRange.formattedDateRange(DATE_TIME_FORMATTER));
        } else {
            // Jeżeli w mapie nie było alergenu:
            System.out.println("Nie znaleziono alergenu: " + allergy);
        }
    }

    public void printAllAllergiesForDate(LocalDate localDate) {
        // Ustawiamy domyślny rok, dla potrzeb porównywania
        LocalDate defaultYearDate = localDate.withYear(DEFAULT_YEAR);
        System.out.println("Dla podanej daty pylą następujące alergeny:");
        for (Map.Entry<String, DatesRange> allergy : allergies.entrySet()) {
            // Jeżeli dla zakresu dat podana data się zawiera to...
            if (allergy.getValue().dateInRange(defaultYearDate)) {
                // Wyświetl alrgen wraz z akresem dat w formacie miesiąc-dzień
                System.out.println(allergy.getKey() + " pyli " + allergy.getValue().formattedDateRange(DATE_TIME_FORMATTER));
            }
        }
    }
}

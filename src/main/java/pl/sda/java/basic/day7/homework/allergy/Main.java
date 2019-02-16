package pl.sda.java.basic.day7.homework.allergy;

import java.time.LocalDate;

/**
 * @author Michal Jaszczyk
 **/
public class Main {
    public static void main(String[] args) {
        AllergyCalendar allergyCalendar = new AllergyCalendar();
        // Dodanie alegenów
        allergyCalendar.addAllergy(
                "Trawa",
                new DatesRange(LocalDate.of(2018, 5, 1), LocalDate.of(2018, 9, 30))
        );
        allergyCalendar.addAllergy(
                "Brzoza",
                new DatesRange(LocalDate.of(1980, 4, 1), LocalDate.of(2018, 4, 30))
        );
        allergyCalendar.addAllergy(
                "Bylica",
                new DatesRange(LocalDate.of(2100, 7, 1), LocalDate.of(2018, 8, 30))
        );
        // To samo co wyżej tylko zamiast bezpośrednio przekazać datę do konsturktora najpierw zachowujemy ją jako zmienną lokalną
        LocalDate dateFrom = LocalDate.of(2018, 6, 1);
        LocalDate dateTo = LocalDate.of(2018, 8, 30);
        allergyCalendar.addAllergy(
                "Pokrzywa",
                new DatesRange(dateFrom, dateTo)
        );

        allergyCalendar.printAllergyDates("Trawa"); // Wypisze zakres dat
        allergyCalendar.printAllergyDates("Koniczyna"); // Nie ma takiego alergenu

        // Poniższe metody powinny zwrócić poprawny wynik mimo różnych lat
        allergyCalendar.printAllAllergiesForDate(LocalDate.of(2018, 5, 21));
        allergyCalendar.printAllAllergiesForDate(LocalDate.of(1988, 7, 21));
        allergyCalendar.printAllAllergiesForDate(LocalDate.of(1988, 1, 1)); // nic tu nie pyli
    }
}

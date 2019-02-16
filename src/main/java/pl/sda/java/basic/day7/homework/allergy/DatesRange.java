package pl.sda.java.basic.day7.homework.allergy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Michal Jaszczyk
 **/
public class DatesRange {

    // Data od
    private LocalDate dateFrom;
    // Data do
    private LocalDate dateTo;

    public DatesRange(LocalDate dateFrom, LocalDate dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    // Metoda pomocnicza zwracająca true jeżeli podana data jest między dateFrom a dateTo
    public boolean dateInRange(LocalDate localDate) {
        // czy dateFrom odjąć 1 dzień jest przed podaną datą i czy dateTo dodać jeden dzień jest po podanej dacie
        return dateFrom.minusDays(1).isBefore(localDate) && dateTo.plusDays(1).isAfter(localDate);
    }

    // Metoda pomocnicza do ustawiania podanego roku w dateTo i dateFrom
    public void setYear(int year) {
        dateTo = dateTo.withYear(year);
        dateFrom = dateFrom.withYear(year);
    }

    // Metoda zwrcająca zakres dat jako ciąg znaków korzystając z podanego formatu daty
    public String formattedDateRange(DateTimeFormatter dateTimeFormatter) {
        return "od: " + dateFrom.format(dateTimeFormatter) + " do: " + dateTo.format(dateTimeFormatter);
    }
}

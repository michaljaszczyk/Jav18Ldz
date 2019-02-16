package pl.sda.java.basic.day7.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public interface OpeningHours {

    LocalTime openFrom(DayOfWeek dayOfWeek) throws MissingDayOfWeekException;

    LocalTime openTo(DayOfWeek dayOfWeek) throws MissingDayOfWeekException;

    static DayOfWeek currentDay() {
        // Pobranie aktualnej daty, a nstępnie wcyiągnięcie z niej dnia tygodnia
        LocalDate currentDate = LocalDate.now();
        return currentDate.getDayOfWeek();
    }

    default boolean isOpen(DayOfWeek dayOfWeek, LocalTime time) {
        return false;
    }
}

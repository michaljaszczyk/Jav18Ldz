package pl.sda.java.basic.day7.task1;

import java.time.DayOfWeek;

public class MissingDayOfWeekException extends Exception {
    // zapamiętujemy którego dnia tygodnia brakowało
    private DayOfWeek missingDayOfWeek;

    public MissingDayOfWeekException(DayOfWeek missingDayOfWeek) {
        super("Brak następującego dnia tygodnia: " + missingDayOfWeek);
        this.missingDayOfWeek = missingDayOfWeek;
    }

    public DayOfWeek getMissingDayOfWeek() {
        return missingDayOfWeek;
    }
}

package pl.sda.java.basic.day7.task1;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Map;

public class Shop extends Building implements OpeningHours {

    private Map<DayOfWeek,TimeRange> openingHours;

    public Shop(Map<DayOfWeek,TimeRange> openingHours) {
        super(1); // sklep będzie miał zawsze jedno piętro
        this.openingHours = openingHours;
    }

    @Override
    public BuildingType getBuildingType() {
        return BuildingType.CIVIL;
    }

    @Override
    public LocalTime openFrom(DayOfWeek dayOfWeek) throws MissingDayOfWeekException {
        // pobieramy godziny otwarcia dla danego dnia tygodnia
        TimeRange timeRange = openingHours.get(dayOfWeek);
        if (timeRange != null) { // sprawdzamy czy taki dzień tygodnia był w naszej mapie
            return timeRange.getOpenFrom(); // jeżeli tak to zwracamy godzinę otwarcia
        } else { // jeżeli nie, to rzucamy wyjątkiem
            throw new MissingDayOfWeekException(dayOfWeek);
        }
    }

    @Override
    public LocalTime openTo(DayOfWeek dayOfWeek) throws MissingDayOfWeekException {
        TimeRange timeRange = openingHours.get(dayOfWeek);
        if (timeRange != null) {
            return timeRange.getOpenTo();
        } else {
            throw new MissingDayOfWeekException(dayOfWeek);
        }
    }

    @Override
    public boolean isOpen(DayOfWeek dayOfWeek, LocalTime time) {
        // sprawdzamy czy podany dzień jest w mapie
        if (openingHours.containsKey(dayOfWeek)) {
            TimeRange timeRange = openingHours.get(dayOfWeek);
            // sprawdzamy czy podana godzina jest między godziną otwarcia a zamknięcia
            // odejmujemy/dodajemy 1 sekundę, aby warunek był spełniony również dla dokładnie takiej samej godziny jak godzina otwarcia/zamknięcia
            if (time.isAfter(timeRange.getOpenFrom().minusSeconds(1))
                    && time.isBefore(timeRange.getOpenTo().plusSeconds(1))) {
                return true;
            }
        }
        return false;
    }
}

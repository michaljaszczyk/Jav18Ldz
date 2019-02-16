package pl.sda.java.basic.day7.homework.insurance;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Michal Jaszczyk
 **/
public class Insurer {

    private Map<String, Person> insuredPeople = new HashMap<>();

    public boolean addPerson(String pesel, Person person) {
        // Sprawdzenie czy pesel jest liczbą oraz ma 11 znaków
        if (isNumeric(pesel) && pesel.length() == 11) {
            Person existingPerson = insuredPeople.putIfAbsent(pesel, person); // metoda ta doda osobę pod danym peselu tylko jeśli tego peselu nie było jeszcze w mapie
            return existingPerson == null; // jeżeli metoda putIfAbsent zwróciła null to znaczy, że pod podanym pselem nie było osoby i dodanie się udało
        }
        return false; // jeżeli podany psel nie jest liczbą, jego długość jest różna od 11 lub na pierwszym znaku jest + lub - to zwracamy false
    }

    public Person findPerson(String pesel) {
        return insuredPeople.get(pesel); // zwracamy osobę o podanym peselu
    }

    public boolean updatePerson(String pesel, Person person) {
        Person existingPerson = insuredPeople.replace(pesel, person); // replace zamieni osobę pod podanym pselem tylko jeżeli dany pesel jest w mapie
        return existingPerson != null; // jeżeli metoda replace zwróciła null, oznacza to, że nie było osoby pod podanym peselem
    }

    private boolean isNumeric(String stringWithDigits) {
        char[] chars = stringWithDigits.toCharArray(); // zamieniamy ciąg znaków na tablicę znaków
        for (char singleChar : chars) {
            if (!Character.isDigit(singleChar)) { // jeżeli znak nie jest liczbą
                return false;
            }
        }
        return true;
    }
//    private boolean isNumeric(String str) {
//        try {
//            long d = Long.parseLong(str); // Zamieniamy String na Long. W przypadku jeżeli ta operacja się powiedzie zwracamy true
//            return true;
//        } catch (NumberFormatException nfe) {
//            return false; // Zwracamy false w przypadku jak podany String nie jest liczbą
//        }
//    }
}

package pl.sda.java.basic.day5.homework.school.room;

/**
 * @author Michal Jaszczyk
 **/
public class UtilityRoom implements Room {

    @Override
    public String name() {
        return "Pomieszczenie gospodarcze";
    }

    @Override
    public boolean open(int accessLevel) {
        // Jeżeli podany poziom dostępu > 2 to zwróć true
        return accessLevel > 2;
    }
}

package pl.sda.java.basic.day5.homework.school.room;

/**
 * @author Michal Jaszczyk
 **/
public class TeachersRoom implements Room {

    @Override
    public String name() {
        return "Pokój nauczycielski";
    }

    @Override
    public boolean open(int accessLevel) {
        // Jeżeli podany poziom dostępu > 1 to zwróć true
        return accessLevel > 1;
    }
}

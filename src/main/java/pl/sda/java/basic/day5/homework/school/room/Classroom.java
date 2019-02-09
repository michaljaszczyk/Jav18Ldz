package pl.sda.java.basic.day5.homework.school.room;

/**
 * @author Michal Jaszczyk
 **/
public class Classroom implements Room {

    @Override
    public String name() {
        return "Sala lekcyjna";
    }

    @Override
    public boolean open(int accessLevel) {
        // Jeżeli podany poziom dostępu > 1 to zwróć true
        return accessLevel > 1;
    }
}

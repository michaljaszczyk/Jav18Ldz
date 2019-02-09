package pl.sda.java.basic.day5.homework.school.room;

/**
 * @author Michal Jaszczyk
 **/
public class PrincipalOffice implements Room {

    @Override
    public String name() {
        return "Pokój dyrektora";
    }

    @Override
    public boolean open(int accessLevel) {
        // Jeżeli podany poziom dostępu > 3 to zwróć true
        return accessLevel > 3;
    }
}

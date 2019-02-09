package pl.sda.java.basic.day5.homework.school.room;

/**
 * @author Michal Jaszczyk
 **/
public class Cloakroom implements Room {

    @Override
    public String name() {
        return "Szatnia";
    }

    @Override
    public boolean open(int accessLevel) {
        return true;
    }
}

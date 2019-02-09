package pl.sda.java.basic.day5.homework.school.room;

/**
 * @author Michal Jaszczyk
 **/
public interface Room {

    String name();

    boolean open(int accessLevel);
}

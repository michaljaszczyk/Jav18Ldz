package pl.sda.java.basic.day5.homework.school;

import pl.sda.java.basic.day5.homework.school.employee.Student;
import pl.sda.java.basic.day5.homework.school.employee.Janitor;
import pl.sda.java.basic.day5.homework.school.employee.Principal;
import pl.sda.java.basic.day5.homework.school.employee.Teacher;
import pl.sda.java.basic.day5.homework.school.room.*;

/**
 * @author Michal Jaszczyk
 **/
public class Main {
    public static void main(String[] args) {
        School school = new School();
        // Dodawanie pracowników
        school.addEmployee(new Student());
        school.addEmployee(new Principal());
        school.addEmployee(new Janitor());
        school.addEmployee(new Teacher());

        // Dodawanie sal
        school.addRoom(new Classroom());
        school.addRoom(new Cloakroom());
        school.addRoom(new PrincipalOffice());
        school.addRoom(new TeachersRoom());
        school.addRoom(new UtilityRoom());

        // Wyświetlenie dostępów
        school.printAccess();
    }
}

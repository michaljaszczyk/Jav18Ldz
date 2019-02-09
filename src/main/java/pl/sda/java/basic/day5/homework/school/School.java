package pl.sda.java.basic.day5.homework.school;

import pl.sda.java.basic.day5.homework.school.employee.Employee;
import pl.sda.java.basic.day5.homework.school.room.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michal Jaszczyk
 **/
public class School {

    private List<Employee> employees = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();

    // Dodawanie nowego pracownika. Dobra praktyka to ukrywanie naszych wewnętrznych kolekcji.
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Dodawanie nowej sali
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Wyświeltenie dostępów
    public void printAccess() {
        // Przechodzimy po wszystkich salach
        for (Room room : rooms) {
            System.out.print("Dostęp do: " + room.name() + " mają: ");
            // Dla danej sali przechodzimy po wszystkich pracownikach
            for (Employee employee : employees) {
                // Jeżeli możemy otworzyć pokój podanym poziomem dostępu...
                if (room.open(employee.getAccessLevel())) {
                    // to wyświetlamy pracownika
                    System.out.print(employee.getJob() + " ");
                }
            }
            System.out.println();
        }
    }
}

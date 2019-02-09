package pl.sda.java.basic.day5.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Michal", "Michal@company.pl", 1);
        Contractor contractor = new Contractor("Adam", "Adam@company.pl", "SDA");
        User employeeUser = new Employee("Tomasz", "Tomasz@company.pl", 0.5f);
        User contractorUser = new Contractor("Zenon", "Zenon@company.pl", "ZXC");

        List<User> users = new ArrayList<>();
        users.add(employee);
        users.add(contractor);
        users.add(employeeUser);
        users.add(contractorUser);

        System.out.println(users);
        for (User user : users) {
            System.out.println(user);
        }
    }
}

package pl.sda.java.basic.day5.homework.school.employee;

/**
 * @author Michal Jaszczyk
 **/
public abstract class Employee {

    private int accessLevel;
    private String job;

    public Employee(int accessLevel, String job) {
        this.accessLevel = accessLevel;
        this.job = job;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public String getJob() {
        return job;
    }
}

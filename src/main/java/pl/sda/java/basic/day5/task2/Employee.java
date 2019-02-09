package pl.sda.java.basic.day5.task2;

public class Employee extends User {
    private float workload;

    public Employee(String username, String email, float workload) {
        super(username, email);
        this.workload = workload;
    }

    public float getWorkload() {
        return workload;
    }
}

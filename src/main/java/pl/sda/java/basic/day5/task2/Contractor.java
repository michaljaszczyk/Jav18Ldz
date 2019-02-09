package pl.sda.java.basic.day5.task2;

public class Contractor extends User {

    private String company;

    public Contractor(String username, String email, String company) {
        super(username, email);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
}

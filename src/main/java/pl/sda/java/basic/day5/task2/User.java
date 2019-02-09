package pl.sda.java.basic.day5.task2;

public abstract class User {
    private static long maxId; // tutaj będziemy przechowywać najwyższą liczbę, która nie jest jeszcze przypisana
    private long id; // unikalny identyfikator użytkownika
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.id = maxId++;// to samo działanie co połączenie 2 linii poniżej
//        this.id = maxId;
//        maxId = maxId + 1;

//        this.id = ++maxId; // najpierw zwiększenie wartosci a potem przypisanie do zmiennej id
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email;
    }
}

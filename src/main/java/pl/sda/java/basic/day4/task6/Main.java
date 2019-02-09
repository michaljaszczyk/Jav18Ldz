package pl.sda.java.basic.day4.task6;

public class Main {
    public static void main(String[] args) {
        Pieczarka pieczarka = new Pieczarka();
        Muchomor muchomor = new Muchomor();
        Prawdziwek prawdziwek = new Prawdziwek();

//        Jadalny jadalny = new Jadalny(); // nie można, ponieważ Jadalny to interfejs
        Grzyb grzybPieczarka = new Pieczarka(); // Pieczarka to też Grzyb (rozszerza klasę Grzyb)
        Grzyb grzybMuchomor = new Muchomor();
        Grzyb grzybPrawdziwek = new Prawdziwek();

        Jadalny jadalnaPieczarka = new Pieczarka(); // Pieczarka jest Jadalna (implementuje intergejs Jadalny)
        Jadalny jadalnyPrawdziwek = new Prawdziwek();
//        Jadalny jadalnyMuchomor = new Muchomor(); // nie można, poneiważ Muchomor nie implementuje intergejsu Jadalny

        Grzyb[] grzyby = {pieczarka, muchomor, prawdziwek,
                grzybMuchomor, grzybPieczarka, grzybPrawdziwek};
        for (Grzyb tymczasowyGrzyb : grzyby) {
            tymczasowyGrzyb.zbierz(); // możemy skorzystać tylko z metod w klasie Grzyb
        }

        Jadalny[] jadalne = {jadalnaPieczarka, jadalnyPrawdziwek,
                pieczarka, prawdziwek};
        for (Jadalny jadalny : jadalne) {
            jadalny.zjedz(); // możemy skorzystać tylko z metod w interfejsie Jadalny
        }
    }
}

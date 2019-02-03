package pl.sda.java.basic.day4.inheritance;

public class Main {
    public static void main(String[] args) {
        // Utworzenie obiektu oraz wypisanie jego cech
        Computer computer = new Computer("Pentium", 8, 300);
        System.out.println(computer.getDiskSizeInGb());
        System.out.println(computer.getProcessorName());
        System.out.println(computer.getRam());
        System.out.println(computer.powerOn());
        System.out.println();

        Laptop laptop = new Laptop("Celeron", 4, 0, false, 15);
        System.out.println(laptop.getDiskSizeInGb());
        System.out.println(laptop.getProcessorName());
        System.out.println(laptop.getRam());
        System.out.println(laptop.powerOn()); // zwróci false bo podaliśmy rozmair dysku 0
        System.out.println();

        Dell dell = new Dell(12, 200, 17);
        System.out.println(dell.getDiskSizeInGb());
        System.out.println(dell.getProcessorName());
        System.out.println(dell.getRam());
        System.out.println(dell.powerOn());
        System.out.println();

        // Laptop to Computer więc jest to dozwolone
        Computer laptopComputer = new Laptop("Celeron", 4, 0, false, 15);
        ((Laptop) laptopComputer).getScreenSize(); // Ostrożnie! Nie mamy dostępu do dodatkowych cech klasy Laptop bo zmienną zadeklarowaliśmy jako typ Computer. Jedyny sposób to użyć rzutowania
        laptopComputer.getRam();

        // Dell to również Computer mimo, że nie dziedziczy po nim bezpośrednio
        Computer dellComputer = new Dell(2, 500, 15);
        ((Dell) dellComputer).getScreenSize();
        dellComputer.powerOn();

        // Wszystkie klasy rozszerzającej Computer możemy przechowywać w jednej tablicy
        Computer[] computers = {computer, laptop, dell, laptopComputer, dellComputer};

        for (Computer temporaryComputer : computers) {
            System.out.println(temporaryComputer.getRam()); // wyświetlenie ilości ram dla wszystkich komputerów w tablicy
        }
    }
}

package pl.sda.java.basic.day4.task5;

public class Main {
    public static void main(String[] args) {
//        Fruit fruit = new Fruit(); // Nie możemy, ponieważ Fruit to klasa abstrakcyjna
        Apple apple = new Apple();
        Cherry cherry = new Cherry();
        Orange orange = new Orange();
        Fruit appleFruit = new Apple(); // Apple to też Fruit
        Fruit cherryFruit = new Cherry();
        Fruit orangeFruit = new Orange();

        Fruit[] fruits = {apple, cherry, orange,
                appleFruit, cherryFruit, orangeFruit};

        for (Fruit temporaryFruit : fruits) {
            System.out.print(temporaryFruit.color() + " ");
            System.out.print(temporaryFruit.size() + " ");
            System.out.print(temporaryFruit.taste() + " ");
            System.out.println();
        }
    }
}

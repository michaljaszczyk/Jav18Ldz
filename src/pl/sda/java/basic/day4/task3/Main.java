package pl.sda.java.basic.day4.task3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3,9,5,8,2};
        MinMaxFinder minMaxFinder = new MinMaxFinder(numbers); // przekazujemy tablicę liczb do konstruktora
        minMaxFinder.printTwoSmallestTwoLargest();
    }
}

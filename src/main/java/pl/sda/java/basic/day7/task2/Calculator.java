package pl.sda.java.basic.day7.task2;

public class Calculator {

//    public int sum(int[] numbers) {
//        int sum = 0;
//        for (int number : numbers) {
////            sum = sum + number;
//            sum += number; // to samo co wyżej
//        }
//        return sum;
//    }

    // obsługa varargs jest w ten sam sposób jak tablica (kod powyżej dla porównania)
    public int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
//            sum = sum + number;
            sum += number; // to samo co wyżej
        }
        return sum;
    }
}

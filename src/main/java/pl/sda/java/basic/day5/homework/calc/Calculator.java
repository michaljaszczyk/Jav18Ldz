package pl.sda.java.basic.day5.homework.calc;

/**
 * @author Michal Jaszczyk
 **/
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(int a, int b) {
        if (b != 0) {
            return (float) a / b;
        } else {
            return 0;
        }
    }

    public int remainder(int a, int b) {
        return a % b;
    }

    public double power(int a, int b) {
        return Math.pow(a, b);
    }

    public int manualPower(int base, int index) {
        if (index == 0) {
            return 1;
        } else {
            int result = base;
            for (int i = 1; i < index; i++) {
                result = result * base;
            }
            return result;
        }
    }

    public int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    public float average(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum / numbers.length;
    }

    public int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
}

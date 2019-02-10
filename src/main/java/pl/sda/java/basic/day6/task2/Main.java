package pl.sda.java.basic.day6.task2;

public class Main {
    public static void main(String[] args) {
        GradeConverter gradeConverter = new GradeConverter();
        System.out.println(gradeConverter.convert(3));
        System.out.println(gradeConverter.convertUsingSwitch(3));
        System.out.println(gradeConverter.convertUsingSwitch2(3));


        for (int i = 0; i < 100; i++) {
            if (i % 12 == 0) {
                break; // całkowicie kończy działanie pętli
            }
        }

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                continue; // pomija dalsze instrukcje w aktualnym przebiegu pętli
            }
            // skomplikowane instrukcje
            System.out.println(i);
        }
    }
}

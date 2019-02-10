package pl.sda.java.basic.day6.task2;

public class GradeConverter {

    public String convert(int grade) {
        if (grade == 1) {
            return "niedostateczny";
        } else if (grade == 2) {
            return "dopuszczający";
        } else if (grade == 3) {
            return "dostateczny";
        } else if (grade == 4) {
            return "dobry";
        } else if (grade == 5) {
            return "bardzo dobry";
        } else if (grade == 6) {
            return "celujący";
        } else {
            return "nieznany";
        }
    }

    public String convertUsingSwitch(int grade) {
        switch (grade) {
            case 1:
                return "niedostateczny";
            case 2:
                return "dopuszczający";
            case 3: {
                return "dostateczny";
            }
            case 4:
                return "dobry";
            case 5:
                return "bardzo dobry";
            case 6:
                return "celujący";
            default:
                return "nieznany";
        }
    }

    public String convertUsingSwitch2(int grade) {
        String result;
        switch (grade) { // wartość do sprawdzania. dopuszczalne są liczby, stringi i enumy
            case 1:
                result = "niedostateczny";
                break; // jeżeli nie ma break lub return to zostaną wykonane wszystkie pozostałe instrukcje w tym switchu
            case 2:
                result = "dopuszczający";
                break;
            case 3: { // można skorzystać z klamer w przypadku bardziej skomplikowanego kodu
                result = "dostateczny";
                break;
            }
            case 4:
                result = "dobry";
                break;
            case 5:
                result = "bardzo dobry";
                break;
            case 6:
                result = "celujący";
                break;
            default:
                result = "nieznany";
                break;
        }
        return result;
    }
}

package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean leapYear;
        switch (year % 4){
            default:
                leapYear = false;
                break;
            case  0:
                if (year % 100 != 0 || year % 400 == 0) {
                    leapYear = true;
                } else {
                    leapYear = false;
                }
                break;
        }



       String days = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield "31";
            }
            case 4, 6, 9, 11 -> {
                yield "30";
            }
            case 2 -> {
               yield leapYear ? "29" : "28";
            }
            default -> {
                yield "invalid date";
            }
        };
        System.out.println(days);
    }
}

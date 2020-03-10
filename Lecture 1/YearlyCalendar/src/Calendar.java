import java.util.*;

public class Calendar {
    private String[] days;

    public Calendar(Integer year) {
        if (year % 4 == 0) {
            days = new String[366];
        } else {
            days = new String[365];
        }
        Integer month = 1;
        Integer day = 1;
        for (int i = 0; i < days.length; i++, day++) {
            days[i] = year.toString() + "-" + month.toString() + "-" + day.toString();
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day.equals(31)) {
                        month++;
                        day = 0;
                    }
                    break;
                case 2:
                    if (year % 4 != 0 && day.equals(28) || day.equals(29)) {
                        month++;
                        day = 0;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day.equals(30)) {
                        month++;
                        day = 0;
                    }
                    break;
            }

        }
    }
/*        if (year % 4 == 0) {
            days = new String[366];
            Integer month = 1;
            Integer day = 1;
            for (int i = 0; i < days.length; i++, day++) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days[i] = year.toString() + "-" + month.toString() + "-" + day.toString();
                        if (day.equals(31)) {
                            month++;
                            day = 0;
                        }
                        break;
                    case 2:
                        days[i] = year.toString() + "-" + month.toString() + "-" + day.toString();
                        if (day.equals(29)) {
                            month++;
                            day = 0;
                        }

                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days[i] = year.toString() + "-" + month.toString() + "-" + day.toString();
                        if (day.equals(30)) {
                            month++;
                            day = 0;
                        }
                        break;
                }
            }
        } else {
            days = new String[365];
            Integer month = 1;
            Integer day = 1;
            for (int i = 0; i < days.length; i++, day++) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days[i] = year.toString() + "-" + month.toString() + "-" + day.toString();
                        if (day.equals(31)) {
                            month++;
                            day = 0;
                        }
                        break;
                    case 2:
                        days[i] = year.toString() + "-" + month.toString() + "-" + day.toString();
                        if (day.equals(29)) {
                            month++;
                            day = 0;
                        }

                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days[i] = year.toString() + "-" + month.toString() + "-" + day.toString();
                        if (day.equals(30)) {
                            month++;
                            day = 0;
                        }
                        break;
                }
            }
        }
*/


    public String[] getCalendarArray() {
        return days;
    }

    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        Calendar calendar = new Calendar(year);
        String[] calendarArray = calendar.getCalendarArray();
        for (String day : calendarArray) {
            System.out.println(day);
        }

    }
}

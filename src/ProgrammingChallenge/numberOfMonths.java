package ProgrammingChallenge;
import java.util.Scanner;

public class numberOfMonths {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number : ");
        //int month = new Scanner(System.in).nextInt();
        int month = scanner.nextInt();
        String monthSelect;
        int daysInMonth;

        switch (month) {
            case 1: monthSelect ="January";
                daysInMonth = 31;
                break;
            case 3: monthSelect = "March";
                daysInMonth = 31;
                break;
            case 5: monthSelect = "May";
                daysInMonth = 31;
                break;
            case 7: monthSelect = "July";
                daysInMonth = 31;
                break;
            case 8: monthSelect = "August";
                daysInMonth = 31;
                break;
            case 10: monthSelect = "October";
                daysInMonth = 31;
                break;
            case 12: monthSelect = "December";
                daysInMonth = 31;
                break;
            case 4: monthSelect = "April";
            daysInMonth = 30;
                break;
            case 6: monthSelect = "June";
            daysInMonth = 30;
                break;
            case 9: monthSelect = "September";
            daysInMonth = 30;
                break;
            case 11: monthSelect = "November";
                daysInMonth = 30;
                break;
            case 2: monthSelect = "February";
                daysInMonth = 28;
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                return;
        }

        System.out.println(monthSelect + " - Number of days in the selected month is: " + daysInMonth);

    }

}

         /*

        System.out.print("Enter the number of month:");
        int month = new Scanner(System.in).nextInt();
        System.out.print("Enter the number of Day:");
        String days = new Scanner(System.in).next();
        String monthString;
        switch (month) {
            case 1:
                monthString = "January" + days;
                break;
            case 2:
                monthString = "February"+ days;
                break;
            case 3:
                monthString = "March"+ days;
                break;
            case 4:
                monthString = "April"+ days;
                break;
            case 5:
                monthString = "May"+ days;
                break;
            case 6:
                monthString = "June"+ days;
                break;
            case 7:
                monthString = "July"+ days;
                break;
            case 8:
                monthString = "August"+ days;
                break;
            case 9:
                monthString = "September"+ days;
                break;
            case 10:
                monthString = "October"+ days;
                break;
            case 11:
                monthString = "November"+ days;
                break;
            case 12:
                monthString = "December"+ days;
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
    }
}*/


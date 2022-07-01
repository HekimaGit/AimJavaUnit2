import java.lang.reflect.Array;
import java.util.Scanner;
public class Assignment2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Message year
        System.out.print("Given a year and a month in that year, this program will tell you the number of days in that month.\nEnter a year: ");
        
        // Input year
        int year = input.nextInt();

        // Find if leap year
        boolean leapyear = false;

        if (year % 4 == 0 && year % 100 != 0) {
            leapyear = true;
        }

        // Message month
        System.out.println("Enter a month (1-12): ");
        
        // Input month
        int month = input.nextInt();
        input.close();

        // User entered an invalid month
        if (month > 12) {
            //System.out.println(Integer.toString(month) + " is invalid. Month values must be between 1 and 12, inclusive.");
            System.out.println("Bye bye!");
            return;
        }

        // Days in the month
        int days = 0;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 2) {
            if (leapyear == true) {
                days = 29;
            }else {
                days = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        }

        String[] months = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        };

        System.out.println(Array.get(months, month - 1) + " of " + Integer.toString(year) + " has " + Integer.toString(days) + " days in it.");
    }
}
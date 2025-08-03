import java.util.Scanner;

public class CalendarDisplay {

    // Array to store the names of the months
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    // Method to get number of days in a month
    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to calculate the first day of the month using Gregorian algorithm
    public static int getStartDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }

    // Method to print the calendar
    public static void printCalendar(int month, int year) {
        System.out.println("\n\t  " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getStartDay(month, year);
        int numDays = getNumberOfDays(month, year);

        // First loop to add indentation for first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Second loop to print the days of the month
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);

            if (((day + startDay) % 7 == 0) || (day == numDays)) {
                System.out.println(); // New line after Saturday or end of month
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1 to 12): ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (month >= 1 && month <= 12 && year > 0) {
            printCalendar(month, year);
        } else {
            System.out.println("Invalid input. Please enter valid month and year.");
        }
    }
}

import java.util.Scanner;

public class CalendarDisplay {

    // Array of month names
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array of days in each month
    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check for leap year
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the name of the month
    static String getMonthName(int month) {
        return months[month];
    }

    // Method to get number of days in the month
    static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to get the first day of the month using Zeller's Congruence
    static int getStartDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }

    // Method to print the calendar
    static void printCalendar(int month, int year) {
        int days = getDaysInMonth(month, year);
        int startDay = getStartDay(month, year);

        System.out.printf("\n   %s %d\n", getMonthName(month), year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First loop: Print initial spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Second loop: Print the days of the month
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);

            if ((i + startDay) % 7 == 0) {
                System.out.println(); // move to next line after Saturday
            }
        }
        System.out.println(); // move to ne

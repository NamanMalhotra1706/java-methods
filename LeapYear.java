import java.util.Scanner;

public class LeapYear{

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        
        if (year < 1582) {
            return false;
        }

        // Leap year is divisible by 4, but not divisible by 100, unless divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input year from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}

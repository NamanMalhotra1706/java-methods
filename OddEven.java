import java.util.Scanner;

public class OddEven {

    // Method to check if the number is positive or negative
    public static String isPositive(int num) {
        if (num > 0) {
            return "positive";
        } else if (num < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    // Method to check if the number is even or odd
    public static String isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;  
        } else if (num1 == num2) {
            return 0;  
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + (i+1) + " number:");
            numbers[i] = sc.nextInt();
        }

        // Check for each number if positive or negative and if positive, check even or odd
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            String positivity = isPositive(num);
            if (positivity.equals("positive")) {
                System.out.println(num + " is positive and " + isEvenOrOdd(num));
            } else if (positivity.equals("negative")) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }

        // Compare the first and last numbers in the array
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("First number is equal to the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }
    }
}

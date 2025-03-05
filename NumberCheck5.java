import java.util.Scanner;

public class NumberCheck5{

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            square /= 10;
            temp /= 10;
        }
        return true;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num + " is prime: " + isPrime(num));
        System.out.println(num + " is neon: " + isNeon(num));
        System.out.println(num + " is spy: " + isSpy(num));
        System.out.println(num + " is automorphic: " + isAutomorphic(num));
        System.out.println(num + " is buzz: " + isBuzz(num));
    }
}

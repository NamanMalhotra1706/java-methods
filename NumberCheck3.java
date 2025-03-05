import java.util.Scanner;

public class NumberCheck3{

    // count digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits of the number in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to find the sum of the digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of squares of the digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] freqArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freqArray[i][0] = i;
        }
        for (int digit : digits) {
            freqArray[digit][1]++;
        }
        return freqArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        
        int[] digitsArray = getDigitsArray(number);
        
        System.out.println("Digit count: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digitsArray));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digitsArray));
        System.out.println("Is Harshad Number? " + isHarshadNumber(number, sumOfDigits(digitsArray)));
        
        int[][] freqArray = findDigitFrequency(digitsArray);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freqArray[i][1] > 0) {
                System.out.println("Digit " + freqArray[i][0] + ": " + freqArray[i][1]);
            }
        }
    }
}
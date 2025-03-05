import java.util.Scanner;

public class NumberCheck {

    // count digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
        // valueOf --> convert the number to string
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

   

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number);

        int st = 0;
        int en=str.length()-1;
        while(st<en){
            if(str.charAt(st)!= str.charAt(en)){
                return false;
            }
            st++;
            en--;
        }

        return true;
    
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(number);
        return numStr.contains("0");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        System.out.println("Digit count: " + countDigits(number));
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
    }
}
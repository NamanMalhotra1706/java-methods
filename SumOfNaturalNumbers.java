import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find the sum of the first n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1; 
        } else {
            return n + sumUsingRecursion(n - 1); 
        }
    }

    // Method to find the sum of the first n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        
        if (n <= 0) {
            System.err.println("Invalid Number");
            System.exit(0);; 
        }

        // Calculate the sum using recursion
        int recursiveSum = sumUsingRecursion(n);

        // Calculate the sum using the formula
        int formulaSum = sumUsingFormula(n);

        // Print both results and compare them
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("The results are same");
        } else {
            System.out.println("The results do not match.");
        }
    }
}

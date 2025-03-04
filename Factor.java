import java.util.Scanner;

public class Factor {

    // Method to find the factors of a number and return them in an array
    public static int[] findFactors(int number) {
        int count = 0;

        // Loop to count how many factors the number has
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // calculate the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // calculate the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // calculate the sum of the squares of the factors
    public static double sumOfSquareOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Find factors
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate and display sum of factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // Calculate and display product of factors
        long product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // Calculate and display sum of squares of factors
        double sumOfSquares = sumOfSquareOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
}

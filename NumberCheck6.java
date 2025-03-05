import java.util.Scanner;

public class NumberCheck6 {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array and return the product
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors) - num; 
        return sum == num;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors) - num; 
        return sum > num;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors) - num; 
        return sum < num;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        
        return sum == originalNum;
    }

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);
        System.out.print("Factors of " + num + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\nGreatest factor of " + num + " is: " + findGreatestFactor(factors));
        System.out.println("Sum of factors of " + num + " is: " + sumOfFactors(factors));
        System.out.println("Product of factors of " + num + " is: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors of " + num + " is: " + productOfCubes(factors));
        System.out.println(num + " is a perfect number: " + isPerfectNumber(num));
        System.out.println(num + " is an abundant number: " + isAbundantNumber(num));
        System.out.println(num + " is a deficient number: " + isDeficientNumber(num));
        System.out.println(num + " is a strong number: " + isStrongNumber(num));


    }
}

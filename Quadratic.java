import java.util.Scanner;
import java.lang.Math;

public class Quadratic {

    // Method to find the roots of a quadratic equation
    public static void findRoots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (delta == 0) {
            double root = -b / (2.0 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root: " + root);
        } else {
            System.out.println("No real roots. Delta is negative.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        // Call the method to find roots
        findRoots(a, b, c);
    }
}

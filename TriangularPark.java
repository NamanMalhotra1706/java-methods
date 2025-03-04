import java.util.Scanner;

public class TriangularPark{

    // Method to calculate the number of rounds 
    public static int athleteRounds(int perimeter, int runInMeter) {
        return runInMeter / perimeter; // Divide the total distance by the perimeter
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take user input

        int sides[] = new int[3]; 
        int runInMeter = 5000; 
        int perimeter = 0; 

        // Loop to take input for each side of the triangle
        for (int i = 0; i < sides.length; i++) {
            System.out.print("Enter the " + (i + 1) + " side of triangle: ");
            sides[i] = sc.nextInt(); 
            perimeter += sides[i]; // Add the side length to the perimeter
        }

        // Calculate the number of rounds required
        int rounds = athleteRounds(perimeter, runInMeter);

        // Print the result
        System.out.println("Athlete need " + rounds + " rounds to complete the 5km run.");
    }
}

import java.util.Scanner;

public class NumberStatus{

    // Method to calculate the number status
    public static int status(int number) {
        if(number > 0) return 1; // Return 1 if the number is positive
        else if(number < 0) return -1; // Return -1 if the number is negative
        return 0; // Return 0 if the number is zero
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number: ");
        int number = sc.nextInt(); 
        
        // Print the result
        System.out.println("Number status: " + status(number));
    }
}

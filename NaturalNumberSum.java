import java.util.Scanner;

public class NaturalNumberSum {

    // Method to calculate the sum of first N natural numbers
    public static int sumOfNNatural(int number){
        return (number*(number+1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();

        // Check if the number is natural (0 or positive)
        if(number>=0){
			System.out.print("The sum of " + number + " natural number is " + sumOfNNatural(number));
		}
		else{
			System.out.print("The number " + number + " is not a natural number");
		}
    }
}

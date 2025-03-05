import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store ages of 10 students
        int arr[] = new int[10];
        
        // Taking input for student ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age: ");
            arr[i] = sc.nextInt();
        }
        
        // Checking and displaying voting eligibility for each student
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student having age " + arr[i] + " can vote? " + canStudentVote(arr[i]));
        }
    }
}

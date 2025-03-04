import java.util.Scanner;

public class Handshakes {
    // Method to calculate the number of handshakes
    public static int noOfHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        //number of students
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        //Calculating the number of handshakes
        int handshakes = noOfHandshakes(students);

        //Printing the result
        System.out.println("Number of handshakes among " + students + " students are: " + handshakes);
    }
}

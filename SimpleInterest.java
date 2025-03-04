import java.util.Scanner;

public class SimpleInterest {

    //Method to calculate and print simple interest
    public static void simpleInterest(int principal, int rate, int time){
        int interest = (principal*rate*time)/100;
        System.out.println("The Simple Interest is " + interest +" for Principal "+ principal+", Rate of Interest " + rate +" and Time " + time );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Taking principal amount as input
         System.out.print("Enter the principal: ");
         int principal = sc.nextInt();
 
         // Taking rate of interest as input
         System.out.print("Enter the rate: ");
         int rate = sc.nextInt();
 
         // Taking time period as input
         System.out.print("Enter the time: ");
         int time = sc.nextInt();
 
         // Calling the method to calculate and display the simple interest
         simpleInterest(principal, rate, time);
    }
}

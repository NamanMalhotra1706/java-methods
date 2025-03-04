import java.util.Scanner;

public class SimpleInterest {

    public static void simpleInterest(int principal, int rate, int time){
        int interest = (principal*rate*time)/100;
        System.out.println("The Simple Interest is " + interest +" for Principal "+ principal+", Rate of Interest " + rate +" and Time " + time );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        int principal = sc.nextInt();

        System.out.print("Enter the rate: ");
        int rate = sc.nextInt();

        System.out.print("Enter the time: ");
        int time = sc.nextInt();

        simpleInterest(principal,rate,time);
    }
}

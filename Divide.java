import java.util.Scanner;

public class Divide {

    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = number/divisor;
		int reminder = number%divisor;

        return new int[]{quotient,reminder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Divisor: ");
		int divisor = sc.nextInt();
		
		System.out.print("Enter the Divident: ");
		int divident = sc.nextInt();

        System.out.print("The Quotient is " + findRemainderAndQuotient(divident, divisor)[0] +" and reminder is " + findRemainderAndQuotient(divident, divisor)[1] + " of two number " + divident + " and " + divisor );
    }
}

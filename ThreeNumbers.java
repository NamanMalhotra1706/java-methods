import java.util.Scanner;
import java.lang.Math;

public class ThreeNumbers {

    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int result[] = new int[2];

        int maxEle = Math.max(number1,Math.max(number2, number3));
        int minEle = Math.min(number1,Math.min(number2, number3));

        result[0] = maxEle;
        result[1] = minEle;

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter the number: ");
		int number2 = sc.nextInt();
		
		System.out.print("Enter the number: ");
		int number3 = sc.nextInt();

        int ans[] = findSmallestAndLargest(number1, number2, number3);

        System.out.println("Maximum is: " + ans[0]);
        System.out.println("Minimum is : " + ans[1]);
    }
}

import java.util.Scanner;

class IsSpringSeason{
    // Method to check if the given date falls in the spring season

	public static void checkSpring(String month, int date ){
        if(month.equals("march") && ( date >=20 && date<=31)){
			System.out.print("Its a Spring Season");
            return;
		}
		else if((month.equals("april") || month=="may") && ( date >=1 && date<=31)){
			System.out.print("Its a Spring Season");
            return;
		}
		else if(month.equals("june") && ( date >=1 && date<=20)){
			System.out.print("Its a Spring Season");
            return;
		}
		else{
			System.out.print("Its not a Spring Season");
            return;
		}
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month: ");
		String month = sc.next().toLowerCase(); // Convert the input to lowercase for consistency
		
		
		System.out.print("Enter the date: ");
		int date = sc.nextInt();

        checkSpring(month, date);	// Call the method to check if it's spring season			
	}
}
import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {

		// Create a new Scanner object
		Scanner scan = new Scanner(System.in);

		int userIn;
		// Read in integer

		System.out.print("Enter an integer greater than 2: ");
		userIn = scan.nextInt();

		// Print error message if input >2
		while (userIn < 2) {
			System.out.println("Error: please enter an integer greater than 2");
			System.out.println();
			System.out.print("Enter integer greater than 2: ");
			userIn = scan.nextInt();
		}

		// Stop scan from awaiting further input
		scan.close();

		System.out.println();
	
		// Print sum of all even integers between 2 and input value (inclusive)

		int sum = 0;

		for (int even = 2; even <= userIn; even += 2) {
			sum += even;
		}
		
		System.out.println("Even Numbers Sum = " + sum);
	}

}

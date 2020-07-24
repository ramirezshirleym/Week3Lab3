import java.util.Scanner;
import java.util.Random;

public class AgeGuess {

	public static void main(String[] args) {

		// Create a new Scanner object
		Scanner scan = new Scanner(System.in);

		String name;
		int ageGuess, age;


		// Generate a random integer for the correct age
		Random generator = new Random();
		age = generator.nextInt(101);

		// Read in the name entered by user
		System.out.print("Enter a name: ");
		name = scan.nextLine();
		System.out.println();

		// Read in the age guess entered by user
		System.out.print("Guess " + name + "'s age: ");
		ageGuess = scan.nextInt();

		// while Statement
		while (ageGuess != age) {
			System.out.println("You guessed wrong! Try again!");
			System.out.println();
			System.out.print("Guess " + name + "'s age: ");
			ageGuess = scan.nextInt();
		}

		System.out.print("You guessed correctly!");

		// Stop scan from awaiting further input
		scan.close();

	}

}

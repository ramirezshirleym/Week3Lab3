import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {

		// Create a new Scanner object
		Scanner scan = new Scanner(System.in);

		// Read in user's string
		System.out.print("Enter a string: ");
		String userString = scan.nextLine();

		// Stop scan from awaiting further input
		scan.close();

		// Count vowels
		int stringLength = userString.length();
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		int nonVowel = 0;

		for (int index = 0; index < stringLength; index++) {
			char currentChar = userString.charAt(index);

			switch (currentChar) {
			case 'a':
				countA++;
				break;
			case 'e':
				countE++;
				break;
			case 'i':
				countI++;
				break;
			case 'o':
				countO++;
				break;
			case 'u':
				countU++;
				break;
			default:
				nonVowel++;
			}
		}
		
		System.out.println("string length: " + stringLength);
		System.out.println("a count: " + countA);
		System.out.println("e count: " + countE);
		System.out.println("i count: " + countI);
		System.out.println("o count: " + countO);
		System.out.println("u count: " + countU);
		System.out.println("non lowercase vowel count: " + nonVowel);

	}
}
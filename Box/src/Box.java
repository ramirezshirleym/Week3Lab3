
public class Box {

	// Declare instance variable with default value
	public int size = 0;

	public static void main(String[] args) {

		// Create new Box object
		Box starBox = new Box();

		// Change size to 5 for starBox object
		starBox.size = 5;

		// Invoke printBox method
		starBox.printBox();
	}

	// Define printBox instance method
	public void printBox() {
		for (int row = 1; row <= size; row++) {

			for (int col = 1; col <= size; col++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}

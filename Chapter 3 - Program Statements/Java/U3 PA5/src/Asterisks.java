/**
 * Created by Trey Jenkins on October 15, 2019 at 03:53
 *
 * Objective: To generate asterisks
 **/


public class Asterisks {
	public static void main(String[] args) {

		partA();
		partB();
		partC();
		partD();
		partE();

	}

	/**
	 * Print the asterisks pattern in Part A
	 */
	private static void partA() {
		System.out.println("Part A\n");

		for (int i = 0; i <= 10; i++) { // Ten lines
			for (int v = 0; v < i; v++) { // i asterisks per line
				System.out.print("*");
			}
			System.out.println();
		}

	}

	/**
	 * Print the asterisks pattern in Part B
	 */
	private static void partB() {
		System.out.println("\nPart B\n");

		for (int i = 10; i >= 0; i--) { // Ten lines, in reverse
			for (int v = 0; v < i; v++) { // i asterisks per line
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * Print the asterisks pattern in Part C
	 */
	private static void partC() {
		System.out.println("\nPart C\n");

		for (int i = 0; i <= 10; i++) { // Ten lines
			for (int k = 0; k < 10 - i; k++) // right align by printing whitespace
				System.out.print(" ");
			for (int v = 0; v < i; v++) { // i asterisks per line
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * Print the asterisks pattern in Part D
	 */
	private static void partD() {
		System.out.println("\nPart D\n");

		for (int i = 10; i >= 0; i--) { // Ten lines, in reverse
			for (int k = 0; k < 10 - i; k++) // right align by printing whitespace
				System.out.print(" ");
			for (int v = 0; v < i; v++) { // i asterisks per line
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * Print the asterisks pattern in Part E
	 */
	private static void partE() {
		System.out.println("\nPart E\n");

		final int MAX = 13; // Maximum number of asterisks to put on a line

		for (int i = 1; i < MAX; i += 2) {
			int whitespace = (MAX / 2) - (i / 2); // Calculate the amount of whitespace needed to center the asterisks
			for (int v = 0; v < whitespace; v++)
				System.out.print(" "); // print whitespace
			for (int v = 0; v < i; v++) // print asterisks
				System.out.print("*");
			System.out.println();
		}
		for (int i = MAX; i > 0; i -= 2) {
			int whitespace = (MAX / 2) - (i / 2); // Calculate the amount of whitespace needed to center the asterisks
			for (int v = 0; v < whitespace; v++)
				System.out.print(" "); // print whitespace
			for (int v = 0; v < i; v++) // print asterisks
				System.out.print("*");
			System.out.println();
		}

	}
}

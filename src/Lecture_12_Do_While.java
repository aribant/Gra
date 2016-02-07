import java.util.InputMismatchException;
import java.util.Scanner;

public class Lecture_12_Do_While {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		/*
		 * System.out.println("Enter a number: "); int value =
		 * scanner.nextInt();
		 * 
		 * while(value != 5) { System.out.println("Enter a number: "); value =
		 * scanner.nextInt(); }
		 */

		int value = 0; // variable "value" is set to zero.
		do {
			System.out.println("Enter a number: ");
			try {
				value = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Numbers only please. Reload program");
				return;
			}
			// the variable "value" is set to the
			// next user input.
		} while (value != 5); // The loop will repeat until the user enters "5"

		System.out.println("Got 5!");
	}

}

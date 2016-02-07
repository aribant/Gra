import java.util.Scanner; // A simple text scanner which can parse primitive types and strings using regular expressions. 

public class Lecture_11_Getting_User_Input {
	public static void main(String[] args) {

		// Create scanner object
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// Output the prompt
		System.out.println("Enter a floating point value: ");

		// Wait for the user to enter something.
		double value = input.nextDouble();

		// Tell them what they entered.
		System.out.println("You entered: " + value);
	}
}

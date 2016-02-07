import java.util.Scanner; //A simple text scanner which can parse primitive types and strings using regular expressions. 

public class Lecture_13_Switch {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); // creates scanner

		System.out.println("Please enter a command: ");
		String text = input.nextLine(); // user input is set to a String type
										// variable called text

		switch (text) {
		case "start": // If the user enters "start" it prints "Machine Started!" and terminates the program.
			System.out.println("Machine started!");
			break;

		case "stop": // If the user enters "stop" the program prints out"Machine
						// stopped." and terminates the program.
			System.out.println("Machine stopped.");
			break;

		default: // If the user prints something besides the two words mentioned above it will end the program.
			System.out.println("Command not recognized");
		}

	}

}

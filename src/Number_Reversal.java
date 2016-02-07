import java.util.Scanner;

public class Number_Reversal {

	public static void main(String args[]) {

		System.out.println("---------------- Number Reversal ---------------");
		System.out.println(" Hello! This application will reverse the number you enter.\n");
		System.out.print(" Please enter a number between 1 and 999999999: \n"); // Define limits of the program to prevent errors.
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		int input = read.nextInt();                     // Takes user input as an int called "input"
		if (input % 10 == 0) {                          // If "input" ends in zero run this loop
			System.out.print(" The reverse of " + input + " is: ");
			int temp = input;
			for (int i = 1; i <= 9; i++) { 
				System.out.print(0);
				temp = temp / 10;
				if (temp % 10 != 0) {
					break;
				}
			}
			System.out.println(REV(input));
		} else {
			System.out.println(" The reverse of " + input + " is: " + REV(input));
		}
	}

	static int REV(int n) {

		long Temp, RevNumber = 0;
		Temp = n;
		while (Temp > 0) { // If the number does NOT end in zero this loop runs
			RevNumber = (RevNumber * 10) + (Temp % 10); // move everything left by 1 + take the left most digit
			Temp = Temp / 10; // remove rightmost digit

		}
		return (int) RevNumber;

	}

}
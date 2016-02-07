
public class Lecture_10_if {
	public static void main(String[] args) {

		// Some useful conditions:
		System.out.println(5 == 6); // equality
		System.out.println(10 != 11); // equality
		System.out.println(3 < 6); // less than
		System.out.println(10 > 100); // greater than

		// Using loops with "break":
		int loop = 0;

		while (true) {// code between brackets runs while true
			System.out.println("Looping: " + loop);

			if (loop == 3) { // variable loop is set to 0, each time the loop
								// iterates one is added, once loop reaches 3
								// the loop breaks.
				break;
			}

			loop++;

			System.out.println("Running");
		}
	}
}

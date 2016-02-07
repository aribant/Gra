import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DifferenceInDates {

	public static void main(String[] args) {

		
		// prompt the user to enter a date
		System.out.println(" ----------- Difference between days -------------- \n");
		System.out.println("This program will ask you for two dates in order to determine their difference.");
		System.out.print("Using the format: yyyy/MM/dd please enter the larger date \n");

		// open up standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String userDate = null;
		// read the date from the command-line.
		try {
			userDate = br.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read date.");
			System.exit(1);
		}

		String pattern = "yyyy/MM/dd";
		SimpleDateFormat sdf = new SimpleDateFormat();
		Date date1 = null;
		try {
			sdf.setLenient(false);
			sdf.applyPattern(pattern);
			date1 = sdf.parse(userDate);
		} catch (ParseException e) {
			System.out.println("Wrong date format. Please try again.");
			e.printStackTrace();
			getDate();
		}

		// prompt the user to enter a date
		System.out.print("Using the format: yyyy/MM/dd please enter the smaller date \n");

		// open up standard input
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		String userDate1 = null;
		// read the date from the command-line.
		try {
			userDate1 = br1.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read date.");
			System.exit(1);
		}

		String pattern1 = "yyyy/MM/dd";
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		Date date2 = null;
		try {
			sdf1.setLenient(false);
			sdf1.applyPattern(pattern1);
			date2 = sdf1.parse(userDate1);
		} catch (ParseException e) {
			System.out.println("Wrong date format. Please try again.");
			e.printStackTrace();
			getDate();
		}
		int difInDays = (int) ((date1.getTime() - date2.getTime()) / (1000 * 60 * 60 * 24));
		System.out.println("The difference in YEARS: " + difInDays / 365.25);
		System.out.println("The difference in MONTHS: " + difInDays / 29.6041667);
		System.out.println("The difference in DAYS: " + difInDays);
		System.out.println(" ----------- The End -----------");
	}

	private static void getDate() {
		// TODO Auto-generated method stub

	}
}


public class Lecture_6_Using_Variables {

	public static void main(String[] args) {

		int myNumber = 88; // int is an Integer (32 bits), myNumber (second word
							// starts with an Upper case letter by convention.)
							// is the name of the variable.
							// = 88 initializes the variable with the value of
							// 88

		short myShort = 847; // short (16bits)

		long myLong = 9797; // long (64 bits)

		double myDouble = 7.32443; // double (64 bit precision IEEE 754 floating
									// point numbers. No fixed number of digits
									// before or after the decimal point.)

		float myFloat = 324.3f; // float (32 bit precision IEEE 754 floating
								// point)

		char myChar = 'y'; // char ( characters )

		boolean myBoolean = false; // boolean ( true or false )

		byte myByte = 127; // byte (8bit) Small range of numbers: -128 to
							// 127(inclusive) useful for saving memory in large
							// arrays.

		System.out.println(myNumber);

		System.out.println(myShort);

		System.out.println(myLong);

		System.out.println(myDouble);

		System.out.println(myFloat);

		System.out.println(myChar);

		System.out.println(myBoolean);

		System.out.println(myByte);

	}

}

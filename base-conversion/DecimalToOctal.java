package com.javamultiplex.number.baseconversion;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Base Conversion
 * @problem Convert Decimal to Octal
 *
 */
public class DecimalToOctal {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter decimal number : ");
			String number = input.next();

			if (isDecimalNumber(number)) {
				String octal = getOctalNumber(number);
				System.out.println("Octal number : " + octal);
			} else {
				System.out.println("Please enter valid decimal number.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

	private static String getOctalNumber(String number) {

		// Converting String to Integer.
		int decimal = Integer.parseInt(number);
		int remainder = 0;
		StringBuilder octal = new StringBuilder();
		while (decimal != 0) {
			remainder = decimal % 8;
			// Converting Integer to String and adding into StringBuilder.
			octal.append(String.valueOf(remainder));
			decimal = decimal / 8;
		}

		// Reverse String using library function of StringBuilder class.
		return octal.reverse().toString();
	}

	private static boolean isDecimalNumber(String number) {

		// Regular expression that matches String containing only digits [0-9].
		String pattern = "^[0-9]+$";
		boolean result = false;
		if (number.matches(pattern)) {
			result = true;
		}
		return result;
	}

}

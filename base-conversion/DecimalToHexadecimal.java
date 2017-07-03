package com.javamultiplex.number.baseconversion;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Base Conversion
 * @problem Convert Decimal to Hexadecimal
 *
 */
public class DecimalToHexadecimal {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter decimal number : ");
			String number = input.next();

			if (isDecimalNumber(number)) {
				String hexadecimal = getHexadecimalNumber(number);
				System.out.println("Hexadecimal number : " + hexadecimal);
			} else {
				System.out.println("Please enter valid decimal number.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

	private static String getHexadecimalNumber(String number) {

		// Converting String to Integer.
		int decimal = Integer.parseInt(number);
		int remainder = 0;
		StringBuilder hexadecimal = new StringBuilder();
		String result;
		while (decimal != 0) {
			remainder = decimal % 16;
			if (remainder >= 10 && remainder <= 15) {
				char hexChar = getHexadecimalCharacter(remainder);
				// Convert char to String.
				result = String.valueOf(hexChar);
			} else {
				// Convert int to String.
				result = String.valueOf(remainder);
			}
			// Add string to StringBuilder.
			hexadecimal.append(String.valueOf(result));
			decimal = decimal / 16;
		}

		// Reverse String using library function of StringBuilder class.
		return hexadecimal.reverse().toString();
	}

	private static char getHexadecimalCharacter(int remainder) {

		char ch = '\u0000';
		switch (remainder) {
		case 10:
			ch = 'A';
			break;
		case 11:
			ch = 'B';
			break;
		case 12:
			ch = 'C';
			break;
		case 13:
			ch = 'D';
			break;
		case 14:
			ch = 'E';
			break;
		case 15:
			ch = 'F';
			break;
		}
		return ch;
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

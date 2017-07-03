package com.javamultiplex.number.baseconversion;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Base Conversion
 * @problem Convert Binary to Octal
 *
 */
public class BinaryToOctal {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter binary number : ");
			String number = input.next();
			if (isBinaryNumber(number)) {
				String octal = getOctalFromBinaryNumber(number);
				System.out.println("Octal Number : " + octal);
			} else {
				System.out.println("Please enter valid binary number.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

	private static String getOctalFromBinaryNumber(String number) {

		// Convert Binary to Decimal.
		int decimal = getDecimalFromBinaryNumber(number);
		// Convert Decimal to Octal.
		String octal = getOctalFromDecimalNumber(decimal);
		return octal;
	}

	private static String getOctalFromDecimalNumber(int decimal) {

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

	private static int getDecimalFromBinaryNumber(String number) {

		// Converting String to StringBuilder.
		StringBuilder string = new StringBuilder(number);
		string = string.reverse();
		int length = string.length();
		int digit, power, sum = 0;
		for (int i = 0; i < length; i++) {
			digit = string.charAt(i) - 48;
			power = (int) Math.pow(2, i);
			sum = sum + digit * power;
		}
		return sum;
	}

	private static boolean isBinaryNumber(String number) {

		/*
		 * Regular expression that matches string containing only binary
		 * digits[0-1].
		 */
		String pattern = "^[01]+$";
		boolean result = false;
		if (number.matches(pattern)) {
			result = true;
		}
		return result;
	}

}

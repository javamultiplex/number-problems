package com.javamultiplex.number.baseconversion;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Base Conversion
 * @problem Convert Octal to Binary
 *
 */
public class OctalToBinary {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter octal number : ");
			String number = input.next();
			if (isOctalNumber(number)) {
				String binary = getBinaryFromOctalNumber(number);
				System.out.println("Binary Number : " + binary);
			} else {
				System.out.println("Please enter valid octal number.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

	private static String getBinaryFromOctalNumber(String number) {

		// Convert Octal to Decimal
		int decimal = getDecimalFromOctalNumber(number);
		// Convert Decimal to Binary
		String binary = getBinaryFromDecimalNumber(decimal);
		return binary;
	}

	private static String getBinaryFromDecimalNumber(int decimal) {

		int remainder = 0;
		StringBuilder binary = new StringBuilder();
		while (decimal != 0) {
			remainder = decimal % 2;
			// Converting Integer to String and adding into StringBuilder.
			binary.append(String.valueOf(remainder));
			decimal = decimal / 2;
		}

		// Reverse String using library function of StringBuilder class.
		return binary.reverse().toString();
	}

	private static int getDecimalFromOctalNumber(String number) {

		// Converting String to StringBuilder.
		StringBuilder string = new StringBuilder(number);
		string = string.reverse();
		int length = string.length();
		int digit, power, sum = 0;
		for (int i = 0; i < length; i++) {
			digit = string.charAt(i) - 48;
			power = (int) Math.pow(8, i);
			sum = sum + digit * power;
		}
		return sum;
	}

	private static boolean isOctalNumber(String number) {

		/*
		 * Regular expression that matches string containing only octal
		 * digits[0-7].
		 */
		String pattern = "^[0-7]+$";
		boolean result = false;
		if (number.matches(pattern)) {
			result = true;
		}
		return result;
	}

}

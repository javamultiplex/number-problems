package com.javamultiplex.number.baseconversion;

import java.util.Scanner;

public class BinaryToHexadecimal {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter binary number : ");
			String number = input.next();
			if (isBinaryNumber(number)) {
				String hexadecimal = getHexadecimalFromBinaryNumber(number);
				System.out.println("Hexadecimal Number : " + hexadecimal);
			} else {
				System.out.println("Please enter valid binary number.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

	private static String getHexadecimalFromBinaryNumber(String number) {

		// Convert Binary to Decimal
		int decimal = getDecimalFromBinaryNumber(number);
		// Convert Decimal to Hexadecimal
		String hexadecimal = getHexadecimalFromDecimalNumber(decimal);
		return hexadecimal;
	}

	private static String getHexadecimalFromDecimalNumber(int decimal) {

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

	private static int getDecimalFromBinaryNumber(String number) {
		/*
		 * Converting String to StringBuilder.
		 */
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

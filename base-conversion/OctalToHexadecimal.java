package com.javamultiplex.number.baseconversion;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Base Conversion
 * @problem Convert Octal to Hexadecimal
 *
 */
public class OctalToHexadecimal {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter octal number : ");
			String number = input.next();
			if (isOctalNumber(number)) {
				String hexadecimal = getHexadecimalFromOctalNumber(number);
				System.out.println("Hexadecimal Number : " + hexadecimal);
			} else {
				System.out.println("Please enter valid octal number.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

	private static String getHexadecimalFromOctalNumber(String number) {

		// Convert Octal to Decimal
		int decimal = getDecimalFromOctalNumber(number);
		// Convert Decimal to Hexadecimal
		String hexadecimal=getHexadecimalFromDecimalNumber(decimal);
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
	
}

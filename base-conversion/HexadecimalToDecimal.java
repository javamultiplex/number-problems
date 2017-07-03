package com.javamultiplex.number.baseconversion;

import java.util.Scanner;

public class HexadecimalToDecimal {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter hexadecimal number : ");
			String number = input.next();
			if (isHexadecimalNumber(number)) {
				int decimal = getDecimalNumber(number);
				System.out.println("Decimal Number : " + decimal);
			} else {
				System.out.println("Please enter valid hexadecimal number.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

	private static int getDecimalNumber(String number) {

		/*
		 * Converting String to StringBuilder.
		 */
		StringBuilder string = new StringBuilder(number);
		string = string.reverse();
		int length = string.length();
		int digit, power, sum = 0;
		for (int i = 0; i < length; i++) {
			if (Character.isDigit(string.charAt(i))) {
				digit = string.charAt(i) - 48;
			} else {
				digit = getHexadecimalCharacterDigit(string.charAt(i));
			}
			power = (int) Math.pow(16, i);
			sum = sum + digit * power;

		}
		return sum;
	}

	private static int getHexadecimalCharacterDigit(char ch) {

		int digit = 0;
		switch (ch) {
		case 'A':
		case 'a':
			digit = 10;
			break;
		case 'B':
		case 'b':
			digit = 11;
			break;
		case 'C':
		case 'c':
			digit = 12;
			break;
		case 'D':
		case 'd':
			digit = 13;
			break;
		case 'E':
		case 'e':
			digit = 14;
			break;
		case 'F':
		case 'f':
			digit = 15;
			break;
		}

		return digit;
	}

	private static boolean isHexadecimalNumber(String number) {

		/*
		 * Regular expression that matches string containing only digits [0-9]
		 * and alphabets [A-F] or [a-f]
		 */
		String pattern = "^[0-9a-fA-F]+$";
		boolean result = false;
		if (number.matches(pattern)) {
			result = true;
		}
		return result;
	}

}

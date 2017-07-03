package com.javamultiplex.number;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter number : ");
			String num = input.next();
			if (isValidNumber(num)) {

				int length = num.length();
				int temp = 0, sum = 0;
				for (int i = 0; i < length; i++) {
					// Converting char to int.
					temp = num.charAt(i) - 48;
					sum += temp * temp * temp;
				}
				// Converting int to String.
				String finalSum = String.valueOf(sum);
				if (num.equals(finalSum)) {
					System.out.println(num + " is an Armstrong number.");
				} else {
					System.out.println(num + " is not an Armstrong number.");
				}

			} else {
				System.out.println("Please enter valid number.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

	private static boolean isValidNumber(String num) {

		String pattern = "^[0-9]+$";
		boolean result = false;
		if (num.matches(pattern)) {
			result = true;
		}
		return result;
	}

}
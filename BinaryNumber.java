package com.javamultiplex.number;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @problem Number is binary or not
 *
 */
public class BinaryNumber {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter number : ");
			String number = input.next();
			/*
			 * Regular expression that matches string containing only
			 * digits[0-9].
			 */
			String pattern1 = "^[0-9]+$";
			if (number.matches(pattern1)) {
				/*
				 * Regular expression that matches string containing only binary
				 * digits[0-1].
				 */
				String pattern2 = "^[01]+$";
				if (number.matches(pattern2)) {
					System.out.println("It is binary.");
				} else {
					System.out.println("It is not binary.");
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

}

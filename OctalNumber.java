package com.javamultiplex.number;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @problem Number is octal or not
 *
 */
public class OctalNumber {

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
				 * Regular expression that matches string containing only octal
				 * digits[0-7].
				 */
				String pattern2 = "^[0-7]+$";
				if (number.matches(pattern2)) {
					System.out.println("It is octal.");
				} else {
					System.out.println("It is not octal.");
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

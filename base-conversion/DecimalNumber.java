package com.javamultiplex.number.baseconversion;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @problem Number is decimal or not
 *
 */
public class DecimalNumber {

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
				System.out.println("It is decimal.");
			} else {
				System.out.println("It is not decimal.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

}

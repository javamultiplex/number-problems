package com.javamultiplex.number;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @problem Number is hexadecimal or not
 *
 */
public class HexadecimalNumber {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter number : ");
			String number = input.next();
			/*
			 * Regular expression that matches string containing digits [0-9] and
			 * alphabets [A-F] or [a-f].
			 */
			String pattern1 = "^[0-9A-Fa-f]+$";
			if (number.matches(pattern1)) {
				System.out.println("It is hexadecimal");
			} else {
				System.out.println("It is not hexadecimal.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

}

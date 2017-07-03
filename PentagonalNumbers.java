package com.javamultiplex.number;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Number Questions
 * @level Basic
 * @problem How to generate first N pentagonal numbers?
 *
 */
public class PentagonalNumbers {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter value of N : ");
			int limit = input.nextInt();
			int pentagonal = 0;
			System.out.println("Pentagonal numbers are : ");
			for (int n = 1; n <= limit; n++) {
				pentagonal = (n * (3 * n - 1)) / 2;
				System.out.print(pentagonal + " ");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}
}

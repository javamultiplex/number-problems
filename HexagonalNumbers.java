package com.javamultiplex.number;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Number Questions
 * @level Basic
 * @problem How to generate first N hexagonal numbers?
 *
 */
public class HexagonalNumbers {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter value of N : ");
			int limit = input.nextInt();
			int hexagonal = 0;
			System.out.println("Hexagonal numbers are : ");
			for (int n = 1; n <= limit; n++) {
				hexagonal = n * (2 * n - 1);
				System.out.print(hexagonal + " ");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

}
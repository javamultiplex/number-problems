package com.javamultiplex.number;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Number Problems
 * @problem How to calculate factorial of large number?
 *
 */
public class FactorialOfLargeNumber {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter number : ");
			int num = input.nextInt();
			BigInteger result = getFactorial(num);
			System.out.println("Factorial is : " + result);
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

	private static BigInteger getFactorial(int num) {

		// Converting int to String.
		String number = String.valueOf(num);
		// Converting String to BigInteger.
		BigInteger n = new BigInteger(number);
		// ZERO=0
		BigInteger ZERO = BigInteger.ZERO;
		// ONE=1
		BigInteger ONE = BigInteger.ONE;
		// fact=1
		BigInteger fact = BigInteger.ONE;
		// while(n!=0)
		while (!(n.equals(ZERO))) {
			// fact=fact*n
			fact = fact.multiply(n);
			// n=n-1
			n = n.subtract(ONE);
		}
		return fact;
	}

}
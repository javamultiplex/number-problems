package com.javamultiplex.number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rohit Agarwal
 * @category Number Problems
 * @problem Print all the divisors of given number
 *
 */
public class Divisors {

	public static void main(String[] args) {

		Scanner input = null;
		List<Integer> list = new ArrayList<>();
		try {
			input = new Scanner(System.in);
			System.out.println("Enter number :");
			int num = input.nextInt();
			int limit = (int) Math.sqrt(num);
			int temp = 0;
			for (int i = 1; i <= limit; i++) {
				if (num % i == 0) {
					list.add(i);
					temp = num / i;
					if (i != temp) {
						list.add(temp);
					}
				}
			}
			// Sorting list elements.
			Collections.sort(list);
			int divisors = list.size();
			System.out.println("There are " + divisors + " divisors : " + list);
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

}
package com.javamultiplex.number.baseconversion;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Base Conversion
 * @problem Convert Decimal to Binary, Octal and Hexadecimal
 */

public class DecimalToOtherBaseUsingIntegerClass {

	public static void main(String[] args) {
		
		Scanner input=null;
		try
		{
			input=new Scanner(System.in);
			System.out.println("Enter decimal number : ");
			String decimal=input.next();
			if (isDecimalNumber(decimal)) {
				
				int dec=Integer.parseInt(decimal);
				//Decimal to Binary conversion
				String binary=Integer.toBinaryString(dec);
				System.out.println("Binary number : "+binary);
				//Decimal to Octal conversion
				String octal=Integer.toOctalString(dec);
				System.out.println("Octal number : "+octal);
				//Decimal to Hexadecimal conversion
				String hexadecimal=Integer.toHexString(dec);
				System.out.println("Hexadecimal number : "+hexadecimal);
			} else {
				System.out.println("Please enter valid decimal number.");
			}
		}
		finally
		{
			if(input!=null)
			{
				input.close();
			}
		}
		
	}
	
	private static boolean isDecimalNumber(String number) {

		// Regular expression that matches String containing only digits [0-9].
		String pattern = "^[0-9]+$";
		boolean result = false;
		if (number.matches(pattern)) {
			result = true;
		}
		return result;
	}
	
}

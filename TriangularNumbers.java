package com.javamultiplex.number;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Questions on Number
 * @problem How to generate first N triangular numbers?
 *
 */
public class TriangularNumbers {

 public static void main(String[] args) {

  Scanner input = null;
  try {
   input = new Scanner(System.in);
   System.out.println("Enter value of N : ");
   int limit = input.nextInt();
   int triangular = 0;
   System.out.println("Triangular numbers are : ");
   for (int n = 1; n <= limit; n++) {
    triangular = (n * (n + 1)) / 2;
    System.out.print(triangular + " ");
   }
  } finally {
   if (input != null) {
    input.close();
   }
  }

 }

}
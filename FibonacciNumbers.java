package com.javamultiplex.number;

import java.util.Scanner;

/**
 * 
 * @author Rohit Agarwal
 * @category Number Problems
 * @problem How to get first n fibonacci numbers?
 *
 */
public class FibonacciNumbers {

 public static void main(String[] args) {

  Scanner input = null;
  try {
   input = new Scanner(System.in);
   System.out.println("Enter limit : ");
   int limit = input.nextInt();
   if (limit >= 2) {
    int fib[] = new int[limit];
    fib[0] = 1;
    fib[1] = 1;
    for (int i = 2; i < limit; i++) {
     fib[i] = fib[i - 1] + fib[i - 2];
    }
    System.out.println("First " + limit + " Fibonacci numbers are : ");
    for (int i = 0; i < limit; i++) {
     System.out.print(fib[i] + " ");
    }
   } else {
    System.out.println("Limit should be >= 2");
   }
  } finally {
   if (input != null) {
    input.close();
   }
  }

 }

}
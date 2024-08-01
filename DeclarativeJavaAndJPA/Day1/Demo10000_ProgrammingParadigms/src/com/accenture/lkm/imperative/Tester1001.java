package com.accenture.lkm.imperative;

public class Tester1001 {
	public static void main(String[] args) {
		printTable(5);
	}
	
	public static void printTable(int n) {
		/* In the below for loop, the program instructs to perform the operation to print 
		 * n-th table passed as argument.
		 * Here programmer defines what to perform and how to perform - Imparative program
		 * - variable i declaration, increment and terminator condition - 
		 */
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " X " + n + " = " + (i * n));
		}
	}

}

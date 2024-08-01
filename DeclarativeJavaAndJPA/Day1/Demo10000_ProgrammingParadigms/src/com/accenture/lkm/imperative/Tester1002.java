package com.accenture.lkm.imperative;

public class Tester1002 {
	public static void main(String[] args) {
		printArray();
	}
	
	public static void printArray() {
		
		Integer[] numbers = {1, 2, 3, 4, 5};
		
		// print even numbers from the above array
		
		for(int index = 0; index < numbers.length; index++) {
			if(numbers[index] % 2 == 0) {
				System.out.println(numbers[index]);
			}
		}
	}

}

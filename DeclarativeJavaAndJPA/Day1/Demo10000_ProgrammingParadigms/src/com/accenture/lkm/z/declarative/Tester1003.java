package com.accenture.lkm.z.declarative;

import java.util.Arrays;
import java.util.List;

public class Tester1003 {
	public static void main(String[] args) {
		printArray();
	}
	
	public static void printArray() {
		
		Integer[] numbers = {1, 2, 3, 4, 5};
		
		// print even numbers from the above array
		
		
		List<Integer> numbersList = Arrays.asList(numbers);
		numbersList.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
		
		
		
	}

}

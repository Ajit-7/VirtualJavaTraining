package com.accenture.lkm;

public class Tester1002 {
	public static void main(String[] args) {
		ArithmeticOpertionExecutor executor = new ArithmeticOpertionExecutor();
		ArithmeticOperation addition = new ArithmeticOperation() {
			@Override
			public Integer calculate(Integer number1, Integer number2) {
				return number1 + number2;
			}
		};

		ArithmeticOperation subtraction = new ArithmeticOperation() {
			@Override
			public Integer calculate(Integer number1, Integer number2) {
				int result = number1 - number2;
				System.out.println("Substraction: Result Inside the method is: " + result);
				return result;
			}
		};

		System.out.println(executor.execute(addition, 10, 5)); // For Addition
		int sub = executor.execute(subtraction, 10, 5); // For Subtraction
	}

}
/*
 * Define the anonymous class whenever required so here we define 2 anonymous
 * classes 1 for addition and another for substraction
 */
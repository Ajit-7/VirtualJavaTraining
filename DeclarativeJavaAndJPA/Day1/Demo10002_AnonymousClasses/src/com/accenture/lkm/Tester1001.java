package com.accenture.lkm;

public class Tester1001 {
	public static void main(String[] args) {
		ArithmeticOpertionExecutor executor = new ArithmeticOpertionExecutor();

		//a function which is pointed by a variable is called  First class Function
		// impure first class function 
		ArithmeticOperation addition = new ArithmeticOperation() {
			@Override
			public Integer calculate(Integer number1, Integer number2) {
				return number1 + number2;
			}
		};

		//		where the method execution is happening ?? .... at Line 9 or inside the executor class
		// impure high order function
		int sum = executor.execute(addition, 10, 5);  // For Addition
	}
}
/*
 * Closure also as Line 20 by passing arithmeticOperation 2 things are passed:
 * Object and method definition a method that receives the other methods
 * definition as parameter is called as closure
 */

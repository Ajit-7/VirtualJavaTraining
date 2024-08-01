package com.accenture.lkm;

public class Tester1004InLineLambda {
	public static void main(String[] args) {
		ArithmeticOpertionExecutor executor = new ArithmeticOpertionExecutor();

		// leaving the Lambda reduced to a small line as shown below:
		// ArithmeticOperation addition = (number1, number2) -> number1 + number2;

		int num1 = 10;
		int num2 = 30;

		// InLine Lambda
		executor.execute((number1, number2) -> number1 + number2, num1, num2);
	}

}

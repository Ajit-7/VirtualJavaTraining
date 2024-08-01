package com.accenture.lkm;

public class Tester1003ReducedLambda {
	public static void main(String[] args) {
		ArithmeticOpertionExecutor executor = new ArithmeticOpertionExecutor();

		// reduced Lambda
//		ArithmeticOperation addition = (number1, number2) -> {
//			int result = number1 + number2;
//			System.out.println("From Lambda Result is: " + result);
//			return result;
//		};

		// Lambda can have only return statement
//		ArithmeticOperation addition = (number1 , number2)-> { return number1 + number2;};

		// if after "->" there is only one statement then usage of {} is not mandatory
		// and return type and data is also inferred from abstract methods signature
		// there by
		// leaving the Lambda reduced to a small line as shown below:
		ArithmeticOperation addition = (number1, number2) -> number1 + number2;

		int num1 = 10;
		int num2 = 30;
		executor.execute(addition, num1, num2);
	}

}

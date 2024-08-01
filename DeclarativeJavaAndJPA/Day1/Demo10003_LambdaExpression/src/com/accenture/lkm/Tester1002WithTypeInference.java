package com.accenture.lkm;

public class Tester1002WithTypeInference {
	public static void main(String[] args) {
		ArithmeticOpertionExecutor executor = new ArithmeticOpertionExecutor();

		// Case1: Without_Type_Inference
		// for a paramterList execute the body after the arrow:
		/*
		 * ArithmeticOperation addition = (Integer number1, Integer number2)->{ 
		 * int result = number1 + number2;
		 * System.out.println("From Lambda Result is: "+result); return result; };
		 */

		// Datatype inference
		// reduced Lambda 
		ArithmeticOperation addition = (number1 , number2) -> {
			int result = number1 + number2;
			System.out.println("From Lambda Result is: " + result);
			return result;
		};
		
		

		int num1 = 10;
		int num2 = 30;
		executor.execute(addition, num1, num2);
	}

}

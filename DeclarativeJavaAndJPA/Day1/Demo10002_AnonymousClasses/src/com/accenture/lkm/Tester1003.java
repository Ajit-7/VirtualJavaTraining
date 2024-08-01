package com.accenture.lkm;

public class Tester1003 {
	public static void main(String[] args) {
		ArithmeticOpertionExecutor executor = new ArithmeticOpertionExecutor();

		int numSp = 34;
		// Uncomment below line and check the error
//		numSp=13;
		ArithmeticOperation addition = new ArithmeticOperation() {
			@Override
			public Integer calculate(Integer number1, Integer number2) {
				int result = number1 + number2 * numSp;     
				System.out.println("Addition: Result Inside the method is: " + result);
				return result;
			}
		};

		int num1 = 10;
		int num2 = 30;
		int sum = executor.execute(addition, num1, num2);   // JVM translates numSp to the literal value at line 13
	}

}
/*
 * If method is executed inside the executor then how numSp is accessed by
 * executor as it is a local variable of main. It is because before sending the
 * object and method definition to executor JRE will covert the numSp to
 * respective literal value and then send in order to make this conversion of
 * variable to its literal value. numSp should be declared with final keyword in
 * java7, where as in java8 it is optional but variable becomes effectively
 * final, try to assign a new value to numSp
 */
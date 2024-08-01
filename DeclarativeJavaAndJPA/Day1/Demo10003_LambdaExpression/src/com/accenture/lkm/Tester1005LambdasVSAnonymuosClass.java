package com.accenture.lkm;

public class Tester1005LambdasVSAnonymuosClass {
	public static void main(String[] args) {

		ArithmeticOpertionExecutor executor = new ArithmeticOpertionExecutor();
		int number = 45;
		// inpure first class function
		ArithmeticOperation arithmeticOperation = new ArithmeticOperation() {
			@Override
			public Integer calculate(Integer number1, Integer number2) {
				System.out.println("address inside anonymous class..." + this);
				return (number1 + number2) * number;
			}
		};

		int number1 = 10;
		int number2 = 30;
		int result = executor.execute(arithmeticOperation, number1, number2); // number gets replaced with literal value 45 by jre..
		System.out.println("address inside anonymous class..." + arithmeticOperation);

		// above anonymous class as Lambda
		ArithmeticOperation arithmeticOperation2 = (num1, num2) -> {
			// Uncomment the below line and execute and Observe
//			System.out.println("address inside anonymous class..." + this);
			return (num1 + num2) * number;
		};
		result = executor.execute(arithmeticOperation2, number1, number2); // number gets replaced with literal value 45 by jre..
		System.out.println("address inside anonymous class..." + arithmeticOperation2);

	}

}
// Point Anonymous class is both object and definition
// whereas Lambda is just definition

// Anonymous class has the capability to overwrite this reference
// whereas Lambdas use the this reference from outer scope and cannot re-write

//Hence Lambda is not replacement of Anonymous class

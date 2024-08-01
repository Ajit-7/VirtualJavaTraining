package com.accenture.lkm;

public class ArithmeticOpertionExecutor {
	public int execute(ArithmeticOperation operation, Integer number1, Integer number2) {
		int res = operation.calculate(number1, number2);
		return res;
	}
}

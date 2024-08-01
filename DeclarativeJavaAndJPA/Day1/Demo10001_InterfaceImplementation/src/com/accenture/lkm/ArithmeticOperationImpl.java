package com.accenture.lkm;

public class ArithmeticOperationImpl implements ArithmeticOperation {
	@Override
	public Integer additionOf(Integer number1, Integer number2) {
		return number1 + number2;
	}
	@Override
	public Integer substractionOf(Integer number1, Integer number2) {
		return number1 - number2;
	}
	@Override
	public Integer productOf(Integer number1, Integer number2) {
		return number1 * number2;
	}
}

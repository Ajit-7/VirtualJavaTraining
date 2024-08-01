package com.accenture.lkm;

public class Addition implements ArithmeticOperationSAM{
	@Override
	public Integer calculate(Integer number1, Integer number2) {
		return number1 + number2;
	}
}

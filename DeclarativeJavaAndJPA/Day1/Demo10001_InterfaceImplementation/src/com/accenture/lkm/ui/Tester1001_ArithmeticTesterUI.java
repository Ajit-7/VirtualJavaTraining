package com.accenture.lkm.ui;

import com.accenture.lkm.Addition;

public class Tester1001_ArithmeticTesterUI {
	public static void main(String[] args) {
		Addition addition = new Addition();
		Integer sum =  addition.calculate(10, 25);
		
		System.out.println("Sum: " + sum);
	}
}

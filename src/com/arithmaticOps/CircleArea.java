package com.arithmaticOps;

public class CircleArea implements OperationType {

	@Override
	public double calculate(double num1, double num2) {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(num1, 2);
	}

	@Override
	public String toString() {
		return "Circle Area";
	}
}

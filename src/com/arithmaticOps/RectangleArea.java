package com.arithmaticOps;

public class RectangleArea implements OperationType {

	@Override
	public double calculate(double num1, double num2) {
		return num1 * num2;
	}
	
	@Override
	public String toString() {
		return "Rectangle Area";
	}

}

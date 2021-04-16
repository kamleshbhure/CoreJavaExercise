package com.arithmaticOps;

public class Division implements OperationType {

	@Override
	public double calculate(double num1, double num2) {
		return num1 / num2;
	}

	@Override
	public String toString() {
		return "Division";
	}

}

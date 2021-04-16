package com.arithmaticOps;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

// Singleton Pattern
public class Calculator {

	private static Calculator instance;

	OperationType operation;
	HashMap<Integer, OperationType> operationTypes;

	private Calculator() {
		operationTypes = new HashMap<Integer, OperationType>();
		operationTypes.put(1, new Addition());
		operationTypes.put(2, new Subtraction());
		operationTypes.put(3, new Multiplication());
		operationTypes.put(4, new Division());
		operationTypes.put(5, new CircleArea());
		operationTypes.put(6, new RectangleArea());
	}

	public void setOperationType(int option) {
		this.operation = operationTypes.get(option);
	}

	public static Calculator getInstance() {
		if (instance == null)
			instance = new Calculator();
		return instance;
	}

	// You should think about handle the most general data type (this case double)
	public double calculate(double value1, double value2) {

		// Store console print stream.
		double result = 0;
		try (BufferedWriter out = new BufferedWriter(new FileWriter("outputlogger.txt", true));

		) {
			Properties prop = PropertiesUtil.readPropFile();
			String dateFormat = prop.getProperty("date.format");
			SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
			Date date = new Date();

			result = operation.calculate(value1, value2);
			StringBuilder sb = new StringBuilder();
			sb.append("\n" + formatter.format(date) + " " + operation + " of ");
			sb.append(value1);
			sb.append(" and " + value2);
			sb.append(" is " + result);
			out.write(sb.toString());
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}
}
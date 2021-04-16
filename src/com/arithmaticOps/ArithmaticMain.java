package com.arithmaticOps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

public class ArithmaticMain {

	public static void main(String[] args) throws FileNotFoundException {
		
		Properties prop = PropertiesUtil.readPropFile();
		String dateFormat = prop.getProperty("date.format");
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);  
	    Date date = new Date();

        // Set console print stream.
		System.out.println("Welcome! Current time "+formatter.format(date));
		System.out.println("Select number from 1 to 7 to opt for below option");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Division");
		System.out.println("4 - Multiply");
		System.out.println("5 - Circle Area");
		System.out.println("6 - Rectangle Area");
		System.out.println("7 - exit");
		
		try (Scanner sc = new Scanner(System.in);) {
			int option = 0;
			double num1 = 0.0;
			double num2 = 0.0;
			System.out.print("Enter your selection: ");
			option = Integer.parseInt(sc.nextLine());
			while (option < 7) {
				System.out.print("Enter First number: ");
				num1 = Double.parseDouble(sc.nextLine());
				if (option != 5) {
					System.out.print("Enter Second number: ");
					num2 = Double.parseDouble(sc.nextLine());
				}
				Calculator c = Calculator.getInstance();
		        c.setOperationType(option);
		        System.out.println(c.calculate(num1, num2));

		        System.out.print("Enter your selection: ");
				option = Integer.parseInt(sc.nextLine());
			};
			System.out.print("Exited!!");
		} catch (Exception e) {
			System.out.println("Error::"+e.getMessage());
		}
	}

}

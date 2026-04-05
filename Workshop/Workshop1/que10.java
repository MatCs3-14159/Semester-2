package Workshop1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que10 {
	//function that takes input from user
	public static double[] getInput(Scanner scanner) {
		double[] numbers = new double[2];
		
		while (true) {
			try {
				System.out.println("Enter the first number: ");
				numbers[0] = scanner.nextDouble();
				
				System.out.println("Enter the second number: ");
				numbers[1] = scanner.nextDouble();
				
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("Error: PLease input a valid number.");
				scanner.nextLine();
			}
		}
		return numbers;
	}
	//Arithmetic functions
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static double sub(double a, double b) {
		return a-b;
	}
	
	public static double prod(double a, double b) {
		return a*b;
	}
	
	public static double div(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("Error: Cannot divide by Zero.");
		} else {
			return a/b;
		}
	}
	//calculator 
	public static void calculator(double a, double b) {
		System.out.println("Addition: " + add(a,b));
		System.out.println("Subtraction: " + sub(a,b));
		System.out.println("Multiplication: " + prod(a,b));
		try {
			System.out.println("Division: " + div(a,b));
			
		} catch(ArithmeticException e) {
			System.out.println("!! Division Error: Integer cannot be divisible by Zero.");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("------Arithmetic Calculator------");
		double num[] = getInput(scanner);
		calculator(num[0], num[1]);
		scanner.close();
	}
}

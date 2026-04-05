package Workshop2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que1 {
	//Taking input
	public static double getInput(Scanner scanner, String message) {
		double value = 0;
		
		while (true) {
			try {
				System.out.println(message);
				value = scanner.nextDouble();
				if (value <= 0) {
					System.out.println("Error: Please enter a positive integer.");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error: Please enter a valid Integer.");
				scanner.nextLine();
			}
		}
		
		return value;
	}
	//checks square
	public static boolean squareCheck(double l,double b) {
		return l == b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-----Square Check-----");
		
		double length = getInput(scanner,"Enter the length: ");
		double breadth = getInput(scanner,"Enter the breadth: ");
		
		if (squareCheck(length,breadth)) {
			System.out.println("It is a Square.");
		} else {
			System.out.println("It is a Rectangle.");
		}
		scanner.close();
	}
}

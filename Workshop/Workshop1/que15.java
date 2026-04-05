package Workshop1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-------Simple Calculator-------");
		
		double num1 = 0;
		double num2 = 0;
		double quotient = 0;
		
		while (true) {
			try {
				System.out.println("Enter your first number: ");
				num1 = scanner.nextDouble();
				
				System.out.println("Enter your second number: ");
				num2 = scanner.nextDouble();
				
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error: Please input a valid integer.");
				scanner.next();
			}
		}
		System.out.printf("Sum: %.2f\n", num1+num2);
		System.out.printf("Difference: %.2f\n", num1-num2);
		System.out.printf("Product: %.2f\n", num1*num2);
		if (num2 == 0) {
			System.out.println("Denominator cannot be zero, quotient is infinity ∞.\n");
		} else {
			quotient = num1/num2;
			System.out.printf("Quotient: %.2f\n", quotient);
		}
		scanner.close();
	}
}

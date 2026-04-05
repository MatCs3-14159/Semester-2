package Workshop1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-------Celsius to Fahrenheit-------");
		
		double C = 0;
		
		try {
			System.out.println("Enter the temperature in celsius: ");
			C = scanner.nextDouble();
			
		} catch (InputMismatchException e) {
			System.out.println("Error: Please input a valid number.");
		}
		
		double F = ((C * 9)/5) + 32;
		System.out.printf("Temprature in fahrenheit: %.2f\n" + F);
		
		scanner.close();
	}

}

package Workshop1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que14 {
	public static double getInput(Scanner scanner, String message) {
		double value = 0;
		
		while (true) {
			try {
				System.out.println(message);
				value = scanner.nextDouble();
				
				if (value < 0) {
					System.out.println("Error: Please enter a positive number.");
					continue;
				}
				return value;
			} catch (InputMismatchException e) {
				System.out.println("Error: Please input valid integer.");
				scanner.nextLine();
			}
		}
	}
	
	public static double converter(double dollar, double rate) {
		return dollar*rate;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("----U.S Dollars Converter----");
		double money = getInput(scanner, "Enter the amount of money: ");
		double ExchangeRate = getInput(scanner, "Enter the exchange rate: ");
		System.out.printf("Final amount: %.2f", converter(money, ExchangeRate));
		scanner.close();
	}
}

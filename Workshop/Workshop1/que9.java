package Workshop1;

import java.util.Scanner;

public class que9 {
	public static double getPositive(Scanner scanner, String message) {
		double value = 0;
		
		while (true) {
			System.out.println(message);
			
			if (scanner.hasNextDouble()) {
				value = scanner.nextDouble();
				
				if (value > 0) {
					break;
				} else {
					System.out.println("Error: Input must be greater than 0.");
				}

			} else {
				System.out.println("Error: Invalid input please enter a numeric value.");
				scanner.next(); // clears wrong input
			}
		}
		return value;
	}
	
	public static double simpleIntrest(double p, double i, double t) {
		return (p*i*t)/100;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----Simple Intrest Calculator----");
		
		double p = getPositive(scanner, "Enter the principal amount: " );
		double i = getPositive(scanner, "Enter the Intrest per annum: " );
		double t = getPositive(scanner, "Enter the time period: " );
		
		double finalAmount = p + simpleIntrest(p,i,t);
		
		System.out.printf("Intrest amount: %.2f\n", simpleIntrest(p,i,t));
		System.out.printf("Total amount: %.2f\n", finalAmount);
		
	}
}

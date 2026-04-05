package Workshop1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que11 {
	public static double miKm(double a) {
		return (a * 1.609344);
	}
	
	public static double getInput(Scanner scanner) {
		double miles = 0;
		while (true) {
			try {
				System.out.println("Enter the distance in miles: ");
				miles = scanner.nextDouble();
				
				if (miles < 0) {
					System.out.println("Error: Input cant be negative.");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error: please enter a number.");
				scanner.next();
			}
		}
		return miles;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-----Miles to kilometer converter-----");
		
		double mi = getInput(scanner);
		System.out.printf("Distance in km: %.2f", miKm(mi));
		scanner.close();
	}

}

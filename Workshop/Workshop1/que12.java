package Workshop1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class que12 {
	public static double getInput(Scanner scanner) {
		double radius = 0;
		while (true) {
			try {
				System.out.println("Enter the radius of the circle: ");
				radius = scanner.nextDouble();
				
				if (radius <= 0) {
					System.out.println("Error: Input cant be negative or Zero.");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error: please enter a number.");
				scanner.next();
			}
		}
		return radius;
	}
	
	public static double area(double a) {
		return Math.PI * Math.pow(a, 2) ;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----Area calculator(Circle)----");
		
		double r = getInput(scanner);
		System.out.printf("Area: %.2f", area(r));
		
		scanner.close();
	}
}

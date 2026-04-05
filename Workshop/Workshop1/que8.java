package Workshop1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----Volume of cylinder----");
		
		double r = 0;
		double h = 0;
		
		while (true) {
			try {
				System.out.println("Enter the radius of cylinder: ");
				r = scanner.nextDouble();
				
				System.out.println("Enter the height of cylinder: ");
				h = scanner.nextDouble();
				
				if (r <=0 || h <= 0) {
					System.out.println("Error: Please enter a positive number. ");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error: Please enter a valid number.");
				scanner.next();
			}
		}
		
		double v = Math.PI * Math.pow(r, 2) * h;
		System.out.printf("Volume of cylinder: %.2f\n" + v);
		scanner.close();
	}

}

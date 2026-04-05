package Workshop1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double length = 0;
		
		System.out.println("---- Area of Square ---");
		
		while (true) {
			try {
				System.out.println("Enter the length of Square: ");
				length = scanner.nextDouble();
				
				if (length <= 0) {
					System.out.println("Error: Please enter Positive number only.");
					continue;
				}
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("Error: Please Input a valid number.");
				scanner.next();
			}
			
			double area = Math.pow(length, 2);
			System.out.printf("Area of Square: %.2f\n" + area);
			
			scanner.close();
		}
	}
}

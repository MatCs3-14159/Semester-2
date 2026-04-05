package Workshop1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double length = 0;
		double width = 0;
		
		System.out.println("----Perimeter Calculator for Rectangle----");
		
		while (true) {
			try {
				System.out.println("Enter length of the Rectangle: ");
				length = scanner.nextDouble();
				
				System.out.println("Enter width of the Rectangle: ");
				width = scanner.nextDouble();
				
				if (length <= 0 || width <= 0) {
					System.out.println("Error: Please enter a Positive Number.");
					continue;
				}
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("Error: Please enter a valid number.");
				scanner.next();
			}
		}
		
		double perimeter = 2*length + 2*width ;
		
		System.out.printf("Permeter of Rectangle: %.2f\n" + perimeter);
		
		scanner.close();
	}

}

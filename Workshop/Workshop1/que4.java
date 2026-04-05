package Workshop1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----Area Calculator for triangle from sides----");
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		while (true) {
			try {
				System.out.println("Enter the length of side a: ");
				a = scanner.nextDouble();
				
				System.out.println("Enter the length of side b: ");
				b = scanner.nextDouble();
				
				System.out.println("Enter the length of side c: ");
				c = scanner.nextDouble();
				
				if (a <= 0 || b <= 0 || c <= 0) {
					System.out.println("The sides length must a positive integer.");
					continue;
				} else if (a+b <= c || b+c <= a || a+c <= b) {
					System.out.println("These sides do not form a valid triangle.");
					continue;
				}
				break;
			} catch (InputMismatchException e){ 
				System.out.println("Error: Please enter a valid number.");
				scanner.next();
			}	
		}
		
		double s = (a + b + c)/2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
		System.out.printf("Area of the trangle: %.2f\n" + area);
		
		scanner.close();
	}
}

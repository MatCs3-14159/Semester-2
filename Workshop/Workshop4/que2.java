package Workshop;

import java.util.Scanner;
import java.util.InputMismatchException;

class Shape{
	public double getPerimeter() {
		return 0;
	}
	public double getArea() {
		return 0;
	}
}
class Circle extends Shape{
	public double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius,2);
	}
}

public class que2 {
	public static double getInput(Scanner sc, String message) {
		double r;
		while (true) {
			try {
				System.out.println(message);
				r = sc.nextDouble();
				if (r<=0) {
					System.out.println("Error: Please enter a positive radius.");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error: Please enter a valid integer.");
				sc.nextLine();
			}
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		double r = getInput(sc, "Enter the radius of Circle:");
		Circle c = new Circle(r);
		System.out.printf("Perimeter: %.2f%n", c.getPerimeter());
		System.out.printf("Area: %.2f%n", c.getArea());
	}
}

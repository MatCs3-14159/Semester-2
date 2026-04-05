package Workshop;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		
		//Question number: 1,2,3,4 
		Scanner sc = new Scanner (System.in);
		double a,b,c,d,angle;
		
		while (true) {
			try {
				System.out.println("-----Sidess of Quadrilateral-----");
				System.out.println("Enter side a: ");
				a = sc.nextDouble();
				System.out.println("Enter side b: ");
				b = sc.nextDouble();
				System.out.println("Enter side c: ");
				c = sc.nextDouble();
				System.out.println("Enter side d: ");
				d = sc.nextDouble();
				System.out.println("-----Angles of Quadrilateral-----");
				System.out.println("Enter the angle in degree: ");
				double ang1 = sc.nextDouble();
				System.out.println("Enter its opposite angle in degree: ");
				double ang2 = sc.nextDouble();
				angle = ang1 + ang2;
				
				Shape q = new Quadrilateral(a, b, c, d,angle);
				q.calculateArea();
                q.calculatePerimeter();
                q.print();
                break;
                
			} catch(InputMismatchException e) {
				System.out.println("Error: Invalid input! Enter numbers only.");
			} catch(IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
			} catch(ArithmeticException e) {
				System.out.println("Error: " + e.getMessage());
			} catch(Exception e ) {
				System.out.println("Error: " + e.getMessage());
			} finally {
				System.out.println("✔ Attempt Completed.\n");
			}
	        System.out.println("✅ Program finished.");
		}
		//end of this one
		
		//Question number: 5,6
		Bus b1 = new Bus();
		b1.wheel();
		b1.door();
		//end of this one 
		
		//Question number: 7,8,9
		Cow cow = new Cow();
		cow.display();
		cow.eat();
		cow.walk();
		//end of this one 
		
		//Question number: 10,11,12,13
		LivingBeing tuna = new Fish();
		LivingBeing crow = new Bird();
		Fish fish = new Fish();
		
		fish.print();
		tuna.specialFeature();
		crow.specialFeature();
		//end of this one 	
		
		sc.close();
	}
}

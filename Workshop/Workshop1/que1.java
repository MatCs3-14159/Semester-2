package Workshop1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = scanner.nextLine();
		
		int age = 0;
		int studentNumber = 0;
		
		//Age input with error handling 
		while (true) {
			try {
				System.out.println("Enter your age: ");
				age = scanner.nextInt();
				
				if(age <= 0) {
					System.out.println("Age must be positive.");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input! Please enter a Number.");
				scanner.next();
			}
		}
		
		//StudentNumber with error handling
		while (true) {
			try {
				System.out.println("Enter your student number: ");
				studentNumber = scanner.nextInt();
				
				if(studentNumber <= 0) {
					System.out.println("Student number must be positive.");
					continue;
				}
				break;
			} catch(InputMismatchException e) {
				System.out.println("Invalid Input! Please Enter a number.");
				scanner.next();
			}
		}
		
		System.out.println("\n-------Student Details-------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Student Number: " + studentNumber);
		
		scanner.close();
	}
}

package Workshop2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que8 {
	public static double getInput(Scanner sc, String message, int total) {
		 double value;
		 while (true) {
			 try {
				 System.out.println(message);
				 value = sc.nextDouble();
				 if (value < 0 || value > total) {
					 System.out.println("Error: Please input a valid Marks.");
					 continue;
				 }
				 break;
			 } catch (InputMismatchException e) {
				 System.out.println("Error: Please enter a valid integer.");
				 sc.nextLine();
			 }
		 }
		 return value;
	}
	//Percentage
	public static double[] percent(double []a) {
		double[] per = new double[5];
		return per;
	}
	
	
	//main function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----Grade Calculator-----");
		//Take full marks for each subject
		int total;
		while (true) {
			System.out.println("Full marks for each Subject: ");
			total = sc.nextInt();
			if (total <= 0) {
				System.out.println("Error: Please input a valid Marks.");
				continue;
			}
			break;
		}
		
		double[] marks = new double[5];
		
		
		sc.close();
		
	}

}

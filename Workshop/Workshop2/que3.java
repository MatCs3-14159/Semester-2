package Workshop2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que3 {
	//get input from user
	public static double getInput(Scanner input, String message) {
		double value = 0;
		while (true) {
			try {
				System.out.println(message);
				value = input.nextDouble();
				
				if (value < 0 || value > 100) {
					System.out.println("Error: PLease enter a valid marks.");
					continue;
				}
				break;	
			} catch (InputMismatchException e) {
				System.out.println("Error: Please enter a valid integer.");
				input.nextLine();
			}
		}
		return value;
	}
	
	//calculate grade according to marks obtained
	public static String gradeCalc(double value) {
		if (value < 40) {
			return "Fail";
		} else if (value < 50) {
			return "C";
		} else if ( value < 60) {
			return "C+";
		} else if (value < 70) {
			return "B";
		} else if (value < 80) {
			return "B+";
		} else if (value < 90) {
			return "A";
		} else {
			return "A+";
		}
	}
	
	//main function
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("-----Grade Calculator-----");
		double marks = getInput(input,"Enter obtained marks: ");
		System.out.printf("Grade: "+ gradeCalc(marks));
		input.close();
	}
}

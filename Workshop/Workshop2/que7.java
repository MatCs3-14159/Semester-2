package Workshop2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que7 {
	//get input
	public static int getInput(Scanner sc, String message) {
		int value;
		while (true){
			try {
				System.out.println(message);
				value = sc.nextInt();
				
				if (value <= 0) {
					System.out.println("Error: Enter integer only greater than 0.");
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
	
	// Check even Odd
	public static boolean evenOdd(int a) {
		if (a % 2 == 0) {
			return true;
		} 
		return false;
	}
	
	//Divisible checker
	public static boolean multiple(int a, int b) {
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//Output 
	public static void output(int num) {
		if (evenOdd(num)) {
			if (multiple(num, 4)) {
				System.out.print(num + " is even and divisible by 4.");
			} else {
				System.out.print(num + " is even and but not divisible by 4.");
			}
		} else {
			if (multiple(num, 7)) {
				System.out.print(num + " is odd and divisible by 7.");
			} else {
				System.out.print(num + " is odd and but not divisible by 7.");
			}
		}
	}
	
	//main function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Advanced odd even checker-----");
		int num = getInput(sc, "Enter the number to check: ");
		output(num);
		sc.close();
	}
}

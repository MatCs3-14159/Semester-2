package Workshop2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que2 {
	public static int getInput(Scanner input, String message) {
		int value = 0;
		while (true) {
			try {
				System.out.println(message);
				value = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error: Please Input a valid Integer.");
				input.next();
			}
		}
		
		return value;
	}
	
	public static void table(int n) {
		for (int i = 1;i<=10;i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("-----Multiplication Table-----");
		int integer = getInput(input, "Enter the number: ");
		table(integer);
		input.close();
	}	
}

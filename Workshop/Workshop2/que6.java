package Workshop2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class que6 {
	//get input from user
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
	
	//Even Odd check 
	public static boolean evenOdd(int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}	
	}
	
	//main function 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Even Odd Check-----");
		int num = getInput(sc, "Enter the Number to check: ");
		if (evenOdd(num)) {
			System.out.print(num + " is Even.");
		} else {
			System.out.print(num + " is Odd.");
		}
		sc.close();
	}
}

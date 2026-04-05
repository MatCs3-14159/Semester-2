package Workshop2;

import java.util.Scanner;

public class que5 {
	public static boolean yn(Scanner sc) {
		String med = "";
		while (true) {
			System.out.println("Do you have any medical cause? ('y' or 'n')==> ");
			med = sc.next();
			
			if (!med.equalsIgnoreCase("y") && !med.equalsIgnoreCase("n")) {
				System.out.println("Error: Invalid Input, only enter ('y' or 'n')");
				continue;
			}
			break;
		}
		return med.equalsIgnoreCase("y");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Medical Check-----");
		
		if (yn(sc)) {
			System.out.println("Sorry, You arent allowed to sit in exam.");
		} else {
			System.out.println("You are allowed to sit in exam.");
		}
		System.out.println("---Thank You---");
		sc.close();
	}
}

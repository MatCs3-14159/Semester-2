package Workshop2;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashMap;

public class que4{
	//get input from user in a valid format name:age
	public static HashMap<String, Integer> getInput(Scanner sc){
		HashMap<String, Integer> people = new HashMap<>();
		
		while (true) {
			System.out.println("Enter name (or type end to stop): ");
			String name = sc.next();
			
			if (name.equalsIgnoreCase("end")) {
				System.out.print("\n");
				break;
			}
			
			int age;
			
			while (true) {
				try {
					System.out.println("Enter the age " + name + ": ");
					age = sc.nextInt();
					
					if (age < 0) {
						System.out.println("Error: Please enter valid age.");
						continue;
					}
					break;
				} catch (InputMismatchException e) {
					System.out.println("Error: Please enter a valid number.");
					sc.nextLine();
				}
			}
			people.put(name, age);
		}
		return people;
	}
	
	//Checks and returns the Oldest and the Youngest in the Group
	public static HashMap<String, String> oldestYoungest(HashMap<String, Integer> people){
		HashMap<String, String> result = new HashMap<>();
		
		String oldestName = null;
		String youngestName = null;
		int oldestAge = Integer.MIN_VALUE;
		int youngestAge = Integer.MAX_VALUE;
		
		for (String name: people.keySet()) {
			int age = people.get(name);
			
			if (oldestAge < age) {
				oldestAge = age;
				oldestName = name;
			}
			if (youngestAge > age) {
				youngestAge = age;
				youngestName = name;
			}
		}
		
		result.put("Oldest", oldestName + "(" + oldestAge + ")");
		result.put("Youngest", youngestName + "(" + youngestAge + ")");
		
		return result;
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-----Age Comparision: Oldest and Youngest-----\n");
    	HashMap<String, Integer> data = getInput(sc);
    	HashMap<String, String> result = oldestYoungest(data);
    	System.out.print("Oldest: " + result.get("Oldest") + "\n");
    	System.out.print("Youngest: " + result.get("Youngest") + "\n");
    	sc.close();
    }
}

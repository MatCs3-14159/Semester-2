package Workshop;

import java.util.Scanner;

class Animal{
	int age;
	String name;
	//constructor
	Animal(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("Animal constructor called.");
	}
}

class Dog extends Animal{
	String breed;
	Dog(String name, int age, String breed){
		super(name, age);
		this.breed = breed;
		System.out.println("Dog constructor called.");
	}
	
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Breed: " + breed);
	}
}

public class que1 {
	//get input from user
	public static String[] getInput(Scanner sc) {
		String[] data = new String[3];
		
		System.out.println("Enter the name of Dog: ");
		data[0] = sc.nextLine();
		System.out.println("Enter the age of Dog: ");
		data[1] = sc.nextLine();
		System.out.println("Enter the breed of Dog: ");
		data[2] = sc.nextLine();
		
		return data;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] data = getInput(sc);
		int age = Integer.parseInt(data[1]);
		Dog d1 = new Dog(data[0], age, data[2]);
		d1.display();
	}
}

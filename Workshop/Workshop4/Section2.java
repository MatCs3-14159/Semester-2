package Workshop;

import java.util.*;

//User class
class User{
	String name;
	String number;
	String password;
	String dob;
	//constructor
	User(String name, String number, String password, String dob){
		this.name = name;
		this.number = number;
		this.password = password;
		this.dob = dob;
	}
	//method to display details
	void display() {
			System.out.println("Name: " + name);
			System.out.println("Number: " + number);
			System.out.println("Password: ********");
			System.out.println("Date of Birth: " + dob);
			System.out.println("You have successfully signed up.");
			System.out.println("");
	}
}

public class Section2 {
	//Array to store Multiple users
	static ArrayList<User> users= new ArrayList<>();
	
	// Validate Full Name
	public static boolean validName(String name) {
		return name.matches("[A-Za-z ]{5,}");
	}
	
	// Validate PhoneNumber
	public static boolean validNumber(String number) {
		return number.matches("0\\d{9}");
	}
	
	//Duplicate check for number
	public static boolean isDuplicate(String number) {
	    for (User u : users) {
	        if (u.number.equals(number)) {
	            return true;
	        }
	    }
	    return false;
	}
	
	// Validate Password
	public static boolean validPassword(String password) {
		return password.matches("^[A-Za-z]{3,}[@&]\\\\d{2,}$");
	}
	
	// Validate DOB
	public static boolean validDOBFormat(String dob) {
		return dob.matches("\\d{2}/\\d{2}/\\d{4}") || dob.matches("\\d{4}/\\d{2}/\\d{2}");
	}
	
	// Checks if age>=21
	public static boolean validAge(String dob) {
		int year;
	    if (dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
	        year = Integer.parseInt(dob.substring(6));
	    } else {
	        year = Integer.parseInt(dob.substring(0, 4));
	    }
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int age = currentYear - year;
		return age >= 21;
	}
	
	//Sign-Up part 
	public static void signUp(Scanner sc) {
		String name;
		String number;
		String password;
		String dob;
		//name
		while (true) {
			System.out.println("Please enter your full name(more than 4 character):  ");
			name = sc.nextLine();
			
			if (!validName(name)) {
				System.out.println("Please enter a valid Name (Must be more than 4 character).");
				continue;
			}
			break;
		}
		//number
		while (true) {
			System.out.println("Please enter your mobile number (must start with 0 and must be 10 digits): ");
			number = sc.nextLine();
			
			if (isDuplicate(number)) {
			    System.out.println("This number is already registered.");
			    continue;
			}
		
			if (!validNumber(number)) {
				System.out.println("Please enter a valid number(must start with 0 and must be 10 digits)");
				continue;
			}
			break;
		}
		//password
		while (true) {
			System.out.println("Please enter your password (c.	The Password must initiate with alphabets followed by either one of @, & and ending with numeric.\n"
					+ "(For Example: John@0125 or John&25).\n"
					+ "): ");
			password = sc.nextLine();
			
			System.out.println("Re-enter the password to confirm.");
			String confirmPass = sc.nextLine();
			
			if (!password.equals(confirmPass)) {
				System.out.println("Error: Passwords do not match. Try again.");
				continue;
			}
			if (!validPassword(password)) {
				System.out.println("Please enter a valid password.");
				continue;
			}
			break;
		}
		//DOB
		while (true) {
			System.out.println("Please enter your Date of Birth DD/MM/YYYY or YYYY/MM/DD(No space): ");
			dob = sc.nextLine();
			
			if (!validDOBFormat(dob)) {
				System.out.println("Please enter Date of Birth in valid format.");
				continue;
			}
			if (!validAge(dob)) {
                System.out.println("You must be at least 21 years old.");
                continue;
            }
			break;
		}
		//If all valid 
		User user = new User(name,number,password,dob);
		users.add(user);
		System.out.println("");
		System.out.println("Entered details:");
		user.display();
	}
	
	//Main Loop of the program
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("");
				System.out.println("Please enter 1 for Sign up.");
				System.out.println("Please enter 2 for Quit.");
				System.out.println("Enter Your choice: ");
				int choice = sc.nextInt();
				sc.nextLine();
				
				if (choice < 1 || choice > 2) {
					System.out.println("Error: Please choose 1 or 2.");
					continue;
				}
				if (choice == 1) {
					signUp(sc);
				}
				if (choice == 2) {
					 System.out.println("Thank you for using the Application.");
		             break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Error: Please enter a valid integer.");
				sc.nextLine();
			}
		}
		sc.close();
	}
}

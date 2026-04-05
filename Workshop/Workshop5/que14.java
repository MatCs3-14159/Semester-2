package Workshop;

/*
 public class Demo{
  	public static void main(String[] args) {
	  System.out.println(10/0);
	}
 }

*/


public class que14{
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0. \nError: Output is undefined number.");
		} finally {
			System.out.println("!!Completed!! \n10/0 = INFINITY.");
			
		}
    }
}

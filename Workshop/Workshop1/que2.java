package Workshop1;

public class que2 {
	public static void main(String[] args) {
		System.out.println("Difference:");
		System.out.println("45 - 32 = " + diff(45,32));
		System.out.println("32 - 45 = " + diff(32,45));
		System.out.println("Product:");
		System.out.println("45 x 32 = " + prod(45,32));
	}
	static int diff(int a, int b) {
		return a - b;
	}
	static int prod(int a,int b) {
		return a * b;
	}
}

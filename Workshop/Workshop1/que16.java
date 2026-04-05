package Workshop1;

public class que16 {
	public static void main(String[] args) {
		boolean expr1, expr2;
		
		expr1 = 5>3 ;
		expr2 = 8>5 ; 
		boolean andResult = expr1 && expr2;
		System.out.println("Logical AND of (5>3) && (8>5) = " + andResult);
		
		expr1 = 5>3 ;
		expr2 = 2>5 ; 
		boolean orResult = expr1 || expr2;
		System.out.println("Logical OR of (5>3) || (2>5) = " + orResult);
		
		expr1 = (!(5==10));
		System.out.println("Logical NOT of (!(5==10)) = " + expr1);
		
		int a = 7, b = 10;
		System.out.println("---Comparision Operators---");
		System.out.println(a + " == " + b + " : " + (a==b));
		System.out.println(a + " != " + b + " : " + (a!=b));
		System.out.println(a + " > " + b + " : " + (a>b));
		System.out.println(a + " < " + b + " : " + (a<b));
		System.out.println(a + " >= " + b + " : " + (a>=b));
		System.out.println(a + " <= " + b + " : " + (a<=b));
	}
}

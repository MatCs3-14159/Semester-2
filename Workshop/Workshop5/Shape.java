package Workshop;

abstract class Shape {
	
	abstract void calculateArea();
	
	abstract void calculatePerimeter();
	
	public void print() {
		System.out.println(" parent class");
	}
	
}
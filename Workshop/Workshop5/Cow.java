package Workshop;

class Cow implements Animal, Printable{

	@Override
	public void display() {
		System.out.print("This is a Cow.");
	}
	@Override
	public void eat() {
		System.out.print("The Cow eats grass.");;
	}
	@Override
	public void walk() {
		System.out.println("Cow has 4 legs for walking.");;
	}

}

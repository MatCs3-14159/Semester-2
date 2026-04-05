package Workshop;

class Bus extends Vehicle{
	@Override
	void wheel() {
		System.out.println("Bus has 6 wheels.");
	}
	@Override
	void door() {
		System.out.println("Bus has 2 doors.");
	}
}

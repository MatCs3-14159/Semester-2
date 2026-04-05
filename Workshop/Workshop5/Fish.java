package Workshop;

class Fish implements LivingBeing, NonLivingBeing{

	@Override
	public void specialFeature() {
		System.out.println("Special feature: Fish have gills to swim.");
	}
	
	public void print() {
		System.out.println(" I am a Fish.");
	}

	@Override
	public boolean walks() {
		return true;
	}

}

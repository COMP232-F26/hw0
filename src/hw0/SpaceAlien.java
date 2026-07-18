package hw0;

public class SpaceAlien {
	private String homePlanet;

	private double distanceFromEarth;

	public SpaceAlien(String homePlanet, double distanceFromEarth) {
		this.homePlanet = homePlanet;
		this.distanceFromEarth = distanceFromEarth;
	}

	public void doGreeting() {
		System.out.println("Greetings from the planet " + homePlanet 
			+ ", " + distanceFromEarth + " light years away.");
	}

	public static void main(String[] args) {
		SpaceAlien alien = new SpaceAlien("Blap", 130.5);
		alien.doGreeting();
	}
}
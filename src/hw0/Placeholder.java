package hw0;

import java.util.Scanner;

public class Placeholder extends SpaceAlien implements ZapsWithSlime {
	public Placeholder(String homePlanet, 
				double distanceFromEarth) {
		super(homePlanet, distanceFromEarth);
		// TODO -- Auto generated constructor stub
	}

	public String doSlimeZap(int humans) {
		if (humans <= 1) {
			return "arrrr";
		} else {
			return "AHHHHH";
		}
	}

	public String slimeWholeEath() {
		return "OHHHHHHH NOOOOOO";
	}

	public static void main(String[] args) {
		Placeholder alien = new Placeholder("Earth", 9000);
		alien.doGreeting();
		Scanner reader = new Scanner(System.in);
		System.out.println("How many humans do we encounter? ");
		int humans = reader.nextInt();
		System.out.println(alien.doSlimeZap(humans));
		System.out.println("Do we attack all of the eather? ");
		int destroy = reader.nextInt();
		reader.close();

		if(destroy == 1) {
			System.out.println(alien.slimeWholeEath());
		} else {
			System.out.println("Maybe next time...");
		}
	}
}
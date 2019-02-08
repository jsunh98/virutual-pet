package childClasses;

import interfaces.Swims;
import orgRobClass.RoboticPet;

public class RoboticFish extends RoboticPet implements Swims {

	public RoboticFish(String name, String type, String species) {
		super(name, type, species);
	}

	public void swim() {

	}
	
	public void stats () {
		super.stats();
		System.out.println("Your fishy can swim, and it shits out flash drives filled with Bitcoins");
	}
	
}

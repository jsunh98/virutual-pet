package childClasses;

import interfaces.Swims;
import orgRobClass.RoboticPet;

public class RoboticFish extends RoboticPet implements Swims {

	public RoboticFish(String name, String type, int age) {
		super(name, type, age);
	}

	public void swim() {

	}
	
	public void stats () {
		super.stats();
		System.out.println("your fishy can swim");
	}
	
}

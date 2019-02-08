package childClasses;

import interfaces.Walkable;
import orgRobClass.RoboticPet;

public class RoboticDog extends RoboticPet implements Walkable{

	public RoboticDog(String name, String type, String species) {
		super(name, type, species);
		
	}
	
	public void stats() {
		super.stats();
		System.out.println("Your animal can run, but it probably won't because you bought it off AliExpress");
		System.out.println("Also, it shits out rolls of quarters. Lucky you.");
	}

	
	public void foo () {
		System.out.println("fooing");
		
	}

	

	@Override
	public void walk() {
		
	}
	
	

	
}

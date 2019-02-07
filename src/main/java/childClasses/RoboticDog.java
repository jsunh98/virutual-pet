package childClasses;

import interfaces.Walkable;
import orgRobClass.RoboticPet;

public class RoboticDog extends RoboticPet implements Walkable{

	public RoboticDog(String name, String type, int age) {
		super(name, type, age);
		
	}
	
	public void stats() {
		super.stats();
		System.out.println("your animal can run");

	}

	
	public void foo () {
		System.out.println("fooing");
		
	}

	

	@Override
	public void walk() {
		
	}
	
	

	
}

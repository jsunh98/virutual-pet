package childClasses;

import interfaces.Walkable;
import orgRobClass.RoboticPet;

public class RoboticDog extends RoboticPet implements Walkable{

	public RoboticDog(String name, String type, int age) {
		super(name, type, age);
		
	}
	
	
	
	public void foo () {
		System.out.println("fooing");
		
	}

	@Override
	public void energizePet() {
		
		
	}

	@Override
	public void walk() {
		
	}
	
	

	
}

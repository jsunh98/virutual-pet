package childClasses;

import interfaces.Walkable;
import orgRobClass.OrganicPet;

public class OrganicDog extends OrganicPet implements Walkable{

	public OrganicDog(String name, String type, String species) {
		super(name, type, species);
		
	
	}

	public void run() {
		System.out.println("is running...and shitting");
	}
	public void stats () {
		super.stats();
		System.out.println("Your animal can run, and it leaves giant shits.");
	}

	@Override
	public void walk() {
		System.out.println("the dog is walking...and shitting");
	}

//	@Override
//	public void energizePet() {
//		
//		
//	}
}

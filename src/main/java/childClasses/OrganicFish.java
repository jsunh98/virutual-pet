package childClasses;

import interfaces.Swims;
import orgRobClass.OrganicPet;

public class OrganicFish extends OrganicPet implements Swims {

	public OrganicFish(String name, String type, String species) {
		super(name, type, species);

	}

	public void swim() {
		System.out.println("is swimming...");
		
	}
	public void layEggs() {
		System.out.println("shit eggs...");
	}
	public void stats () {
		super.stats();
		System.out.println("Your animal can swim, and it shits golden eggs");
	}

//	@Override
//	public void energizePet() {
//
//	}

}

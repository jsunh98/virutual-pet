package childClasses;

import interfaces.Walkable;
import orgRobClass.OrganicPet;

public class OrganicDog extends OrganicPet implements Walkable{

	public OrganicDog(String name, String type, int age) {
		super(name, type, age);
		
	
	}

	public void run() {
		System.out.println("is running...");
	}
	public void stats () {
		super.stats();
		System.out.println("your animal can run and poo poo");
	}

	@Override
	public void walk() {
		System.out.println("the dog is walking...");
	}

	@Override
	public void energizePet() {
		
		
	}
}

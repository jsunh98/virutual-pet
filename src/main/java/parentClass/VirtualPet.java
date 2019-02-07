package parentClass;

import orgRobClass.OrganicPet;
import parentClass.VirtualPet;

public abstract class VirtualPet {

	// these are instances -- these are the problems the pet faces (properties)
	private String name, type;
	private int age;
	
	public VirtualPet(String name, String type, int age) { // name and type constructor
		this.name = name;
		this.type = type;
		this.age = 0;

	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;

	}

	public int getAge() {
		return age;
	}

	public void tick() { // Start of the methods dictate how users interact.
		age += 1;

	}
	public void play() {
		
	}
	public void stats () {
		System.out.println("Here is a list of your stats: " +  "\n" + name +"\n" + type +"\n" + age);
	
	}
	
	public static String getSpecies() {
		
		return null;
	}
	public abstract void energizePet ();

	@Override
	public String toString() {
		return "\nPet [name=" + name + ", type=" + type + ", age=" + age + "]";
	}

	
}

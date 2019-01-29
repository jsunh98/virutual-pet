package org.wecancodeit;

import org.wecancodeit.VirtualPet;

public class VirtualPet {

	// these are instances -- these are the problems the pet faces (properties)
	private String name;
	private int age;
	
	public VirtualPet(String name, int age, int hunger, int sleepy, int energy) { // constructor
		// creating instance of a class. These are properties. Properties are
		// states of
		// classes.
		this.name = name;
		this.age = age;
		
	}

	public VirtualPet(String name, int age) { // constructor
		// creating instance of a class. These are properties. Properties are
		// states of
		// classes.
		this.name = name;
		this.age = age;
	}

	


	@Override
	public String toString() {
		return "\nVirtualPet [name=" + name + ", age=" + age + ", hunger=" + hunger + ", sleepy=" + sleepy + ", energy="
				+ energy + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}



	public void tick() { // Start of the methods dictate how users interact.
		hunger = hunger + 10;
		age = age + 1;

	}


}
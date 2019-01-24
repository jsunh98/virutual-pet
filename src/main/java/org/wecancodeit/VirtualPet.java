package org.wecancodeit;

import org.wecancodeit.VirtualPet;

public class VirtualPet {

	// these are instances -- these are the problems the pet faces (properties)
	private String name;
	private int age;
	private int hunger;
	private int sleepy; 

	public VirtualPet(String name, int age, int hunger, int sleepy) { // constructor
		// creating instance of a class. These are properties. Properties are states of
		// classes.
		this.name = name;
		this.age = age;
		this.hunger = hunger;
		this.sleepy = sleepy; 

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHunger() {
		return hunger;
	}
	
	public int getSleepy() {
		return sleepy; 
	}

	public void tick() { // Start of the methods dictate how users interact.
		hunger = hunger + 10;
		age = age + 1;

	}

}
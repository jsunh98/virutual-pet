package org.wecancodeit;

import org.wecancodeit.VirtualPet;

public class VirtualPet {

	// these are instances -- these are the problems the pet faces (properties)
	private String name;
	private int age;
	private int hunger;
	private int sleepy;
	private int energy;

	public VirtualPet(String name, int age, int hunger, int sleepy, int energy) { // constructor
		// creating instance of a class. These are properties. Properties are states of
		// classes.
		this.name = name;
		this.age = age;
		this.hunger = hunger;
		this.sleepy = sleepy; 
		this.energy = energy; 

	}
	public VirtualPet(String name, int age) { // constructor
		// creating instance of a class. These are properties. Properties are states of
		// classes.
		this.name = name;
		this.age = age;
		this.hunger = 20;
		this.sleepy = 20; 
		this.energy = 20; 

	}
	@Override
	public String toString() {
		return "VirtualPet [name=" + name + ", age=" + age + ", hunger=" + hunger + ", sleepy=" + sleepy + ", energy="
				+ energy + "]";
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
	
	public int getEnergy() {
		return energy; 
	}

	public void tick() { // Start of the methods dictate how users interact.
		hunger = hunger + 10;
		age = age + 1;

	}
	public void getFed() {
		energy += 20;
		
		return fed;
	}
}
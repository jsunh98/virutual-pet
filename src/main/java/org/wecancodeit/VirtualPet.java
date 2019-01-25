package org.wecancodeit;

import org.wecancodeit.VirtualPet;

public class VirtualPet {

	private String type; // these are instances -- these are the problems the pet faces (properties)
	private String name;
	private String dirty;
	private int age;
	private int hunger;
	private String condition;
	private boolean sleepiness;

	public VirtualPet(String type, String name, String clean, int age, int hunger, int petting, boolean boredom) { // constructor
		this.type = type; // creating instance of a class. These are properties. Properties are states of
							// classes.
		this.name = name;
		this.dirty = dirty;
		this.age = age;
		this.hunger = hunger;
		this.condition = condition;
		this.sleepiness = sleepiness;

	}

	public String getType() { // These are the getters. Getters allow us to access values of private methods.
		return type;
	}

	public String getName() {
		return name;
	}

	public String getDirty() {
		return dirty;
	}

	public int getAge() {
		return age;
	}

	public int getHunger() {
		return hunger;
	}

	public String getCondition() {
		return condition;
	}

	public boolean getSleepiness() {
		return sleepiness;

	}

	public void tick() { // Start of the methods dictate how users interact.
		hunger = hunger + 10;
		age = age + 1;

	}
	
	
		
		
		
	}

	public String boredom
	{
	}
}
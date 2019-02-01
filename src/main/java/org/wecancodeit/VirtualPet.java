package org.wecancodeit;

import org.wecancodeit.VirtualPet;

public class VirtualPet {

	// these are instances -- these are the problems the pet faces (properties)
	private String name, type;
	private int age;

	public VirtualPet(String name, String type, int age) { // name and type constructor
		this.name = name;
		this.type = type;
		this.age = 0;

	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void tick() { // Start of the methods dictate how users interact.
		age += age;

	}

}
package org.wecancodeit;

public class OrganicFish extends VirtualPet {

	public OrganicFish(String name, String type, int age) {
		super(name, type, age);

	}

	public void swim() {
		System.out.println("is swimming...");
	}

	@Override
	public void energizePet() {

	}

}

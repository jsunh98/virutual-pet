package orgRobClass;

import parentClass.VirtualPet;

public class OrganicPet extends VirtualPet {

	private int hunger;
	private int sleepy;
	private int energy;

//	VirtualPet pet = new OrganicPet("Oprah", "organic", 0);

	public OrganicPet(String name, String type, int age) { // Calling common properties
		// shared by all = Virtual Pet
		super(name, type, age);

		this.hunger = 20;
		this.sleepy = 20;
		this.energy = 20;

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

	public void feed() {
		energy += 20;
		sleepy += 10;
		hunger = 0;

	}

	public void play() {
		energy -= 20;
		sleepy += 10;
		hunger += 30;
	}

	public void sleep() {
		energy = 100;
		sleepy = 0;
		hunger += 5;

	}

	public void tick() { // Start of the methods dictate how users interact.
		energy = energy - 5;
		sleepy = sleepy + 5;
		hunger = hunger + 10;
		super.tick();
	}
	@Override
	public void energizePet() {
		sleepy = 0;
	}


}

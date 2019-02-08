package orgRobClass;

import parentClass.VirtualPet;

public class OrganicPet extends VirtualPet {

	private int hunger;
	private int sleepy;
	private int energy;

//	VirtualPet pet = new OrganicPet("Oprah", "organic", 0);

	public OrganicPet(String name, String type, String species) { // Calling common properties
		// shared by all = Virtual Pet
		super(name, type, species);

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
		hunger += 10;
	}

	public void sleep() {
		energy = 20;
		sleepy = 0;
		hunger += 5;

	}

	public void tick() { // Start of the methods dictate how users interact.
		energy = energy - 5;
		sleepy = sleepy + 5;
		hunger = hunger + 10;

	}
	
	public void stats() {
		super.stats();
		System.out.println(" Energy Level: " + this.energy + "%\n Sleepiness Level: " + this.sleepy + "%\n Hunger Level: " + hunger + "%");
		
		
	}

	@Override
	public void energizePet() {
		this.sleepy = 0;
	}

	public int getStatus() {
		return getStatus();

	}
	
}
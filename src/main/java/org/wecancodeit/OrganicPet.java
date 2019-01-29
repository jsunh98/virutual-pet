package org.wecancodeit;

public class OrganicPet extends VirtualPet {

	private int hunger;
	private int sleepy;
	private int energy;

	public OrganicPet(String name, int age) { // Calling common properties
												// shared by all = Virtual Pet
		super(name, age);

		this.hunger = hunger;
		this.sleepy = sleepy;
		this.energy = energy;

		this.hunger = 20;
		this.sleepy = 20;
		this.energy = 20;

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
	}
	
}

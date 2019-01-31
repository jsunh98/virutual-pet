package org.wecancodeit;

public class RoboticPet extends VirtualPet {
	
	private int batteryLevel;
	private int oilLevel;
	private boolean oilChange;

	Shelter pets = new Shelter();
	VirtualPet pet = new VirtualPet("Oprah", 5, 50, 60, 45);

	public RoboticPet(String name, int age, boolean oilChange, int chargeBattery) {
		super(name, age);

		this.oilChange = false;
		this.batteryLevel = batteryLevel;

	}
	public int getOilLevel() {
		return oilLevel;
	}
	public boolean isOilChange() {
		return oilChange;
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}

	public Shelter getPets() {
		return pets;
	}

	public VirtualPet getPet() {
		return pet;
	}

	public void tick() {
		oilLevel -= 10; 
		batteryLevel -= 15;
	}

	public void chargeBattery() {
		batteryLevel += 100;
		
	}

	public void oilChange() {
		oilChange = true;
		
	}
	public void playMode() {
		batteryLevel -= 25;
		
	}

}

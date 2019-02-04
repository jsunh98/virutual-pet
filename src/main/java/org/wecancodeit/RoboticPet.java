package org.wecancodeit;

public class RoboticPet extends VirtualPet {

	private int batteryLevel;
	private int oilLevel;
	private boolean oilChange;

//	VirtualPet pet = new RoboticPet("Oprah", "robotic", 0);

	public RoboticPet(String name, String type, int age) { // Calling common properties
		// shared by all = Virtual Pet
		super(name, type, age);

		this.oilChange = false;
		this.batteryLevel = 0;

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

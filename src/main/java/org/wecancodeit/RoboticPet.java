package org.wecancodeit;

public class RoboticPet extends VirtualPet {

	private int batteryLevel;
	private int oilLevel;
	private Boolean oilChange;

//	VirtualPet pet = new RoboticPet("Oprah", "robotic", 0);

	public RoboticPet(String name, String type, int age) { // Calling common properties
		// shared by all = Virtual Pet
		super(name, type, age);
		
		this.oilLevel = 100;
		this.oilChange(false);
		this.batteryLevel = 0;
		
	}

	public int getOilLevel() {
		return oilLevel;
	}

	public Boolean getOilChange() {
		return oilChange;
	}


	public int getBatteryLevel() {
		return batteryLevel;
	}

	public void chargeBattery() {
		batteryLevel += 100;
	}

	public void oilChange(boolean b) {
		oilChange=(true);

	}
	@Override
	public void energizePet() {
		batteryLevel = 100;
	}

	public void playMode() {
		batteryLevel -= 25;

	}

	public void tick() {
		oilLevel -= 10;
		batteryLevel -= 15;
		
	}


	


}

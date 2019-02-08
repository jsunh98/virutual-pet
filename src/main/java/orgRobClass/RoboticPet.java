package orgRobClass;

import parentClass.VirtualPet;

public class RoboticPet extends VirtualPet {

	private int batteryLevel;
	private Boolean chargeBattery;
	private int oilLevel;
	private Boolean oilChange;

//	VirtualPet pet = new RoboticPet("Oprah", "robotic", 0);

	public RoboticPet(String name, String type, String species) { // Calling common properties
		// shared by all = Virtual Pet
		super(name, type, species);
		
		this.oilLevel = 100;
		this.oilChange(false);
		this.batteryLevel = 100;
		this.chargeBattery(false);
		
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
	
	public Boolean getChargeBattery() {
		return chargeBattery;
	}
	public void chargeBattery(boolean b) {
		batteryLevel = 100;
	}

	public void oilChange(boolean b) {
		oilChange=(true);

	}
	@Override
	public void energizePet() {
		this.batteryLevel = 100;
		this.oilLevel = 100;
	}

	public void play() {
		batteryLevel -= 25;
		oilLevel -=25;

	}
	public void stats() {
		super.stats();
		System.out.println(" Battery Level: " + this.batteryLevel + "%\n Oil Level: " + this.oilLevel +"%");
		
		
	}
	

	public void tick() {
		oilLevel -= 10;
		batteryLevel -= 15;
		
	}


	


}

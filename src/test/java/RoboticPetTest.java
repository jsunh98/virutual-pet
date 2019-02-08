import static org.junit.Assert.*;

import org.junit.Test;

import childClasses.RoboticDog;
import childClasses.RoboticFish;
import orgRobClass.RoboticPet;
import parentClass.VirtualPet;

public class RoboticPetTest {

	@Test
	public void shouldChargeBattery() {
		VirtualPet roboticPet = new RoboticFish("","","");
		int initialBatteryLevel = ((RoboticPet) roboticPet).getBatteryLevel();
		((RoboticPet)roboticPet).chargeBattery(false);
		int batteryLevelAfterCharge = ((RoboticPet) roboticPet).getBatteryLevel();
		assertEquals(100, batteryLevelAfterCharge);			
	}
	
	@Test
	public void shouldChangeOil() {
		VirtualPet roboticPet = new RoboticDog("","","");		
		((RoboticDog)roboticPet).getOilChange();		
		assertEquals(((RoboticPet) roboticPet).getOilChange(), true);
	}
	
	@Test
	public void shouldEnergizePet() {
		VirtualPet roboticPet = new RoboticPet("","","");
		int initialBatteryLevel = ((RoboticPet) roboticPet).getBatteryLevel();
		((RoboticPet)roboticPet).energizePet();
		int batteryAfterEnergized = ((RoboticPet) roboticPet).getBatteryLevel();
		assertEquals(100, batteryAfterEnergized);
	}
	
	@Test
	public void shouldPlayMode() {
		VirtualPet roboticPet = new RoboticPet("","","");
		int initialBatteryLevel = ((RoboticPet) roboticPet).getBatteryLevel();
		((RoboticPet)roboticPet).play();
		int batteryLevelAfterPlayMode= ((RoboticPet) roboticPet).getBatteryLevel();
		assertEquals(initialBatteryLevel - 25, batteryLevelAfterPlayMode);
	}
	
	@Test
	public void shouldtick() {
		VirtualPet roboticPet = new RoboticPet("","","");
		int initialBatteryLevel = ((RoboticPet) roboticPet).getBatteryLevel();
		int initialOilLevel = ((RoboticPet) roboticPet).getOilLevel();
		((RoboticPet)roboticPet).tick();
		int batteryLevelAfterTick = ((RoboticPet) roboticPet).getBatteryLevel();
		int oilLevelAfterTick = ((RoboticPet) roboticPet).getOilLevel();
		assertEquals(initialBatteryLevel - 15, batteryLevelAfterTick);
		assertEquals(initialOilLevel - 10, oilLevelAfterTick);
	}
	
}

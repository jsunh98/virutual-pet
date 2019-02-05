import static org.junit.Assert.*;

import org.junit.Test;
import org.wecancodeit.RoboticPet;
import org.wecancodeit.VirtualPet;

public class RoboticPetTest {

	@Test
	public void shouldChargeBattery() {
		VirtualPet roboticPet = new RoboticPet("","",0);
		int initialBatteryLevel = ((RoboticPet) roboticPet).getBatteryLevel();
		((RoboticPet)roboticPet).chargeBattery();
		int batteryLevelAfterCharge = ((RoboticPet) roboticPet).getBatteryLevel();
		assertEquals(100, batteryLevelAfterCharge);			
	}
	
	@Test
	public void shouldChangeOil() {
		VirtualPet roboticPet = new RoboticPet("","",0);		
		((RoboticPet)roboticPet).getOilChange();		
		assertEquals(((RoboticPet) roboticPet).getOilChange(), true);
	}
	
	@Test
	public void shouldEnergizePet() {
		VirtualPet roboticPet = new RoboticPet("","",0);
		int initialBatteryLevel = ((RoboticPet) roboticPet).getBatteryLevel();
		((RoboticPet)roboticPet).energizePet();
		int batteryAfterEnergized = ((RoboticPet) roboticPet).getBatteryLevel();
		assertEquals(100, batteryAfterEnergized);
	}
	
	@Test
	public void shouldPlayMode() {
		VirtualPet roboticPet = new RoboticPet("","",0);
		int initialBatteryLevel = ((RoboticPet) roboticPet).getBatteryLevel();
		((RoboticPet)roboticPet).playMode();
		int batteryLevelAfterPlayMode= ((RoboticPet) roboticPet).getBatteryLevel();
		assertEquals(initialBatteryLevel - 25, batteryLevelAfterPlayMode);
	}
	
	@Test
	public void shouldtick() {
		VirtualPet roboticPet = new RoboticPet("","",0);
		int initialBatteryLevel = ((RoboticPet) roboticPet).getBatteryLevel();
		int initialOilLevel = ((RoboticPet) roboticPet).getOilLevel();
		((RoboticPet)roboticPet).tick();
		int batteryLevelAfterTick = ((RoboticPet) roboticPet).getBatteryLevel();
		int oilLevelAfterTick = ((RoboticPet) roboticPet).getOilLevel();
		assertEquals(initialBatteryLevel - 15, batteryLevelAfterTick);
		assertEquals(initialOilLevel - 10, oilLevelAfterTick);
	}
	
}

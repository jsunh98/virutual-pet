import static org.junit.Assert.*;

import org.junit.Test;
import org.wecancodeit.RoboticPet;
import org.wecancodeit.VirtualPet;

public class RoboticPetTest {

	@Test
	public void shouldChargeBattery() {
		VirtualPet underTest = new RoboticPet("","",0);
		int initialBatteryLevel = ((RoboticPet)underTest).getBatteryLevel();
	}

}

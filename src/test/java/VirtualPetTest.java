import static org.junit.Assert.assertEquals;

import org.junit.Test;

import orgRobClass.OrganicPet;
import orgRobClass.RoboticPet;
import parentClass.VirtualPet;

public class VirtualPetTest {

	@Test
	public void shouldBeAbleToCreatePet() {
		VirtualPet petType = new OrganicPet("Oprah", "organic", "");
	}

	@Test
	public void petShouldHaveName() {
		VirtualPet underTest = new OrganicPet("Jeff","", "");
		String expected = underTest.getName();
		assertEquals(expected, "Jeff");
	}

	
	
	
}

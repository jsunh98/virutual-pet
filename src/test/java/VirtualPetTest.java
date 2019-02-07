import static org.junit.Assert.assertEquals;

import org.junit.Test;

import orgRobClass.OrganicPet;
import parentClass.VirtualPet;

public class VirtualPetTest {

	@Test
	public void shouldBeAbleToCreatePet() {
		VirtualPet petType = new OrganicPet("Oprah", "organic", 0);
	}

	@Test
	public void petShouldHaveName() {
		VirtualPet underTest = new OrganicPet("Jeff","", 0);
		String expected = underTest.getName();
		assertEquals(expected, "Jeff");
	}

	@Test
	public void shouldTick() {
		VirtualPet underTest = new OrganicPet("Jeff","", 0);
		int initialPetAge = ((OrganicPet)underTest).getAge();
		((OrganicPet)underTest).tick();
		int petAgeAfterTick = ((OrganicPet)underTest).getAge();
		assertEquals(initialPetAge + 1, petAgeAfterTick);
	}
}

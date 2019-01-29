import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.wecancodeit.VirtualPet;

public class VirtualPetTest {

	@Test
	public void shouldBeAbleToCreatePet() {
		VirtualPet petType = new VirtualPet("", 0, 0, 0);
	}

	@Test
	public void petShouldHaveName() {
		VirtualPet underTest = new VirtualPet("Jeff", 0, 0, 0);

		String expected = underTest.getName();

		assertEquals(expected, "Jeff");
	}

	@Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new VirtualPet("",0,10,0);

        int expected = underTest.getHunger();

        assertEquals(expected, 10);
    }
}

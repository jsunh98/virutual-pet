import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.wecancodeit.OrganicPet;
import org.wecancodeit.VirtualPet;

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
    public void shouldHaveDefaultHunger() {
        OrganicPet underTest = new OrganicPet("Oprah", "organic", 0);

        int expected = ((OrganicPet.underTest.getHunger()));

        assertEquals(expected, 10);
    }
}

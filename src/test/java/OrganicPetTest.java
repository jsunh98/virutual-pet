
import static org.junit.Assert.*;

import org.junit.Test;
import org.wecancodeit.OrganicPet;
import org.wecancodeit.VirtualPet;

public class OrganicPetTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
    public void shouldHaveDefaultHunger() {
      VirtualPet organicPet = new OrganicPet("","",0);

        int expected = organicPet.getHunger();

        assertEquals(expected, 10);
	}
        @Test
    	public void shouldFeed() {
    		VirtualPet organicPet = new OrganicPet("","",0);
    		((OrganicPet) organicPet).feed();
    		int hungerafterfeeding = ((OrganicPet) organicPet).getHunger();
    		assertEquals(0, hungerafterfeeding);
    		

    	}

}

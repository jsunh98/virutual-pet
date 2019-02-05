
import static org.junit.Assert.*;

import org.junit.Test;
import org.wecancodeit.OrganicPet;
import org.wecancodeit.VirtualPet;

public class OrganicPetTest {


      @Test
    	public void shouldFeedPet() {
    		VirtualPet organicPet = new OrganicPet("","",0);
    		((OrganicPet) organicPet).feed();
    		int hungerafterfeeding = ((OrganicPet) organicPet).getHunger();
    		assertEquals(0, hungerafterfeeding);
    		

   	}
      
      @Test
      	public void shouldLetPetSleep() {
    	  	VirtualPet organicPet = new OrganicPet("","",0);
  			((OrganicPet) organicPet).sleep();
  			int hungerafterfeeding = ((OrganicPet) organicPet).getHunger();
  			assertEquals(0, hungerafterfeeding); 
      }
}

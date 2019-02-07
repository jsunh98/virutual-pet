	import static org.junit.Assert.*;
	
	import org.junit.Test;

import orgRobClass.OrganicPet;
import parentClass.VirtualPet;
	
	public class OrganicPetTest {
	
		@Test
		public void shouldFeedPet() {
			VirtualPet organicPet = new OrganicPet("", "", 0);
			int energyBeforeFeeding = ((OrganicPet) organicPet).getEnergy();
			int sleepyBeforeFeeding = ((OrganicPet) organicPet).getSleepy();
			((OrganicPet) organicPet).feed();
			int hungerafterfeeding = ((OrganicPet) organicPet).getHunger();
			int energyAfterFeeding = ((OrganicPet) organicPet).getEnergy();
			int sleepyAfterFeeding = ((OrganicPet) organicPet).getSleepy();
			assertEquals(0, hungerafterfeeding);
			assertEquals(energyBeforeFeeding + 20, energyAfterFeeding);
			assertEquals(sleepyBeforeFeeding + 10, sleepyAfterFeeding);
	
		}
	
		@Test
		public void shouldPlayWithPet() {
			VirtualPet organicPet = new OrganicPet("", "", 0);
			int hungerBeforePlaying = ((OrganicPet) organicPet).getHunger();
			int energyBeforePlaying = ((OrganicPet) organicPet).getEnergy();
			int sleepyBeforePlaying = ((OrganicPet) organicPet).getSleepy();
			((OrganicPet) organicPet).play();
			int hungerAfterPlaying = ((OrganicPet) organicPet).getHunger();
			int energyAfterPlaying = ((OrganicPet) organicPet).getEnergy();
			int sleepyAfterPlaying = ((OrganicPet) organicPet).getSleepy();
			assertEquals(hungerBeforePlaying + 30, hungerAfterPlaying);
			assertEquals(energyBeforePlaying - 20, energyAfterPlaying);
			assertEquals(sleepyBeforePlaying + 10, sleepyAfterPlaying);
	
		}
	
		@Test
		public void shouldLetPetSleep() {
			VirtualPet organicPet = new OrganicPet("", "", 0);
			int hungerBeforeSleeping = ((OrganicPet) organicPet).getHunger();
			((OrganicPet) organicPet).sleep();
			int hungerAfterSleeping = ((OrganicPet) organicPet).getHunger();
			int energyAfterSleeping = ((OrganicPet) organicPet).getEnergy();
			int sleepyAfterSleeping = ((OrganicPet) organicPet).getSleepy();
			assertEquals(hungerBeforeSleeping + 5, hungerAfterSleeping);
			assertEquals(100, energyAfterSleeping);
			assertEquals(0, sleepyAfterSleeping);
		}
	
		@Test
		public void shouldTick() {
			VirtualPet organicPet = new OrganicPet("", "", 0);
			int hungerBeforeTick = ((OrganicPet) organicPet).getHunger();
			int energyBeforeTick = ((OrganicPet) organicPet).getEnergy();
			int sleepyBeforeTick = ((OrganicPet) organicPet).getSleepy();
			((OrganicPet) organicPet).tick();
			int hungerAfterTick = ((OrganicPet) organicPet).getHunger();
			int energyAfterTick = ((OrganicPet) organicPet).getEnergy();
			int sleepyAfterTick = ((OrganicPet) organicPet).getSleepy();
			assertEquals(hungerBeforeTick + 10, hungerAfterTick);
			assertEquals(energyBeforeTick - 5, energyAfterTick);
			assertEquals(sleepyBeforeTick + 5, sleepyAfterTick);
	
		}
	
	}


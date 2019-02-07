import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;
import org.wecancodeit.Shelter;

import orgRobClass.OrganicPet;
import orgRobClass.RoboticPet;
import parentClass.VirtualPet;

public class ShelterTest {
	
		@Test
		public void shouldAddPetToShelter() {
			Shelter underTest = new Shelter(new HashMap<>()); //creates new shelter to pass through test
			VirtualPet petToAdd = new OrganicPet("","",0);//creates new pet to pass through test
			int initialPets = ((Shelter) underTest).getPetsLength();//gets the amount of pets before adding
			underTest.addVirtualPet(petToAdd);//adds a pet to the list
			int petsAfterAddition = ((Shelter) underTest).getPetsLength(); //gets the amount of pets after adding 
			assertEquals(initialPets + 1, petsAfterAddition); 
			
		}
	
		@Test
		public void shouldRemovePetFromShelter() {
			Shelter underTest = new Shelter(new HashMap<>());//creates shelter
			underTest.addVirtualPet(new OrganicPet("","",0));
			int initialPets = ((Shelter) underTest).getPetsLength();//gets the amount of pets before adding
			underTest.removeVirtualPet("");
			int petsAfterSubtraction = ((Shelter) underTest).getPetsLength();
			assertEquals(initialPets - 1, petsAfterSubtraction);
		}
		
		@Test
		public void shouldFeedAllPets() {
			Shelter underTest = new Shelter(new HashMap<>()); 
			underTest.addVirtualPet(new OrganicPet("bill","",0));//creates new pet to pass through test
			underTest.addVirtualPet(new OrganicPet("sam","",0));//creates new pet to pass through test
			underTest.feedAllPets();
			assertEquals(((OrganicPet)underTest.interactIndividualPet("bill")).getHunger(), 0);
			assertEquals(((OrganicPet)underTest.interactIndividualPet("sam")).getHunger(), 0);
		}
		
		@Test
		public void shouldChargeAllPets() {
			Shelter underTest = new Shelter(new HashMap<>()); 
			underTest.addVirtualPet(new RoboticPet("pat","",0));//creates new pet to pass through test
			underTest.addVirtualPet(new RoboticPet("spot","",0));//creates new pet to pass through test
			underTest.chargeAllPets();
			assertEquals(((RoboticPet)underTest.interactIndividualPet("pat")).getBatteryLevel(), 100);
			assertEquals(((RoboticPet)underTest.interactIndividualPet("spot")).getBatteryLevel(), 100);
		}
		@Test
		public void shouldChangeOilOfAllRoboticPets() {
			Shelter underTest = new Shelter(new HashMap<>()); 
			underTest.addVirtualPet(new RoboticPet("pat","",0));//creates new pet to pass through test
			underTest.addVirtualPet(new RoboticPet("spot","",0));//creates new pet to pass through test
			underTest.oilChangeAllPets();
			assertEquals(((RoboticPet)underTest.interactIndividualPet("pat")).getOilChange(), true);
			assertEquals(((RoboticPet)underTest.interactIndividualPet("spot")).getOilChange(), true);
			
		}
		
		@Test
		public void shouldSleepAllPets() {
			Shelter underTest = new Shelter(new HashMap<>()); 
			underTest.addVirtualPet(new OrganicPet("bill","",0));//creates new pet to pass through test
			underTest.addVirtualPet(new OrganicPet("sam","",0));//creates new pet to pass through test
			underTest.putAllPetsToSleep();
			assertEquals(((OrganicPet)underTest.interactIndividualPet("bill")).getSleepy(), 0);
			assertEquals(((OrganicPet)underTest.interactIndividualPet("sam")).getSleepy(), 0);
		}	
		
		
	}

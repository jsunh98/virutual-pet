import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;
import org.wecancodeit.Shelter;

import childClasses.OrganicDog;
import childClasses.OrganicFish;
import childClasses.RoboticDog;
import childClasses.RoboticFish;
import orgRobClass.OrganicPet;
import orgRobClass.RoboticPet;
import parentClass.VirtualPet;

public class ShelterTest {
	
		@Test
		public void shouldAddPetToShelter() {
			Shelter underTest = new Shelter(new HashMap<>()); //creates new shelter to pass through test
			VirtualPet petToAdd = new OrganicDog("","","");//creates new pet to pass through test
			int initialPets = ((Shelter) underTest).getPetsLength();//gets the amount of pets before adding
			underTest.addVirtualPet(petToAdd);//adds a pet to the list
			int petsAfterAddition = ((Shelter) underTest).getPetsLength(); //gets the amount of pets after adding 
			assertEquals(initialPets + 1, petsAfterAddition); 
			
		}
	
		@Test
		public void shouldRemovePetFromShelter() {
			Shelter underTest = new Shelter(new HashMap<>());//creates shelter
			underTest.addVirtualPet(new OrganicFish("","",""));
			int initialPets = ((Shelter) underTest).getPetsLength();//gets the amount of pets before adding
			underTest.removeVirtualPet("");
			int petsAfterSubtraction = ((Shelter) underTest).getPetsLength();
			assertEquals(initialPets - 1, petsAfterSubtraction);
		}
		
		@Test
		public void shouldFeedAllPets() {
			Shelter underTest = new Shelter(new HashMap<>()); 
			underTest.addVirtualPet(new OrganicFish("bill","",""));//creates new pet to pass through test
			underTest.addVirtualPet(new OrganicDog("sam","",""));//creates new pet to pass through test
			underTest.feedAllPets();
			assertEquals(((OrganicFish)underTest.getPet("bill")).getHunger(), 0);
			assertEquals(((OrganicDog)underTest.getPet("sam")).getHunger(), 0);
		}
		
		@Test
		public void shouldChargeAllPets() {
			Shelter underTest = new Shelter(new HashMap<>()); 
			underTest.addVirtualPet(new RoboticFish("pat","",""));//creates new pet to pass through test
			underTest.addVirtualPet(new RoboticDog("spot","",""));//creates new pet to pass through test
			underTest.chargeAllPets();
			assertEquals(((RoboticFish)underTest.getPet("pat")).getBatteryLevel(), 100);
			assertEquals(((RoboticDog)underTest.getPet("spot")).getBatteryLevel(), 100);
		}
		@Test
		public void shouldChangeOilOfAllRoboticPets() {
			Shelter underTest = new Shelter(new HashMap<>()); 
			underTest.addVirtualPet(new RoboticFish("pat","",""));//creates new pet to pass through test
			underTest.addVirtualPet(new RoboticDog("spot","",""));//creates new pet to pass through test
			underTest.oilChangeAllPets();
			assertEquals(((RoboticFish)underTest.getPet("pat")).getOilChange(), true);
			assertEquals(((RoboticDog)underTest.getPet("spot")).getOilChange(), true);
			
		}
		
		@Test
		public void shouldSleepAllPets() {
			Shelter underTest = new Shelter(new HashMap<>()); 
			underTest.addVirtualPet(new OrganicPet("bill","",""));//creates new pet to pass through test
			underTest.addVirtualPet(new OrganicPet("sam","",""));//creates new pet to pass through test
			underTest.putAllPetsToSleep();
			assertEquals(((OrganicPet)underTest.getPet("bill")).getSleepy(), 0);
			assertEquals(((OrganicPet)underTest.getPet("sam")).getSleepy(), 0);
		}	
		
		
		
		
	}

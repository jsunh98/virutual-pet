package org.wecancodeit;

import java.util.HashMap;

public class Shelter {

	// Build play pen and learn how to add virtual pets and remove them from play
	// pen. (Array type pool of pets) (a while loop)
	// Loop to feed all pets
	// Loop to walk all pets
	// Be able to interact with one specific pet
	// Start of the methods dictate how users interact.

	private HashMap<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void addVirtualPet(VirtualPet petToAdd) {
		pets.put(petToAdd.getName(), petToAdd);

	}

	public HashMap<String, VirtualPet> getAllPets(){
		return pets;
		
	}
	public void tickShelter() { //For each loop. For each single pet in shelter will call on the tick method
	for (VirtualPet singlePet : pets.values()) {
		// For each single pet in pet collection lets do something to it.
		singlePet.tick();
	}
	}
	
}

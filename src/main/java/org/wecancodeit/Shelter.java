package org.wecancodeit;

import java.util.HashMap;

public class Shelter {

	
		

	public HashMap<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
		
		

	public void addVirtualPet(VirtualPet petToAdd) {
		pets.put(petToAdd.getName(), petToAdd);
		
	}
	
	public HashMap<String, VirtualPet> getAllPets() {
		return pets;
	}
	public void tickShelter() {// for each loop. for each single pet in shelter will call on the tick method
	for(VirtualPet singlePet: pets.values()) {
		//for each single pet in pet collection lets do something to it.
		singlePet.tick();
	}
	}
}

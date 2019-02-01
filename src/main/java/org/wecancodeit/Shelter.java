package org.wecancodeit;

import java.util.HashMap;

public class Shelter {

	VirtualPet pet = new VirtualPet("Fido", 0);

	// Build play pen and learn how to add virtual pets and remove them from
	// play
	// pen. (Array type pool of pets) (a while loop)
	// Loop to feed all pets
	// Loop to walk all pets
	// Be able to interact with one specific pet
	// Start of the methods dictate how users interact.

	public HashMap<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void addVirtualPet(VirtualPet petToAdd) {
		pets.put(petToAdd.getName(), petToAdd);

	}

	public HashMap<String, VirtualPet> getAllPets() { // below we call on pets
														// to getAllPets =
														// access to hashmap
		return pets;

	}

	public void tickShelter() { // For each loop. For each single pet in shelter
								// will call on the tick method
		for (VirtualPet singlePet : pets.values()) {

			// For each single pet in pet collection lets do something to it.
			singlePet.tick();

		}
	}

	public void putAllPetsToSleep() {
		for (VirtualPet pet : getAllPets().values()) { // we named pet here, call on
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).sleep();// pets.values to see all
			}
			// values, and getSleepy to sleep
			// all in hashmap

		}
	}

	public void playWithAllPets() {
		for (VirtualPet pet : getAllPets().values()) { // we named pet here, call on
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).play();// pets.values to see all
			}
		}

		// values, and getSleepy to sleep
		// all in hashmap

	}

	public void removeVirtualPet(String petName) {
		pets.remove(petName);

	}

	public void feedAllPets() {
		for (VirtualPet pet : getAllPets().values()) { // we named pet here, call on
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();// pets.values to see all
			}
			// values, and getFed to feed
			// all in hashmap

		}
	}

	public void chargeAllPets() {
		for (VirtualPet pet : getAllPets().values()) { // we named pet here, call on
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).chargeBattery();// pets.values to see all
			}
			// values, and getFed to feed
			// all in hashmap

		}
	}

	public VirtualPet interactIndividualPet(String petName) {
		return pets.get(petName);

	}

	public void oilChangeAllPets() {
		for (VirtualPet pet : getAllPets().values()) { // we named pet here, call on
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).oilChange();// pets.values to see all
			}
			// values, and getFed to feed
			// all in hashmap

		}
	}
}
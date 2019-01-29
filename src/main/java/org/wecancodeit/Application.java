package org.wecancodeit;

import java.util.Collection;
import java.util.Scanner;

import atm.Account;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet pet = new VirtualPet("Oprah", 5, 50, 60, 45); // created pet
																	// object.
																	// arbitrarily
																	// hard
																	// coded
																	// values in
																	// constructor
																	// to set up
																	// a pet.
		Shelter shelter = new Shelter(); // here, created object 'shelter'. can
											// now press one to add pet to
											// shelter. =
		shelter.addVirtualPet(pet); // shelter.PetToAdd
		System.out.println("Hello. Welcome to our Virtual Pet shelter.");
		System.out.println("Would you like an organic pet or robotic pet? \nPress 1 for organic, 2 for robotic");
		/*
		 * System.out.println(getName);
		 * 
		 * // System.out.println("Welcome. Here are " + pet.getName() +
		 * "'s vitals"); // System.out.println("1. Hunger Level = " +
		 * pet.getHunger()); // System.out.println("2. Sleep Level = " +
		 * pet.getSleepy()); // System.out.println("3. Age = " + pet.getAge());
		 * // System.out.println("4. Energy = " + pet.getEnergy());
		 */
		menu1();// the first menu with add/remove instructions method extracted

		int userResponse = input.nextInt();
		input.nextLine();
		while (userResponse <= 4) {

			int petAge = 0;
			switch (userResponse) {

			case (1):
				System.out.println("What is your pet's name?");
				String petName = input.nextLine();
				
				System.out.println("What is your pet's age?");
				petAge = input.nextInt();
				input.nextLine();
				VirtualPet petToAdd = new VirtualPet(petName, petAge);
				shelter.addVirtualPet(petToAdd);
				break;
			case (2):
				System.out.println("Which pet would you like to remove?");
				petName = input.nextLine();

				shelter.removeVirtualPet(petName);
				break;
			case (3):
				System.out.println(shelter.getAllPets());
				break;
			case (4):
				System.out.println("Welcome to your pet shelter. What would you like to do?");
				System.out.println("Press 1 to feed all pets");
				System.out.println("Press 2 to play with all pets");
				System.out.println("Press 3 to let all pets sleep");
				System.out.println("Press 4 to interact with a single pet");
				System.out.println("Press 5 to return to the previous menu");
				int userResponse2 = input.nextInt();
				while (userResponse2 < 5)
					;
				switch (userResponse2) {

				case (1):
					shelter.feedAllPets();
				System.out.println("All Pets have been fed!");
				case (2):
				shelter.playWithAllPets();
				System.out.println("You have played with all pets!");
				case (3):
					shelter.putAllPetsToSleep();
				System.out.println("All Pets have been put to sleep!");
					shelter.tickShelter();// put at end of loop, and will tick
											// shelter

				}

			}

			System.out.println("What would you like to do next?");
			System.out.println("Press 1 to add a pet");
			System.out.println("Press 2 to remove a pet");
			System.out.println("Press 3 to see Inventory of pets");
			userResponse = input.nextInt();
			input.nextLine();

		}
	}

	private static void menu1() {
		
		System.out.println("Your goal is to keep your pet alive. Select the options below to begin");
		System.out.println("What would you like to do next?");
		System.out.println("Press 1 to add a pet");
		System.out.println("Press 2 to remove a pet");
		System.out.println("Press 3 to see Inventory of pets");
		System.out.println("Press 4 to enter the shelter");
	}
}

// System.out.println("Would you like an organic pet, or a robotic pet?");
// String petType = input.nextLine();
// // System.out.println(petType);
// System.out.println("Would you like to purchase your pet or adopt?");
// String petSource = input.nextLine();
// // System.out.println(petSource); --> use this to show if adopted or
// purchased
// // System.out.println(petSource + " a pet to be a better person"); --> this
// is a
// // test to make sure our variables are working
//
// System.out.println("What is your pet's name?"); // What the console prompts
//
// String petName = input.nextLine();
//
// System.out.println("Would you like to feed your pet?");
//
// String eat = input.nextLine();
//
// System.out.println("Would you like to walk your pet? Yes or No");//
// System.out.println("Would you like to clean up after your pet?");
// System.out.println("Would you play with your pet?");
//

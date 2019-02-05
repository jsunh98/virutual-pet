package org.wecancodeit;

import java.util.HashMap;
import java.util.Collection;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Shelter pets = new Shelter(new HashMap<>());
		Dog dog1 = new Dog("", "", 0);
		Fish fish1 = new Fish("", "", 0);
		String petSpecies = null;
		boolean isActive = true;

		VirtualPet myOrganicPet = new OrganicPet("Jeff", "organic", 0);
		VirtualPet myRoboticPet = new RoboticPet("Bill", "robotic", 0);
		pets.addVirtualPet(myOrganicPet);
		pets.addVirtualPet(myRoboticPet);

		String petName = null;
		System.out.println("Your goal is to keep your pet alive. Select the options below to begin");

		while (isActive) {
			System.out.println("What would you like to do next?");
			System.out.println("Press 1 to add a pet");
			System.out.println("Press 2 to remove a pet");
			System.out.println("Press 3 to see Inventory of pets");
			System.out.println("Press 4 to enter the shelter");
			System.out.println("");
			int userInput1 = input.nextInt();
			input.nextLine(); // clear the input line
			switch (userInput1) {
			case 1:
				System.out.println(
						"Would you like a robotic pet or a organic pet? \n Type 1 for Robotic \n Type 2 for Organic");
				String petType = input.nextLine();
				if (petType.equals("1")) {
					// petType = myRoboticPet.getType();
					System.out.println("Please enter a name for your pet");
				
					petName = input.nextLine(); // this is how we find individual pets = petUserName
					pets.addVirtualPet(new RoboticPet(petName, petType, 0));
					System.out.println("Here are all your pets");
					System.out.println(pets.getAllPets());
				
				}
				if (petType.equals("2")) {
					petType = myOrganicPet.getType();
					System.out.println("Please enter a name for your pet");
					petName = input.nextLine();
					pets.addVirtualPet(new OrganicPet(petName, petType, 0)); // actual adding
					System.out.println("Here are all your pets");
					System.out.println(pets.getAllPets());
					
				}
				System.out.println("Would you like a dog or fish?");
				if (petSpecies.equals("1")) {
					petSpecies = dog1.getSpecies();
					System.out.println(pets.getAllPets());

				if (petSpecies.equals("2")) {
					petSpecies = fish1.getSpecies();
					System.out.println(pets.getAllPets());
				}
					
				}
				break;
			case 2:
				System.out.println("Here is a list of your pets. Which one would you like to remove?");
				System.out.println(pets.getAllPets());
				petName = input.nextLine(); // this is how we find individual pets = petUserName
				pets.removeVirtualPet(petName);
				System.out.println(pets.getAllPets());
				break;

			case 3:

				System.out.println(pets.getAllPets()); // print out inventory?
				break;

			case (4):
				System.out.println("Welcome to your pet shelter. What would you like to do?");
				System.out.println("Press 1 to feed all pets");
				System.out.println("Press 2 to play with all pets");
				System.out.println("Press 3 to let all pets sleep");
				System.out.println("Press 4 to interact with a single pet");
				System.out.println("Press 5 to view inventory");
				int userResponse2 = input.nextInt();
				while (userResponse2 < 5)
					;
				switch (userResponse2) {

				case (1):
					pets.feedAllPets();
					System.out.println("All Pets have been fed!");
				case (2):
					pets.playWithAllPets();
					System.out.println("You have played with all pets!");
				case (3):
					pets.putAllPetsToSleep();
					System.out.println("All Pets have been put to sleep!");
					pets.tickShelter();// put at end of loop, and will tick
					// shelter
				case (4):
					VirtualPet userPet = pets.interactIndividualPet(petName);
					System.out.println("Welcome. Here is some information on your pet:");
					System.out.println("1. Your pet's name is "+ userPet.getName());
					System.out.println("2. Your pet's age is " + userPet.getAge());
					System.out.println("3.  Your pet is a "+ userPet.getType());
					
				case (5):
					System.out.println("Here is a list of your pets..");
					System.out.println(pets.getAllPets());
					petName = input.nextLine();
					pets.removeVirtualPet(petName);
					System.out.println(pets.getAllPets());
				}

			}
		}
	}

	private static String inputnextLine() {
		// TODO Auto-generated method stub
		return null;
	}
}

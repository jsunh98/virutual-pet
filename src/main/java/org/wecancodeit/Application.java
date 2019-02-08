package org.wecancodeit;

import java.util.HashMap;

import java.util.Scanner;

import childClasses.OrganicDog;
import childClasses.OrganicFish;
import childClasses.RoboticDog;
import childClasses.RoboticFish;
import parentClass.VirtualPet;
public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Shelter pets = new Shelter(new HashMap<>());
		boolean isActive = true;

		VirtualPet jeff = new OrganicFish("Jeff", "organic", "fish");
		VirtualPet bill = new OrganicDog("Bill", "organic", "dog");
		VirtualPet fastEddy = new RoboticFish("FastEddy", "robotic", "fish");
		VirtualPet amanda = new RoboticDog("Amanda", "robotic", "dog");

		pets.addVirtualPet(bill);
		pets.addVirtualPet(jeff);
		pets.addVirtualPet(fastEddy);
		pets.addVirtualPet(amanda);

		String petName = null;
		System.out.println("Your goal is to keep your pet alive. Select the options below to begin");

		while (isActive) {
			System.out.println("What would you like to do next?");
			System.out.println("Press 1 to add a pet");
			System.out.println("Press 2 to remove a pet");
			System.out.println("Press 3 to see Inventory of pets");
			System.out.println("Press 4 to enter the shelter");
			int userInput1 = input.nextInt();
			input.nextLine(); // clear the input line
			String petSpecies;

			switch (userInput1) {
			case (1):
				System.out.println("Would you like a robotic pet or a organic pet? ");
				String petType = input.nextLine();
				if (petType.equalsIgnoreCase("robotic")) {
			
					System.out.println("Please enter a name for your pet");
					petName = input.nextLine(); // this is how we find individual pets = petUserName
					System.out.println("Would you like a dog or fish? ");
					petSpecies = input.nextLine();
					if (petSpecies.equalsIgnoreCase("dog")) {
						pets.addVirtualPet(new RoboticDog(petName, petType, petSpecies));						
						System.out.println("Here are all your pets");
						pets.getAllPetStats();
						
					}
					if (petSpecies.equalsIgnoreCase("fish")) {				
						pets.addVirtualPet(new RoboticFish(petName, petType, petSpecies));
						System.out.println("Here are all your pets");
						pets.getAllPetStats();

					}
				}
				if (petType.equalsIgnoreCase("organic")) {
					System.out.println("Please enter a name for your pet");
					petName = input.nextLine();
					System.out.println("Would you like a dog or fish?");
					petSpecies = input.nextLine();
					if (petSpecies.equalsIgnoreCase("dog")) {
						pets.addVirtualPet(new OrganicDog(petName, petType, petSpecies)); // actual adding
						System.out.println("Here are all your pets");
						pets.getAllPetStats();
					}
					if (petSpecies.equalsIgnoreCase("fish")) {
						pets.addVirtualPet(new OrganicFish(petName, petType, petSpecies)); // actual adding									
						System.out.println("Here are all your pets");
						pets.getAllPetStats();

					}
				}
				break;

			case (2):
				System.out.println("Here is a list of your pets. Which one would you like to remove?");
				System.out.println(pets.getAllPets());
				petName = input.nextLine(); // this is how we find individual pets = petUserName
				pets.removeVirtualPet(petName);
				pets.getAllPetStats();
				break;

			case (3):
				pets.getAllPetStats(); // print out inventory?
				break;

			case (4):
				Boolean foo = true;
				while (foo) {
					System.out.println("Welcome to your pet shelter. What would you like to do?");
					System.out.println("Press 1 to feed all pets");
					System.out.println("Press 2 to play with all pets");
					System.out.println("Press 3 to let all pets sleep");
					System.out.println("Press 4 to interact with a single pet");
					System.out.println("Press 5 to view inventory");
					int userResponse2 = input.nextInt();
					input.nextLine();
					switch (userResponse2) {

					case (1):
						pets.feedAllPets();
						System.out.println("All pets have been fed!");
						pets.getAllPetStats();
						break;
					case (2):
						pets.playWithAllPets();
						System.out.println("You have played with all pets!");
						pets.getAllPetStats();
						break;
					case (3):
						pets.putAllPetsToSleep();
						System.out.println("All Pets have been put to sleep!");		
						pets.getAllPetStats();
						break;

					case (4):
						Boolean foo1 = true;
						System.out.println("Which pet would you like to interact with? Please enter their name");
						System.out.println(pets.getAllPets());
						String selectedPet = input.nextLine();
						VirtualPet petInteractingWith = pets.getPet(selectedPet);
						petInteractingWith.stats();
						while (foo1) {
							System.out.println("What would you like to do with your pet?");
							System.out.println("Press 1 to energize your pet your pet");
							System.out.println("Press 2 to play with your pet");
							String userResponse3 = input.nextLine();
							switch (userResponse3) {

							case "1":
								petInteractingWith.energizePet();
								petInteractingWith.stats();
								break;
							case "2":
								petInteractingWith.play();
								petInteractingWith.stats();
								break;
							}
						}
						break;
					case (5):
						pets.getAllPetStats();
						break;
					}
				}
				System.exit(0);
			}
		}
	}
}

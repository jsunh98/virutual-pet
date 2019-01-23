package org.wecancodeit;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet pet = new VirtualPet();

		System.out.println("Hello. Welcome to our Virtual Pet shelter.");
		{
			System.out.println("Would you like an organic pet, or a robotic pet?");
			String petType = input.nextLine();
			// System.out.println(petType);
			System.out.println("Would you like to purchase your pet or adopt?");
			String petSource = input.nextLine();
			// System.out.println(petSource); --> use this to show if adopted or purchased
			// System.out.println(petSource + " a pet to be a better person"); --> this is a
			// test to make sure our variables are working

			System.out.println("What is your pet's name?"); // What the console prompts

			String petName = input.nextLine();

			System.out.println("Would you like to feed your pet?");

			String eat = input.nextLine();

			System.out.println("Would you like to walk your pet? Yes or No");//
			System.out.println("Would you like to clean up after your pet?");
			System.out.println("Would you ");

		}
	}

}


public VirtualPet(String petName, int hunger) { // constructor
	this.petName = petName; // whatever passed to constructor is name of pet moving forward 

	

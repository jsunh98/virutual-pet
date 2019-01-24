package org.wecancodeit;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet pet = new VirtualPet("Oprah", 10, 1, 2);

		System.out.println("Hello. Welcome to our Virtual Pet shelter.");
		{

			System.out.println("Please choose a name for your pet");
			String getName = input.nextLine();
			// System.out.println(getName);
			
			System.out.println("Please enter an age for your pet");
			String getAge = input.nextLine();
		    //	System.out.println(getAge);
			
			System.out.println("Please enter how hungry your pet is on a scale of 1-5");
			String getHunger = input.nextLine();
			switch (getHunger) {
			case "1":
				System.out.println("Damn " + getName + " is starving!"); 
			}
			
			System.out.println("Would you like to feed your pet? 1 for YES 2 for NO");
			int petFeed = input.nextInt();
			// System.out.println(petFeed);
			if (petFeed == 1) {
				System.out.println("Yes");
			}
			if (petFeed == 2) {
				System.out.println("Congratulations you've killed " + getName);

			}

		}
	}

	// System.out.println("Would you like an organic pet, or a robotic pet?");
//			String petType = input.nextLine();
//			// System.out.println(petType);
//			System.out.println("Would you like to purchase your pet or adopt?");
//			String petSource = input.nextLine();
//			// System.out.println(petSource); --> use this to show if adopted or purchased
//			// System.out.println(petSource + " a pet to be a better person"); --> this is a
//			// test to make sure our variables are working
//
//			System.out.println("What is your pet's name?"); // What the console prompts
//
//			String petName = input.nextLine();
//
//			System.out.println("Would you like to feed your pet?");
//
//			String eat = input.nextLine();
//
//			System.out.println("Would you like to walk your pet? Yes or No");//
//			System.out.println("Would you like to clean up after your pet?");
//			System.out.println("Would you ");

}

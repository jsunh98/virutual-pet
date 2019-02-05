package org.wecancodeit;

public class Dog extends VirtualPet implements Walkable{

	public Dog(String name, String type, int age) {
		super(name, type, age);

	}

	public void run() {
		System.out.println("is running...");
	}

	@Override
	public void walk() {
		System.out.println("the dog is walking...");
	}
}
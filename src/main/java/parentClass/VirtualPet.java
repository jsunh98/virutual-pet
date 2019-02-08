package parentClass;

import java.util.ArrayList;
import java.util.List;

import parentClass.VirtualPet;

public abstract class VirtualPet {

	// these are instances -- these are the problems the pet faces (properties)
	private String name, type, species;
	
	
	
	public VirtualPet(String name, String type, String species) { // name and type constructor
		this.name = name;
		this.type = type;
		this.species = species;

	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;

	}

	public String getSpecies() {
		
		return species;
	}

	

	
	public void play() {
		
	}
	public void stats () {
	
		System.out.println("Here is a list of your stats: " +  "\n Pet Name: " + name +"\n Pet Type: " + type + "\n Pet Species: " + species);
	
	}
	
	public void energizePet() {
		
	}

	@Override
	public String toString() {
	
		
		 return("[Pet Type: " + type + "\n Pet Species: " + species +"]\n");

		
		
	}

	public void tick() {
		// TODO Auto-generated method stub
		
	}


	

	
}

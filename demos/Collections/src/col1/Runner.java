package col1;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;

public class Runner {

	public static void main(String[] args) {
	//List<Dog> kennel = new ArrayList<Dog>();
	//List<Dog> kennel = new LinkedList<Dog>();
	Set<Dog> kennel = new HashSet<Dog>();
	Dog rover = new Dog("Rover");
	Dog spot = new Dog("Spot");
	
	kennel.add(spot);
	kennel.add(rover);
	kennel.add(spot);
	kennel.add(new Dog("Prince"));
	kennel.add(new Dog("Chico"));
	
	for(Dog puppy : kennel) {
		System.out.println(puppy);
	}

	}

}

class Dog {
	private String name;
	public Dog(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
	
	
}
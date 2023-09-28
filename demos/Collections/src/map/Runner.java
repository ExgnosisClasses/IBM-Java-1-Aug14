package map;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Runner {

	public static void main(String[] args) {
	Map<String,Dog> kennel = new HashMap<String,Dog>();
	kennel.put("Lassie", new Dog("Lassie"));
	kennel.put("Rover", new Dog("Rover"));
	kennel.put("Prince", new Dog("Prince"));
	kennel.put("Fido", new Dog("Fido"));
	kennel.put("Fido", new Dog("Fido2"));
	
	Set<String> keys = kennel.keySet();
	for(String k : keys) {
		System.out.println("Key = " + k);
		System.out.println(kennel.get(k));
	}
	System.out.println(kennel.get("xxxx"));

	}

}

class Dog {
	private String name;
	public Dog(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;	}
	
	
}
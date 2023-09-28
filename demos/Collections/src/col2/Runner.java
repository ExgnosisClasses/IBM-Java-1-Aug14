package col2;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;


public class Runner {

	public static void main(String[] args) {
	    SortedSet<String> animals = new TreeSet<>();
		//Set<String> animals = new HashSet<>();
		animals.add("Elephant");
		animals.add("Zebra");
		animals.add("Giraff");
		animals.add("Yeti");
		animals.add("Kracken");
		
		
		Iterator<String> index = animals.iterator();
		
		//animals.add("Kracken2");
		
		while (index.hasNext()) {
			System.out.println(index.next());
		}
		

	}

}


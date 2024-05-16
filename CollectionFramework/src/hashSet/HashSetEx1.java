package hashSet;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {
																	// Create HashSet
		HashSet<String> set = new HashSet<String>();
		
																	//Adding elements
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
																	//Display outputs
		System.out.println("Initial list of Elements: " + set);  	//It doesn't allow duplicate elements
		System.out.println();
		
		
		
		set.remove("Vijay"); 										// Remove Vijay Element
		System.out.println("After remove Vijay: " + set);
		System.out.println();
		
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Vijay");
		set1.add("Arun");
		set1.add("Ajay");
		set1.add("Vinith");
		
		System.out.println("Set1 list of the elements: " + set1);
		System.out.println();
		
		set.addAll(set1);											//Using addAll()
		System.out.println("Updated list: " + set);
		System.out.println();
		
		
		set.removeAll(set1);										//Using removeAll()
		System.out.println("After using removeAll(): " + set);
		System.out.println();
		
		set.clear();
		System.out.println("Set: " + set);
		

	}

}

package vector;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
																				//create a vector
		Vector<String> vec = new Vector<String>(4);
		
																				//Add elements
		vec.add("Lion");
		vec.add("Tiger");
		vec.add("Fox");
		
																				//Display elements, size and capacity
		System.out.println("Display Vector elements: " + vec);
		System.out.println("Size of the Vector: " + vec.size());
		System.out.println("Default capacity of the Vector: " + vec.capacity());
		System.out.println();
		
																				//Add more elements
		vec.add("Elephant");
		vec.addElement("Cat");
		vec.addElement("Rat");
		vec.add("Dog");
		
		
																				//Display elements, size and capacity
		System.out.println("Display New Vector elements: " + vec);
		System.out.println("Size of the Vector after the addition: " + vec.size());  // Size of the vector
		System.out.println("Capacity of the Vector after the addition: " + vec.capacity());  //Capacity of the vector
		System.out.println();
		
																				//Add more elements
		vec.add("Deer");
		vec.addElement("Girraff");
		vec.add(5, "Mongoos");
		vec.add(7, "Cheetah");
		
																				//Display elements, size and capacity
		System.out.println("Display New Vector elements: " + vec);
		System.out.println("Size of the Vector after the addition: " + vec.size()); // New size of the Vector
		System.out.println("Capacity of the Vector after the addition: " + vec.capacity());  //New capacity of the Vector
		System.out.println();
		
		System.out.println("Cat is present at the index " + vec.indexOf("Cat")); //Find index by using element
		System.out.println("The first animal of the vector is = " + vec.firstElement()); // find first index element
		System.out.println("The last animal of the vector is = " + vec.lastElement());   // find last index element
	}

}

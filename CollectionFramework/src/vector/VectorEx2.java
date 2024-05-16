package vector;

import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
																				//Create an Vector
		Vector<Integer> in = new Vector<Integer>();
		
																				//Add elements
		in.add(100);
		in.add(200);
		in.add(300);
		in.add(400);
		in.add(500);
		in.add(600);
		in.add(700);
		
																				//Display vector elements
		System.out.println("Values of the Vector: " + in);
		System.out.println();
		
																				//Remove Vector value by using Integer value
		in.remove((Integer)200);
		System.out.println("Value of the Vector after removing 200: " + in);
		System.out.println();
		
																				//Remove vector value by using Index
		in.remove(1);
		System.out.println("Value of the Vector after removing first index value: " + in);
		System.out.println();
		
																				//Remove an element
		in.removeElementAt(2);
		System.out.println("Vector element after removal: " + in);
		System.out.println();
		
																				//Get the hash code for this vector
		System.out.println("Hash code of this vector: " + in.hashCode());
		System.out.println();
		
																				//Get the element at specified index
		System.out.println("Element at index 1 is = " + in.get(1));
		
	}

}

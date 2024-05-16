package treeClass;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeClassEx1 {

	public static void main(String[] args) {
														//Create tree set
		TreeSet<String> TS = new TreeSet<String>();
														//Add elements
		TS.add("Ajay");
		TS.add("Vijay");
		TS.add("Ajay");
		TS.add("Zeeman");
		TS.add("Raman");
		
		
		Iterator<String> itr = TS.iterator();			//Display outputs(Default ASC Order)
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		
		Iterator<String> i = TS.descendingIterator();	//Display outputs(DESC Order)
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}

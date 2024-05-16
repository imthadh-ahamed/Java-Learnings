package linkedList;

import java.util.*;

public class LinkedListEx1 {

	public static void main(String[] args) {
		
		LinkedList<String> LL1 = new LinkedList<String>();  		//Create LinkedList 1
		
		LL1.add("Ravi");  										//Add elements
		LL1.add("Raja");
		LL1.add(2, "Kamal");
		LL1.add(1, "Amal");
		
		
		Iterator<String> itr = LL1.iterator();  					//Create an Iterator
		
		while(itr.hasNext()) {									//Display output by using Iterator
			System.out.println(itr.next());
		}
		System.out.println();  // new line
		
		
		LinkedList<String> LL2 = new LinkedList<String>();  		//Create LinkedList 2
		
		LL2.add("Ranil");										//Add elements
		LL2.add("Susil");
		
		System.out.println("LinkedList 1 elements: " + LL1);
		System.out.println("LinkedList 2 elements: " + LL2);
		
		LL1.addAll(LL2);										
		System.out.println("After invoking addAll(LL): " + LL1);		//Display outputs after using addAll()
		System.out.println();  //new line
		
		
		
		LinkedList<String> LL3 = new LinkedList<String>(); 				//Create LinkedList 3
		
		LL3.add("Harish"); 											//Add elements
		LL3.add("Vijay");
		
		System.out.println("Before invoking addAll(0, LL): " + LL1);
		LL1.addAll(1, LL3);													//Add second list elements to the fist list at specific position
		System.out.println("After invoking addAll(0, LL): " + LL1);
		System.out.println();
		
		LL1.addFirst("Gota");  											//Inserts the specified element at the beginning of this list
		System.out.println("After invoking addFirst(): " + LL1);
		System.out.println(); 	// newline
		
		LL1.addLast("Hakeem");											//Appends the specified element to the end of this list. 
		System.out.println("After invoking addLast(): " + LL1);
		System.out.println(); 	// newline
		
		LL1.remove("Amal"); 											//Remove specific element from the arrayList
		System.out.println("After removing Amal: " + LL1);
		System.out.println(); 	//newline
		
		LL1.remove(5);  												//Removes the element at the specified position in this list
		System.out.println("After removes index element 3: " + LL1);
		System.out.println();  //newline
		
		LL1.removeAll(LL3);  											//Removing all LL3 elements
		System.out.println("After removing LL3 elements: " + LL1);
		System.out.println(); 	//new line
		
		LL1.removeFirst(); 												//Removing first element from the list
		System.out.println("After removing first element from the list: " + LL1);
		System.out.println();  		//new line
		
		LL1.removeLast();												//Removing last element from the list
		System.out.println("After removing last element from the list: " + LL1);
		System.out.println(); 		//newline
		
		LL1.add("Raja"); // Add another Raja element
		System.out.println("After adding Raja: " + LL1);
		System.out.println();
		
		LL1.removeFirstOccurrence("Raja");								//Removing first occurrence of the element from the list
		System.out.println("After remove removeFirstOccurrence: " + LL1);
		System.out.println();
		
		LL1.add(0, "Susil"); //Add another Susil element
		System.out.println("After adding Susil: " + LL1);
		System.out.println();
		
		LL1.removeLastOccurrence("Susil");								//Removing last occurrence of the element from the list
		System.out.println("After removeLastOccurrence: " + LL1);
		System.out.println();
		
		Iterator<String> i = LL1.descendingIterator();  				//Traversing the list of elements in reverse order
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(); //newline
		
		
		LL1.clear(); 													//Using clear()
		System.out.println("After clear(): " + LL1);
	}
}

package simpleArrayList;
import java.util.*;

public class SimpleStringArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> fruitList = new ArrayList<String>(); 				// Create an array list
		
		//Add elements
		fruitList.add("Apple"); 	//0
		fruitList.add("Orange");	//1
		fruitList.add("Banana");	//2
		fruitList.add("Grapes");	//3
		fruitList.add("Mango");		//4
		fruitList.add("Pineapple");	//5
		fruitList.add("Cherry");	//6
		fruitList.add("Strawberry");//7
		
		System.out.println("Display outputs: " + fruitList); 				//display outputs
		System.out.println();
		
		fruitList.add(1, "Green Apple"); 									//Add element with particular index
		
		System.out.println("Display outputs by using for loops");			//display output by using for loop
		for(int i = 0; i < fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}
		System.out.println();
		
		System.out.println("Display outputs by using forEach Loop");		//display outputs by using forEach Loop
		for(String FL: fruitList) {
			System.out.println(FL);
		}
		System.out.println();
		
		System.out.println("Display outputs by using Iterator");			//display outputs by using Iterator
		Iterator<String> itr = fruitList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		
		System.out.println("Sorting the list and display the outputs");		//Sorting the list and display the outputs
		Collections.sort(fruitList);
		for(int i = 0; i < fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}
		System.out.println();
		
		System.out.println("Size of the array: " + fruitList.size());		//Size of the array 
		System.out.println();
		
		System.out.println("Second index value: " + fruitList.get(2));		//Particular index output
		System.out.println();
		
		fruitList.set(2, "Guava");											//Replace particular array value by using array index
		System.out.println("After changing index value 2: " + fruitList);
		System.out.println();
		
		fruitList.remove(1);												//Remove particular array value by using array index
		System.out.println("After removing index value 1: " + fruitList);
		System.out.println();
		
		fruitList.remove("Mango");											//Remove particular array value by using value
		System.out.println("After remove Mango value: " + fruitList);
		System.out.println();
		
		System.out.println("New size of the array: " + fruitList.size());	//New Size of the array 
		System.out.println();
		
		
		String fl[] = new String[fruitList.size()];								//Get the array
		fl = fruitList.toArray(fl);
		
		System.out.println("convert a collection(ArrayList) into an array");	//convert a collection(ArrayList) into an array
		for(int i = 0; i < fl.length; i++) {
			System.out.println(fl[i]);
		}
		System.out.println();
		
		System.out.println("Display the second index value: " + fl[2]); 		//Display the second index value
				
		
	}
}
package simpleArrayList;
import java.util.*;

public class SimpleIntArrayList {

	public static void main(String[] args) {
		// Create an array list
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		
		//Add elements
		intList.add(10);	//0
		intList.add(50);	//1
		intList.add(2);		//2
		intList.add(100);	//3
		intList.add(150);	//4
		intList.add(500);	//5
		intList.add(281);	//6
		intList.add(190);	//7
		
		System.out.println("Display outputs: " + intList);						//display outputs
		System.out.println(); //new line
		
		intList.add(1, 1000); 													//Add a value at particular index
		
		System.out.println("Display outputs using for loop");	 				//display outputs using for loop
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		System.out.println(); //new line
		
		
		System.out.println("Display outputs by using forEach Loop");  			//display outputs by using forEach Loop
		for(Integer IL :intList) {
			System.out.println(IL);
		}
		System.out.println(); //new line
		
		
		System.out.println("Display outputs by using Iterator");  				//display outputs by using Iterator
		Iterator<Integer> itr = intList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(); //new line
		
		
		System.out.println("Sorting the list and display the outputs");  		//Sorting the list and display the outputs
		Collections.sort(intList);
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		System.out.println(); //new line
		
		
		System.out.println("Size of the array: " + intList.size());				//Size of the array
		System.out.println(); //new line
		
		
		System.out.println("Index value 2: " + intList.get(2));					//Particular index output
		System.out.println(); //new line
		
		
		intList.set(1, 60);  													//Replace particular array value by using array index
		System.out.println("Set value 60 at Index 1: " + intList);
		System.out.println(); //new line
		
		
		intList.remove(1);  													//Remove particular array value by using array index													
		intList.remove((Integer)500);
		System.out.println("Remove index value 500 and Index 1: " + intList);
		System.out.println(); //new line
		
		
		System.out.println("New size of the array: "  + intList.size());  		//New size of the array
		System.out.println(); //new line
		
		
		Integer il[] = new Integer[intList.size()];  							//Get the array
		il = intList.toArray(il);
		
		
		System.out.println("Convert a collection(ArrayList) into an array");    //Convert a collection(ArrayList) into an array
		for(int i = 0; i < il.length; i++) {
			System.out.println(il[i]);
		}
		System.out.println(); //new line
		
		
		System.out.println("Display the fourth index value: " + il[4]);  		//Display the fourth index value
		System.out.println(); //new line
		
		
		int sum = 0;  															//Sum of the array
		for(int j = 0; j < il.length; j++) {
			sum += il[j];
		}
		System.out.println("Sum of the array: " + sum);
	}
}
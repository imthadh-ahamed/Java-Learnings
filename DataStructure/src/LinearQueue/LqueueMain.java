package LinearQueue;

import java.util.Scanner;

public class LqueueMain {

	public static void main(String[] args) {
		//Create a Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Assign the Queue Array size
		System.out.print("Enter an array size: ");
		int queArrSize = sc.nextInt();
		
		//Create a object of the Lqueue class
		Lqueue lqueue = new Lqueue(queArrSize);
		
		for(int i = 0; i < queArrSize; i++) {
			System.out.print("Enter a value: ");
			int input = sc.nextInt();
			
			lqueue.insert(input);
		}
	}

}

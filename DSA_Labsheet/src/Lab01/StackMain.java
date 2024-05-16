package Lab01;

import java.util.Scanner;

public class StackMain {
	public static void main(String[] args) {
		//Create a scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Getting user input
		System.out.print("Enter a size of the array: ");
		int sz = sc.nextInt();
		
		//Create a new class object
		Stack stack = new Stack(sz);
		
		//Using push method
		while(sz > 0) {
			System.out.print("Enter a double value: "); 	//User input
			double val = sc.nextDouble();
			stack.push(val); 	//Push the values
			sz--;
		}
		System.out.println(); 	//New line
		stack.display(); 	//Display the stack values
		
		//Using peek method
		System.out.println();
		System.out.println("Peek value  of the array: " + stack.peek() + "\n");
		
		//Using pop method
		System.out.println("Pop value: " + stack.pop() + "\n");
		stack.display();
		
		
		
	}
}

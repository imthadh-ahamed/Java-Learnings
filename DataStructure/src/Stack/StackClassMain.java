package Stack;

import java.util.Scanner;

public class StackClassMain {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Assign a array size
		System.out.print("Enter an array size: ");
		int arrSize = sc.nextInt();
		
		//Create an object of  the StackClass
		StackClass stackclass = new StackClass(arrSize);
		
		for(int i = 0; i < arrSize; i++) {
			System.out.print("Enter an input value: ");
			int input = sc.nextInt();
			
			//Using the push function
			stackclass.push(input);
		}
		System.out.println();
		
		//Display the stack values
		System.out.println("Stack values");
		stackclass.display(); 	
		System.out.println();
		
		//Using the peek function
		System.out.println("Peek value of the array: " + stackclass.peek());
		System.out.println();
		
		//Using the pop function
		System.out.println("Pop value of the array: " + stackclass.pop());
		System.out.println();
		
		//Display the stack values after used the pop function
		System.out.println("After used the pop() function");
		stackclass.display();
	}
}

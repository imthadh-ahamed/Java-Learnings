package stackClass;

import java.util.Stack;

public class StackEmptyEx1 {

	public static void main(String[] args) {
		//Create a stack 
		Stack<Integer> stk = new Stack<Integer>();
		
		//checking stack is empty or not
		boolean result = stk.empty();
		
		System.out.println("Stack is empty: " + result);
		System.out.println();
		
		//push elements in stack
		stk.push(50);
		stk.push(70);
		stk.push(90);
		stk.add(800);
		stk.add(200);
		stk.add(190);
		stk.push(250);
		stk.push(60);
		stk.push(700);
		
																		//Display outputs
		System.out.println("Elements of the stack: " + stk);
		
		result = stk.empty();
		System.out.println("Is the stack empty? " + result);
		System.out.println("Size of the stack: " + stk.size());			//Size of the stack
		System.out.println();
		
																		//using pull and peek class
		System.out.println("Peek in this elements: " + stk.peek());		//Using peek()
		stk.pop(); 														//remove peek(last) element(700) by using pop()
		for(int i = 0; i < stk.size(); i++) {
			System.out.println(stk.get(i));
		}
		System.out.println("New size of the stack: " + stk.size());		//New size of the array
		System.out.println();
		
		System.out.println("Location of the 50: " + stk.search(50));	//Search element
		System.out.println("Location of the 60: " + stk.search(60));
		System.out.println("Location of the 700: " + stk.search(700));
	}

}

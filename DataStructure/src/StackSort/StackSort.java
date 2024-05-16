package StackSort;

public class StackSort {
	//Assign Values
		int maxSize;
		int top;
		int arrayValue[];
		
		//Create constructor
		public StackSort(int maxSize) {
			this.maxSize = maxSize;
			top = -1;
			arrayValue = new int[maxSize];
		}
		
		//Implement the isEmpty function
		public boolean isEmpty() {
			return (top == -1);
		}
		
		//Implement the isFull function
		public boolean isFull() {
			return (top == (maxSize - 1));
		}
		
		//Implement the push function
		public void push(int val) {
			if(!isFull()) {
				arrayValue[++top] = val;
			} else {
				System.out.println("Stack is full");
			}
		}	
		
		//Implement the pop function
		public int pop() {
			if(!isEmpty()) {
				return arrayValue[top--];
			} else {
				System.out.println("Stack is empty");
			}
			return 0;
		}
		
		//Implement the peek function
		public int peek() {
			if(!isEmpty()) {
				return arrayValue[top];
			} else {
				System.out.println("Stack is empty");
			}
			return 0;
		}
		
		
		//Implement the Sort function
		public void sort() {
			if(!isEmpty()) {
				return;
			}
			
			StackSort tempstack = new StackSort(arrayValue.length);
			
			while(!isEmpty()) {
				int temp = pop();
				
				if(!tempstack.isEmpty() && tempstack.peek() > temp) {
					push(tempstack.pop());
				}
				
				tempstack.push(temp);
			}
			
			while (!tempstack.isEmpty()) {
		        push(tempstack.pop());
		    }
			
			// Display sorted array
		    System.out.println("\nSorted Array:");
		    for (int i = 0; i <= top; i++) {
		        System.out.println(arrayValue[i]);
		    }
		}
		
		public void display() {
			// Display original array
			System.out.println("Original Array:");
			for (int i = 0; i <= top; i++) {
				System.out.println(arrayValue[i]);
			}
		}
}

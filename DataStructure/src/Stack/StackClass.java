package Stack;

public class StackClass {
	//Assign Values
	int maxSize;
	int top;
	int arrayValue[];
	
	//Create constructor
	public StackClass(int maxSize) {
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
	
	//Implement the display function
	public void display() {
		for(int i = 0; i < arrayValue.length; i++) {
			System.out.println(arrayValue[i]);
		}
	}
}

package Lab01;

public class Stack {
	//Assign values
	int top;
	int maxSize;
	double values[];
	
	//Create class constructor
	public Stack(int maxSize) {
		top = -1;
		this.maxSize = maxSize;
		values = new double[maxSize];
	}
	
	//Implement the isEmpty method
	public boolean isEmpty() {
		return (top == -1);
	}
	
	//Implement the isFull method
	public boolean isFull() {
		return (top == (maxSize - 1));
	}
	
	//Implement the push method
	public void push(double val) {
		if(!isFull()) {
			values[++top] = val;
		} else {
			System.out.println("Stack is full");
		}
	}
	
	//Implement the pop method
	public double pop() {
		if(!isEmpty()) {
			return values[top--];
		} else {
			System.out.println("Stack is empty");
		}
		return 0;
	}
	
	//Implement the peek method
	public double peek() {
		if(!isEmpty()) {
			return values[top];
		} else {
			System.out.println("Stack is empty");
		}
		return 0;
	}
	
	//Implement the display  method
	public void display() {
		System.out.println("Stack values");
		int i = top;
		
		while(i >= 0) {
			System.out.println(values[i] + "");
			i--;
		}
	}
}

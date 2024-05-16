package Ex;

public class StackClass {
	int top;
	int maxSize;
	char[] charArray;
	
	public StackClass(int maxSize) {
		top = -1;
		this.maxSize = maxSize;
		charArray = new char[maxSize];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == (maxSize - 1));
	}
	
	public void push(char ch) {
		if(!isFull()) {
			charArray[++top] = ch;
		} else {
			System.out.println("Stack is full");
		}
	}
	
	public char pop() {
		if(!isEmpty()) {
			return (charArray[top--]);
		} else {
			System.out.println("Stack is empty");
		}
		return 0;
	}
	
	public char peek() {
		if(!isEmpty()) {
			return (charArray[top]);
		} else {
			System.out.println("Stack is empty");
		}
		return 0;
	}
}

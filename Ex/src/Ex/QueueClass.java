package Ex;

public class QueueClass {
	int maxSize;
	int noOfItems;
	int rear;
	int front;
	char charArray[];
	
	public QueueClass(int maxSize) {
		this.maxSize = maxSize;
		noOfItems = 0;
		rear = -1;
		front = 0;
		charArray = new char[maxSize];
	}
	
	public boolean isEmpty() {
		return (noOfItems == 0);
	}
	
	public boolean isFull() {
		return (rear == (maxSize - 1));
	}
	
	public void insert(char ch) {
		if(!isFull()) {
			charArray[++rear] = ch;
		} else {
			System.out.println("Queue id full");
		}
	}
	
	public char remove() {
		if(!isEmpty()) {
			return (charArray[front++]);
		} else {
			System.out.println("Queue is Empty");
		}
		return 0;
	}
}

package LinearQueue;

public class Lqueue {
	//Assign values
	int maxSize;
	int front;
	int rear;
	int noOfItems;
	int QueArray[];
	
	//Create constructor
	public Lqueue(int maxSize) {
		this.maxSize = maxSize;
		front = 0;
		rear = -1;
		noOfItems = 0;
		QueArray = new int[maxSize];
	}
	
	//Implement the isEmpty function
	public boolean isEmpty() {
		return noOfItems == 0;
	}
	
	//Implement the isFull function
	public boolean isFull() {
		return (rear == (maxSize - 1));
	}
	
	//Implement the insert function
	public void insert(int val) {
		if(!isFull()) {
			QueArray[++rear] = val;
			noOfItems++;
		} else {
			System.out.println("Queue is full");
		}
	}
	
	//implement the remove function
	public int remove() {
		if(isEmpty()) {
			noOfItems--;
			return QueArray[front++];
		} else {
			System.out.println("Queue is empty");
		}
		return 0;
	}
	
	//implement the peek function
	public int peek() {
		if(isEmpty()) {
			return QueArray[front];
		} else {
			System.out.println("Queue is empty");
		}
		return 0;
	}
	
	//Implement the display function
	public void display() {
		for(int i = 0; i < QueArray.length; i++) {
			System.out.println(QueArray[i]);
		}
	}
}

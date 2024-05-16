package Lab02;

public class QueueX {
	int maxSize;
	int front;
	int rear;
	int noOfItems;
	int queArray[];
	
	public QueueX(int maxSize) {
		this.maxSize = maxSize;
		front = 0;
		rear = -1;
		noOfItems = 0;
		queArray = new int[maxSize];
	}
	
	public boolean isEmpty() {
		return (noOfItems == 0);
	}
	
	public boolean isFull() {
		return (rear == (maxSize - 1));
	}
	
	public void insert(int inp) {
		if(!isFull()) {
			queArray[++rear] = inp;
		} else {
			System.out.println("Queue is fulll");
		}
	}
	
	public int remove() {
		if(!isEmpty()) {
			noOfItems--;
			return queArray[front++];
		} else {
			System.out.println("Queue is empty");
		}
		return 0;
	}
	
	public void display() {
		int i = 0;
		while(maxSize > i) {
			System.out.println(queArray[i]);
			i++;
		}
	}
}

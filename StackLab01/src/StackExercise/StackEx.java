package StackExercise;

public class StackEx {
    //Initialze the values
    int maxSize;
    int top;
    int arr[];

    //Create constractor
    public StackEx(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        arr = new int[maxSize];
    }

    //Implement the isFull()
    public boolean isFull() {
        return (top == (maxSize - 1));
    }

    //Implement the isEmpty()
    public boolean isEmpty() {
        return (top == -1);
    }

    //Implement the push()
    public void push(int val) {
        if(!isFull()) {
            arr[++top] = val;
        } else {
            System.out.println("Stack is full");
        }
    }

    //Implement the pop()
    public int pop() {
        if(!isEmpty()) {
            return arr[top--];
        } else {
            System.out.println("Stack is empty");
        }
        return 0;
    }

    //Implement the peek()
    public int peek() {
        if(!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty");
        }
        return 0;
    }

    //implement the display()
    public void display() {
        for(int index : arr){
            System.out.println(index);
        }
    }
}

package Ex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value for array: ");
		int arrSz = sc.nextInt();
		
		QueueClass queue = new QueueClass(arrSz);
		StackClass stack = new StackClass(arrSz);
		
		for(int i = 0; i < arrSz; i++) {
			System.out.print("Enter a character value: ");
			char ch = sc.next().charAt(0);
			queue.insert(ch);
		}
		System.out.println();
		
		for(int i = 0; i < arrSz; i++) {
			char ch = queue.remove();
			System.out.println(ch);
			stack.push(ch);
		}
		
		for(int i = 0; i < arrSz; i++) {
			char ch = stack.pop();
			System.out.println(ch);
			queue.insert(ch);
		}
		
		for(int i = 0; i < arrSz; i++) {
			System.out.println(queue.remove());
		}
	}

}

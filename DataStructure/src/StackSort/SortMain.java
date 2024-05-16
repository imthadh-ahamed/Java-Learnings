package StackSort;

import java.util.Scanner;

import Stack.StackClass;

public class SortMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int arrSize = sc.nextInt();
		
		StackSort stkclz = new StackSort(arrSize);
		
		for(int i = 0; i < arrSize; i++) {
			System.out.print("Enter a value: ");
			stkclz.push(sc.nextInt());
		}
		
		System.out.println();
		stkclz.display();
		System.out.println();
		
		stkclz.sort();
	}

}

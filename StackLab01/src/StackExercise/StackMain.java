package StackExercise;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner sc = new Scanner(System.in);

        //Enter a user input for assign the array size
        System.out.println("Enter a array size: ");
        int arrSize = sc.nextInt();

        //Create an object
        StackEx stk = new StackEx(arrSize);

        //Assign the user input value to array
        for(int i=0; i<arrSize; i++) {
            System.out.println("Enter a value: ");
            int val = sc.nextInt();
            stk.push(val);
        }

        //Display the values
        stk.display();
    }
}

package Lab02;

import java.util.Scanner;

public class QueueXMain {

    public static void main(String[] args) {
    	// Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Getting a user input for assign array size
        System.out.print("Enter an array size: ");
        int arrSize = sc.nextInt();
        
        // Create a Queue Object
        QueueX queue = new QueueX(arrSize);

        // Add elements to the queue
        while (arrSize > 0) {
            System.out.print("Enter an Integer value: ");
            int input = sc.nextInt();

            queue.insert(input);
            arrSize--;
        }
        System.out.println();
        
        // Display the Queue values
        queue.display();
        System.out.println();

        // Create separate queues for even and odd values
        QueueX evenQueue = new QueueX(queue.maxSize);
        QueueX oddQueue = new QueueX(queue.maxSize);
        QueueX tempQueue = new QueueX(queue.maxSize);

        // Transfer elements from the original queue to temporary queue
        while (!queue.isEmpty()) {
            tempQueue.insert(queue.remove());
        }

        // Categorize elements as even or odd and store them in separate queues
        while (!tempQueue.isEmpty()) {
            int value = tempQueue.remove();
            if (value % 2 == 0) {
                evenQueue.insert(value);
            } else {
                oddQueue.insert(value);
            }
        }

//        System.out.println();
//        evenQueue.display();
//        System.out.println();
//        oddQueue.display();
//        System.out.println();

        // Display even values
        System.out.println("Even Transactions:");
        while (!evenQueue.isEmpty()) {
            System.out.println("Transaction: " + evenQueue.remove());
        }
        System.out.println();

        // Display odd values
        System.out.println("Odd Transactions:");
        while (!oddQueue.isEmpty()) {
            System.out.println("Transaction: " + oddQueue.remove());
        }
        
        // Scanner close
        sc.close();
    }
}

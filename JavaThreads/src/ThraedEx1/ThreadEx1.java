package ThraedEx1;

public class ThreadEx1 extends Thread {
	
	//run() method to perform action for thread
	public void run() {
		int a = 10;
		int b = 5;
		int sum = a + b;
		System.out.println("Thraed started running...");
		System.out.println("Sum of two numbers is: " + sum);
	}

	public static void main(String[] args) {
		//Creating instance of the class extend Thread class
		ThreadEx1 TE1 = new ThreadEx1();
		
		//Calling start() method to execute the run() method of the Thread class
		TE1.start();
	}
}

package ThreadEx;

class Book extends Thread{
	void updateDB() {
		for(int i=1; i<=5; i++) {
			System.out.println("Upadting DB");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Executing Thread..");
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
}

class Num extends Thread{
	void print() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Num Thread Executing " + i);
			
			try {
				Thread.sleep(1750);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadEx {
	public static void main(String[] args) {
		Book book = new Book();
		Num num = new Num();

		book.start();
		if(book.isAlive()) {
			System.out.println("Book thread is still executing..");
		}
		
		book.updateDB();
		num.print();
		num.start();
//---------------------------------------		
		if(book.isAlive()) {
			System.out.println("Book thread is still executing..");
		}
//----------------------------------------		
		try {
			num.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//----------------------------------------		
		System.out.println("Bye..");
	}

}

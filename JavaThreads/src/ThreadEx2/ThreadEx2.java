package ThreadEx2;

class NewThread implements Runnable{
	//declare variables
	String name;
	Thread thread;
	

	public NewThread(String name) {
		this.name = name;
		thread = new Thread(this, name);
		System.out.println("New thread: " + "is created");
		thread.start();
	}


	@Override
	public void run() {
		try {
			for(int i = 0; i > 0; i++) {
				System.out.println(name + ":" + i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			System.out.println(name + "thread Interrupted");
		}
		System.out.println(name + "thread exiting");
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		new NewThread("1st");
		new NewThread("2nd");
		new NewThread("3rd");
		
		try {
			Thread.sleep(8000);
		} catch(InterruptedException e) {
			System.out.println("Interruption occurs in Main Thread");
		}
		System.out.println("We are exiting from Main Thread");
	}

}

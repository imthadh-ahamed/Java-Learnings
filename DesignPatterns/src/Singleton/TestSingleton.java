package Singleton;

class Singleton{
	private static Singleton instance;
	
	private Singleton(){
		System.out.println("Instance Created");
	}
	
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	void method() {
		System.out.println("Invoke method");
	}
}

public class TestSingleton implements Runnable{
	public static void main(String[] args) {
		
		new Thread(new TestSingleton()).start();
		new Thread(new TestSingleton()).start();
		
		for(int i = 0; i < 10; i++) {
			Singleton.getInstance().method();
		}
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			Singleton.getInstance().method();
		}
	}
}

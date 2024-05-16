package ThreadLecture;

public class Ex01 extends Thread{
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		ex01.start();
		Ex01 ex02 = new Ex01();
		ex02.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Main Thread => " + Thread.currentThread().getName() + " = " + i);
			
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
		for(int i = 0; i< 10; i++) {
			System.out.println("New Thread => " + Thread.currentThread().getName() + " = " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

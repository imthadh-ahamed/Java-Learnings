package ThreadLecture;

class Sample1 {
    synchronized void display(Sample1 sample) {
    	synchronized (sample) {
    		for (int i = 0; i < 10; i++) {
    			System.out.println(Thread.currentThread().getName() + " = " + i);
    			
    			try {
    				Thread.sleep(1000);
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}
    		}
		}
    }
}

public class Ex03 implements Runnable {
	Sample1 sample;
	
    public Ex03(Sample1 sample) {
		this.sample = sample;
	}

	public static void main(String[] args) {
    	Sample1 sample = new Sample1();
        Thread thread = new Thread(new Ex03(sample));
        thread.start();
        Thread thread1 = new Thread(new Ex03(sample));
        thread1.start();
    }

    public void run() {
        sample.display(sample);
    }
}

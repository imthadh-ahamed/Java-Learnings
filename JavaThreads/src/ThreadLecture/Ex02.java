package ThreadLecture;

class Sample {
    synchronized void display() {
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

public class Ex02 implements Runnable {
	Sample sample;
	
    public Ex02(Sample sample) {
		this.sample = sample;
	}

	public static void main(String[] args) {
    	Sample sample = new Sample();
        Thread thread = new Thread(new Ex02(sample));
        thread.start();
        Thread thread1 = new Thread(new Ex02(sample));
        thread1.start();
    }

    public void run() {
        sample.display();
    }
}

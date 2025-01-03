package test;

class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("I Am Lazy Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("I Got Interrupted");
			}
		}
	}
}
public class ThreadInterrupt {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();
		t.interrupt();
		System.out.println("End of Main Thread");
	}
}

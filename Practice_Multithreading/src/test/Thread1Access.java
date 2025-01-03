package test;

class Thread1 extends Thread{
	public void run() {
		String n=Thread.currentThread().getName();
		for(int i=1;i<=5;i++) {
			System.out.println(n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Thread1Access {
	public static void main(String[] args) {
		Thread1 t1= new Thread1();
		Thread1 t2= new Thread1();
		Thread1 t3= new Thread1();
		
		t1.setName("Mohit");
		t2.setName("Nihit");
		t3.setName("Chillu");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
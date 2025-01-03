package test;

class ThreadSchedular1  extends Thread{
	public void run() {
		String thr=Thread.currentThread().getName();
		for(int i=0;i<5;i++) {
			System.out.println(thr);
		}
	}
}

public class ThreadSchedular{
	public static void main(String[] args) {
		ThreadSchedular1 t1 = new ThreadSchedular1();
		ThreadSchedular1 t2 = new ThreadSchedular1();
		ThreadSchedular1 t3 = new ThreadSchedular1();
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		t2.start();
		t3.start();
	}
}


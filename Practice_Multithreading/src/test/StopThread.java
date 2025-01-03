//stop() : it is used to terminate a Thread permanentaly.

package test;

class Stop extends Thread{
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(name);
		}
	}
}

public class StopThread {
	public static void main(String[] args) {
		
		Stop t1 = new Stop();
		Stop t2 = new Stop();
		Stop t3 = new Stop();
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		t2.start();
		t2.stop();
		t3.start();
		
	}
}

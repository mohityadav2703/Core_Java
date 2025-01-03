// Yield() :It allows us to run another thread by pause its current Thread which has same 
// priority

package test;

class YieldThread_1 extends Thread{
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(name);
			Thread.yield();
		}
	}
}

class YieldThread_2 extends YieldThread_1{
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(name);
		}
	}
}

public class YieldThread {

	public static void main(String[] args) {
		YieldThread_2 ob = new YieldThread_2();
		
		Thread t1= new Thread(ob);
		Thread t2= new Thread(ob);
		Thread t3= new Thread(ob);
		Thread t4= new Thread(ob);
		
		t1.setPriority(6);
		t2.setPriority(4);
		t3.setPriority(5);
		t4.setPriority(5);
	
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t4.setName("D");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

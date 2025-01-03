package test;

class Display{
	public synchronized void wish(String name) {
		for(int i=0;i<5;i++) {
			System.out.print("Good Morning :");
			try {
				Thread.sleep(1000);
				System.out.println(name);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Test extends Thread{
	Display d;
	String name;
	Test(Display d, String name){
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}
}

public class Synchronized_ObjectLevelLock_1{
	public static void main(String[] args) {
		Display d = new Display();
		Test t1 = new Test(d,"Mohit");
		Test t2 = new Test(d,"Nihit");
		t1.start();
		t2.start();
	}
}
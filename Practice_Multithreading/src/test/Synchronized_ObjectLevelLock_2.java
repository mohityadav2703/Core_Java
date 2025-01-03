package test;

class Display_1{
	public synchronized void displaynum() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void displaychar() {
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread_1 extends Thread{
	Display_1 d;
	MyThread_1(Display_1 d){
		this.d=d;
	}
	public void run() {
		d.displaynum();
	}
}

class MyThread_2 extends Thread{
	Display_1 d;
	MyThread_2(Display_1 d){
		this.d=d;
	}
	public void run() {
		d.displaychar();
	}
}

public class Synchronized_ObjectLevelLock_2 {
	public static void main(String[] args) {
		Display_1 d = new Display_1();
		MyThread_1 t1 = new MyThread_1(d);
		MyThread_2 t2 = new MyThread_2(d);
		
		t1.start();
		t2.start();
	}

}

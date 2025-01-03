package test;

class A{
	public synchronized void d1(B b) {
		System.out.println("Thread-1 Starts execution of d1() method");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread-1 trying to call B's last()");
		b.last();
	}
	public synchronized void last() {
		System.out.println("Inside A, This is last() method");
	}
}
class B{
	public synchronized void d2(A a) {
		System.out.println("Thread-2 start execution of d2() method");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread-2 trying to call A's last()");
		a.last();
	}
	public synchronized void last() {
		System.out.println("Inside-B this is last() method");
	}
}

public class DeadLock extends Thread{

	A a = new A();
	B b = new B();
	public void m1() {
		this.start();
		a.d1(b); //this line executed by main thread
	}
	public void run() {
		b.d2(a); // this line executed by child thread
	}
	
	public static void main(String[] args) {
		DeadLock d = new DeadLock();
		d.m1();
	}
}

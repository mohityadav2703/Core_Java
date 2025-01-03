package test;

class MyThread_3{
	
}

public class DaemonThread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		
		Thread.currentThread().setDaemon(true);
		System.out.println(Thread.currentThread().isDaemon());
		
	}
}

package test;

class MyThread extends Thread {

}

public class ThreadPriority {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());

	}
}

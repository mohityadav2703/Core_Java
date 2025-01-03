package test;

class RunMethod extends Thread{
	public void run() {
		System.out.println("No-Args run");
	}
	public void run(int i) {
		System.out.println("Int-Args run");
	}
}

public class OverrideRunMethod {
	public static void main(String[] args) {
		RunMethod t1 = new RunMethod();
		
		t1.start();
	}
}

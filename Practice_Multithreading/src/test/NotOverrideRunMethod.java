package test;

class RunMethod1 extends Thread{
//	public void run() {
//		for(int i=0;i<4;i++) {
//			System.out.println("ABC");
//		}
//	}
}

public class NotOverrideRunMethod {
	public static void main(String[] args) {
		RunMethod1 t1 = new RunMethod1();
		t1.start();
	}
}

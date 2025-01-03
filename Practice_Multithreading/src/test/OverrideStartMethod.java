package test;

class StartMethod{
	public void start() {
		System.out.println("Start-Method");
	}
	
	public void run() {
		System.out.println("Run-Method");
	}
}


public class OverrideStartMethod {
	public static void main(String[] args) {
		StartMethod t1 = new StartMethod();
		t1.start();
	}
}

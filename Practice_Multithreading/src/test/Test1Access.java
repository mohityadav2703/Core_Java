//run() :this method will execute first than other thread will execute. it doesn't create object.
//start() : this method everytime create new object and execute thread simultaneously.

package test;

class Test1 extends Thread{
	public void run() {
		try {
			for(int i=0;i<3;i++) {
				System.out.println("Hello India");
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class Test1Access {
	public static void main(String[] args) throws InterruptedException{
		Test1 t1= new Test1();
		Test1 t2= new Test1();
		t2.run();
		t1.start();
		
		for(int i=0;i<3;i++) {
			System.out.println("Hello Friend");
		}
		
	}
}
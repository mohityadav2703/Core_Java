//join() : this method is used to execute join thread first after than other thread will execute.

package test;

class JoinThread1 extends Thread{

	public void run() {
		String str=Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.print(str+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class JoinThreadAccess{
	public static void main(String[] args) throws InterruptedException {
		
		JoinThread1 t1= new JoinThread1();
		JoinThread1 t2= new JoinThread1();
		JoinThread1 t3= new JoinThread1();
		JoinThread1 t4= new JoinThread1();
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t4.setName("D");
		
		t1.start();
		t1.join();
		
		t3.start();
		t3.join();
		
		t4.start();
		t2.start();
		
	}
}

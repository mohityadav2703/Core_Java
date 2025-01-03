//IsAlive() : it is used to verify weather thread is Alive or Not

package test;

class IsAlive extends Thread{
	public void run() {
		String name= Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(name);
		}
	}
}

public class IsAliveThread {
	public static void main(String[] args) {
		IsAlive ob = new IsAlive();
		IsAlive ob1 = new IsAlive();
		System.out.println("Status of Ob :"+ob.isAlive());
		System.out.println("Status of Ob1 :"+ob1.isAlive());
		
		ob.start();
		ob1.start();
		System.out.println("Status of Ob :"+ob.isAlive());
		System.out.println("Status of Ob1 :"+ob1.isAlive());
		
	}	
}

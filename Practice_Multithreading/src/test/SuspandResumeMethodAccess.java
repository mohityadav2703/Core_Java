// suspand() : it is used to put the thread from running state to waiting state.
// resume() : it is used to resume a suspanded thread from waiting to running state.

package test;

class SuspandResumeMethod extends Thread{
	
	public void run() {
		String str=Thread.currentThread().getName();
		
		for(int i=0;i<3;i++) {
			System.out.println(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class SuspandResumeMethodAccess {

	public static void main(String[] args) {
		SuspandResumeMethod t1 = new SuspandResumeMethod();
		SuspandResumeMethod t2 = new SuspandResumeMethod();
		SuspandResumeMethod t3 = new SuspandResumeMethod();
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t2.start();
		t2.suspend();
		t2.resume();
		t1.start();
		t3.start();
		
	}
}


package p2;
import p1.*;
public class DemoThread5 {
	public static void main(String[] args) {
		Selection ob=new Selection();
			// anonymous Runnable class object
		Runnable r1=()->{
			synchronized (ob)
			{
				ob.select(1, "Alex");
			}
		};
		Runnable r2=()->
		{
			synchronized (ob)
			{
				ob.select(1, "Ram");
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();

	}

}

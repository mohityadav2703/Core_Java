package p2;
import p1.*;
public class DemoThread6 {
	public static void main(String[] args) {
		Selection ob=new Selection();
		
		Runnable r1=()->
		{
			ob.select(1, "Alex");
		};
		Runnable r2=()->
		{
			ob.select(3, "Ram");
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}

}

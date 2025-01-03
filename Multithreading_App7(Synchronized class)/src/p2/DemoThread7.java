package p2;
import p1.*;
public class DemoThread7 {
	public static void main(String[] args) {
		Runnable r1=()->{
			Selection.select(1, "Alex");
		};
		Runnable r2=()->{
			Selection.select(1, "Ram");
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();

	}

}

package p1;
import java.util.*;

public class DemoThread2 {

	public static void main(String[] args) {
		
		//anonymous object
		new Thread(new Runnable() {
			public void run()
			{
				for(int i=0;i<=5;i++)
				{
					System.out.println("Alex is Performing Registration process..."+new Date());
					try
					{
						Thread.sleep(2000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}//end of loop
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run()
			{
				for(int i=0;i<=5;i++)
				{
					System.out.println("Ram is Performing Login Process...."+new Date());
					try
					{
						Thread.sleep(2000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		}).start();
		
	}

}
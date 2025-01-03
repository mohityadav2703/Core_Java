package p1;
import java.util.*;
public class DemoThread3 {
	public static void main(String[] args) {
		//Lambda Expression as method argument
		new Thread(()->{
			for(int i=0;i<=5;i++)
			{
				System.out.println("Alex is Performing Register Process..."+new Date());
				try
				{
					Thread.sleep(2000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(()->{
			for(int i=0;i<=5;i++)
			{
				System.out.println("Ram is Performing Login Process..."+new Date());
				try
				{
					Thread.sleep(2000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}).start();
	}
}			
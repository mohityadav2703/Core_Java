package p1;
import java.util.*;
public class Register implements Runnable{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Alex...Registration process.."+new Date());
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
}
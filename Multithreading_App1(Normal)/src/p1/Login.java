package p1;
import java.util.*;
public class Login implements Runnable{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Ram...login process..."+new Date());
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
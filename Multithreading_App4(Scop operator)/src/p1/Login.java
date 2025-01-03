package p1;
import java.util.*;
public class Login {
	public static void log()
	{
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
	}
}

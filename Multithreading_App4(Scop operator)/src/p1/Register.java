package p1;
import java.util.*;
public class Register {
	public static void reg()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Alex is performing Register process..."+new Date());
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

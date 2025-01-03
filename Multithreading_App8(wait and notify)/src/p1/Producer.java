package p1;
public class Producer implements Runnable{
	public StringBuffer sb=null;
	public Producer()
	{
		sb=new StringBuffer();
	}
	public void run()
	{
		try
		{
			synchronized (sb)
			{
				for(int i=0;i<=10;i++)
				{
					sb.append(i+" :");
					System.out.println("Appending process....");
					Thread.sleep(2000);
				}
				sb.notify();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

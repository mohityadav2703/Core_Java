package p1;
public class Consumer implements Runnable{
	public Producer prod=null; //instance variable
	public Consumer(Producer prod)
	{
		this.prod=prod;
	}
	public void run()
	{
		try
		{
			synchronized (prod.sb)
			{
				System.out.println("Consumer started...but blocked..");
				prod.sb.wait();
				System.out.println("*****Display By Consumer*****");
				System.out.println(prod.sb.toString());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

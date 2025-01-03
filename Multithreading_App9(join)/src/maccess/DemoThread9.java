package maccess;
public class DemoThread9 {
	public static void main(String[] args) {
		Thread t1=new Thread(()->{
					for(int i=0;i<=5;i++)
					{
						System.out.println("Alex....Tast-1");
						try
						{
							Thread.sleep(2000);
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}//end of loop
				});
		Thread t2=new Thread(()->{
					for(int i=0;i<=5;i++)
					{
						System.out.println("Ramm....Task-2");
						try
						{
							Thread.sleep(2000);
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}//end of loop
				});
		Thread t3=new Thread(()->{
					for(int i=0;i<=5;i++)
					{
						System.out.println("Rajj....Task-3");
						try
						{
							Thread.sleep(2000);
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					} //end of loop
				});
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

}

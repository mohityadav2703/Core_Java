package p1;

public class Withdraw extends Exception implements Transaction
{
	public Withdraw(String msg)
	{
		super(msg);
	}
	public void process(int amt) throws Withdraw
	{
		try
		{
			if(amt > b.bal) //exception condition
			{
				Withdraw wd = new Withdraw("Insufficient Balance");
				throw wd;
			}
			System.out.println("Amt Withdrawn :"+amt);
			b.bal=b.bal-amt;
			System.out.println("Balance Amt :"+b.getBalance());
			System.out.println("Transaction Successfull....");
		}
		catch(Withdraw wd)
		{
			throw wd; //Exception re-throwing
		}
	}
}

package p1;

public class Withdraw implements Transaction
{
	public void process(int amt)
	{
		if(amt < b.bal)
		{
			System.out.println("Amt Withdrawn :"+amt);
			b.bal=b.bal-amt;
			System.out.println("Balance Amt :"+b.getBalance());
			System.out.println("Transaction Successfull....");
		}
		else
		{
			System.out.println("Insufficient balance....");
		}
	}
}

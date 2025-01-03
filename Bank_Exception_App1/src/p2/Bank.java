package p2;
import p1.*;
import java.util.*;

public class Bank extends Exception
{
	public Bank(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) throws Withdraw
	{
		Scanner s = new Scanner(System.in);
		int count=0;
		abc:
		while(true)
		{
			try
			{
				System.out.println("Enter The PinNo:");
				int pinNo=s.nextInt();// exception for non int
				if(!(pinNo>=1111 && pinNo<9999))
				{
					Bank ob = new Bank("Invalid pinNo..");
					throw ob;
				}
				CheckPinNo cpn = new CheckPinNo();
				boolean k=cpn.verify(pinNo);
				if(!k)
				{
					Bank ob = new Bank("pinNo donot exist....");
					throw ob;
				}
				System.out.println("******Choice*******");
				System.out.println("1.Withdraw \n2.Deposit");
				System.out.println("Enter the choice");
				int choice=s.nextInt();
				
				switch(choice)
				{
				case 1:
					try
					{
						System.out.println("Enter The Amount to withdraw:");
						int a1 = s.nextInt();
						if(!(a1>0 && a1%100==0))
						{
							Bank ob = new Bank("Invalid amt");
							throw ob;
						}
						Withdraw wd = new Withdraw("");
						wd.process(a1);  //method call
						
					}// end of try
					catch(Bank ob)
					{
						System.out.println(ob.getMessage());
						break abc;
					}
					catch(InputMismatchException ime)
					{
						System.out.println("Enter only integer value");
						break abc;
					}
					break abc;
				case 2:
					try
					{
						System.out.println("Enter The Amount:");
						int a2=s.nextInt();
						if(!(a2>0 && a2%100==0))
						{
							Bank ob = new Bank("Invalid Amt....");
							throw ob;
						}
						Deposit dp = new Deposit();
						dp.process(a2); //method call
					} //end of try
					catch(Bank ob)
					{
						System.out.println(ob.getMessage());
						break abc;
					}
					catch(InputMismatchException ime)
					{
						System.out.println("Enter Only Integer Value");
						break abc;
					}
					break abc;
					default :
						System.out.println("Invalid Choice...");
						break abc;
				}//end of switch
			}
			catch(Bank ob)
			{
				System.out.println(ob.getMessage());
				count++;
				if(count==3)
				{
					System.out.println("Sorry ! Transaction Blocked");
					break abc;
				}
			}
			catch(InputMismatchException ime)
			{
				System.out.println("Enter Only Integer Value");
				break abc;
			}
			
		}//end of loop
		s.close();
	}
}
package p2;
import java.util.Scanner;
import p1.*;

public class Bank extends Exception
{
	public Bank(String msg)
	{
		super(msg);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int count=0;
		abc :
			while(true)
			{
				
				try
				{
					System.out.println("Enter the PinNo");
					int pinNo=s.nextInt();
					if(!(pinNo>=1111 && pinNo<=9999))
					{
						Bank ob = new Bank("Invalid pinNo...");
						throw ob;
					}
					CheckPinNo cpn = new CheckPinNo();
					boolean k=cpn.verify(pinNo);
					if(!(k))
					{
						Bank ob = new Bank("pinNo donot exist");
						throw ob;
					}
					System.out.println("******Choice******");
					System.out.println("1.Withdraw \n2.Deposit");
					System.out.println("Enter The Choice");
					int choice=s.nextInt();
					switch(choice)
					{
					case 1:
						try
						{
							System.out.println("Enter The Amount To Withdraw");
							int a1=s.nextInt();
							if(!(a1>0 && a1%100==0))
							{ 
								Bank ob = new Bank("invalid Amount..");
								throw ob;
							}
						// Withdraw class As Anonymous
							Transaction wd = new Transaction()
							{
								public void process(int amt)
								{
									if(!(amt<b.bal))
									{
										Bank ob= new Bank("Insufficient Balance");
										throw ob;
									}
								}
								
							};
							wd.process(a1);
						}//end of try
						catch(Bank ob)
						{
							System.out.println(ob.getMessage());
						}
					}
				}
				catch(Bank ob)
				{
					System.out.println(ob.getMessage());
				}
			}
	}
}

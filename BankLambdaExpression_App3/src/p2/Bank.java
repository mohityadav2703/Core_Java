package p2;
import p1.*;
import java.util.*;

public class Bank {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int count=0;
		abc:
			while(true)
			{
				System.out.println("Enter The Pinno:");
				int pinNo=s.nextInt();
				if(pinNo>=1111 && pinNo<=9999)
				{
					CheckPinNo cpn = new CheckPinNo();
					boolean k=cpn.verify(pinNo);
					if(k)
					{
						System.out.println("***choice***");
						System.out.println("1.Withdraw \n2.Deposit");
						System.out.println("Enter Your Choice");
						int choice=s.nextInt();
						switch(choice)
						{
						case 1:
							System.out.println("Enter The Amt to Withdraw :");
							int a1=s.nextInt();
							if(a1>0 && a1%100==0)
							{
								//Withdraw class as LambdaExpression
								Transaction wd = (int amt)->
								{
									if(amt<Transaction.b.bal)
									{
										System.out.println("Amt Withdrawn :"+amt);
										Transaction.b.bal=Transaction.b.bal-amt;
										System.out.println("Balance Amt :"+Transaction.b.getBalance());
										System.out.println("Transaction Successfull...");
									}
									else
									{
										System.out.println("Insufficient Balance..");
									}
								};
								wd.process(a1);//method call
							}
							else
							{
								System.out.println("Invalid Amt...");
							}
							break abc;
						case 2:
						{
							System.out.println("Enter The Amt :");
							int a2=s.nextInt();
							if(a2>0 && a2%100==0)
							{
								// Deposit class as LambdaExpression
								Transaction dp = (int amt)->
								{
									System.out.println("Amt Deposited...");
									Transaction.b.bal=Transaction.b.bal+amt;
									System.out.println("Balance Amt :"+Transaction.b.getBalance());
									System.out.println("Transaction Successfull....");
								};
								dp.process(a2);
							}
							else
							{
								System.out.println("Invalid Amt....");
							}
							break abc;
						}
						default :
							System.out.println("Invalid choice..");
						};//end of switch
						
					}
					else
					{
						System.out.println("Pin donot exist...");
						count++;
					}
				}
				else
				{
					System.out.println("Invalid Pin...");
					count++;
				}
				if(count==3)
				{
					System.out.println("Sorry! Transaction Blocked..");
					break;//stop the loop
				}
			}//end the loop

	}

}

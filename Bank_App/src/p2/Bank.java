package p2;
import java.util.Scanner;
import p1.*;

public class Bank
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int count=0;
		abc :
			while(true)
			{
				System.out.println("Enter The PinNo :");
				int pinNo=s.nextInt();
				if(pinNo>=1111 && pinNo<=9999)
				{
					CheckPinNo cpn = new CheckPinNo();
					boolean k=cpn.verify(pinNo);
					if(k)
					{
						System.out.println("****Choice****");
						System.out.println("\n1.Withdraw\n2.Deposite");
						System.out.println("Enter the choice");
						int choice=s.nextInt();
						switch(choice)
						{
						case 1:
							System.out.println("Enter The Amt To Withdraw");
							int a1=s.nextInt();
							if(a1>0 && a1%100==0)
							{
								//Withdrawn class as Anonymous
								Transaction wd = new Transaction()
								{
									public void process(int amt)
									{
										if(amt < b.bal)
										{
											System.out.println("Amt Withdrawn :"+amt);
											b.bal=b.bal-amt;
											System.out.println("Balance Amt :"+b.getBalance());
											System.out.println("Transaction SuccessFull....");
										}
										else
										{
											System.out.println("Insufficient Balance...");
										}
									}
								};
								wd.process(a1); //method call
							}
							else
							{
								System.out.println("Invalid Amt....");
							}
							break abc;
							
						case 2:
							System.out.println("Enter The Amt: ");
							int a2 = s.nextInt();
							if(a2>0 && a2%100==0)
							{
								// Deposit class As Anonymous
								Transaction dp = new Transaction()
								{
									public void process(int amt)
									{
										System.out.println("Amt Deposited:"+amt);
										b.bal=b.bal+amt;
										System.out.println("Balance Amt :"+b.getBalance());
										System.out.println("Transaction Successfull....");
									}
								};
								dp.process(a2);//method call
							}
							else
							{
								System.out.println("Invalid amt...");
							}
							break abc;
							
							default :
								System.out.println("Invalid Choice..");
								break abc; //stop the loop
						}//end of switch
					}
					else
					{
						System.out.println("PinNo donot exist....");
						count++;
					}
					
				}
				else
				{
					System.out.println("Invalid pinNo...");
					count++;
				}
				if(count==3)
				{
					System.out.println("Sorry! Transaction Blocked");
					break; //stop the loop
				}
			}//end of loop
			
		s.close();
	}
}
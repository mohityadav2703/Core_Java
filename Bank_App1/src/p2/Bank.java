package p2;
import p1.*;
import java.util.*;

public class Bank 
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		int count=0;
		abc:
		while(true)
		{
			System.out.println("Enter the pinNo");
			int pinNo=s.nextInt();
			
			if(pinNo>=1111 && pinNo<=9999)
			{
				CheckPinNo cpn = new CheckPinNo();
				boolean k = cpn.verify(pinNo);
				if(k)
				{
					System.out.println("****choice****");
					System.out.println("\t1.Withdrawn"+"\t2.Deposit");
					System.out.println("Enter your choice");
					int choice = s.nextInt();
					
					switch(choice)
					{
					case 1:
						System.out.println("Enter The Amt to WithDraw :");
						int a1=s.nextInt();
						if(a1>0 && a1%100==0)
						{
							Withdraw wd = new Withdraw();
							wd.process(a1); //method call
						}
						else
						{
							System.out.println("Invalid Amt..");
						}
						break abc;
					case 2:
						System.out.println("Enter the amount :");
						int a2 = s.nextInt();
						if(a2>0 && a2%100==0)
						{
							Deposit dp = new Deposit();
							dp.process(a2); // method call
						}
						else
						{
							System.out.println("Invalid Amt....");
						}
						break abc;
						
					default :
						System.out.println("Invalid choice..");
						break abc; //stop the loop
					} //end of switch
				}
				else
				{
					System.out.println("PinNo donot exist...");
					count++;
				}
			}
			else
			{
				System.out.println("Invalid pinNo");
				count++;
			}
				if(count==3)
				{
					System.out.println("Sorry! Transaction blocked");
					break; // stop the loop
				}		
			} //end of loop
		}
	}

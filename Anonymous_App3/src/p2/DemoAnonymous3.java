package p2;
import p1.*;
import java.util.*;

public class DemoAnonymous3 {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first value :");
		int v1=s.nextInt();
		System.out.println("Enter the second value :");
		int v2=s.nextInt();
		
		System.out.println("*******Choice*******");
		System.out.println("\t1.GreaterValue :\t2.SmallerValue :");
		System.out.println("Enter The Choice");
		int choice=s.nextInt();  //OR
		switch(choice)
		{
		case 1:
			// GreaterValue class as Anonymous
			IComparable ob1 = new IComparable()
			{
				public int compareTo(int x,int y)
				{
					if(x>y)
						return x;
					else
						return y;
				}
			};
			int r1 = ob1.compareTo(v1, v2);
			System.out.println("Result :"+r1);
			break;
		case 2:
			// SmallerValue class as Anonymous
			IComparable ob2 = new IComparable()
			{
				public int compareTo(int x,int y)
				{
					if(x<y)
						return x;
					else
						return y;
				}
			};
			int r2=ob2.compareTo(v1, v2);
			System.out.println("Result :"+r2);
			break;
			
			default:
				System.out.println("Invalid Choice....");
			
		}//end of switch
		s.close();
	}

}

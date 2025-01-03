package p2;
import p1.*;
import java.util.*;

public class DesignModel2 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value-1 :");
		int v1=s.nextInt();
		System.out.println("Enter Value-2 :");
		int v2=s.nextInt();
		System.out.println("******Choice******");
		System.out.println("1.GreaterValue\n2.SmallerValue");
		System.out.println("Enter The Choice");
		int choice=s.nextInt();
		
		IComparable ob=Access.getRef(choice);
		if(ob==null)
		{
			System.out.println("Invalid Choice...");
		}
		else
		{
			System.out.println("Result :"+ob.compareTo(v1, v2));
		}
		s.close();
	}

}

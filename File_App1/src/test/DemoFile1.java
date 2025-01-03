package test;
import java.util.*;
public class DemoFile1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter The Value Of X :");
				int x=s.nextInt();
				System.out.println("The Value Of X :"+x);
				System.out.println("======References======");
				System.out.println(System.in);
				System.out.println(System.out);
				System.out.println(System.err);
				
			}catch(Exception e)
			{
				System.err.println("Enter Only Integer Value..");
			}
		}
	}
}

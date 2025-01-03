package p2;
import p1.*;
import java.util.Scanner;
public class DemoInheritance5_1 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number");
		int v1=s.nextInt();
		System.out.println("Enter Second Number");
		int v2=s.nextInt();
		
		int res=CClass1.sub(v1,v2);
		System.out.println("Subtract :"+res);
	}
}

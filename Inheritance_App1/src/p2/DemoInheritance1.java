package p2;
import java.util.*;
import p1.*;

public class DemoInheritance1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		ClassB ob = new ClassB();
		System.out.println("Enter The Value of a:");
		ob.a=s.nextInt();
		System.out.println("Enter The Value Of b:");
		ClassB.b=s.nextInt();
		System.out.println("Enter The Value of x:");
		ob.x=s.nextInt();
		System.out.println("Enter The Value Of y:");
		ClassB.y=s.nextInt();
		
		ob.m1();
		ClassB.m11();
		
		ob.m2();
		ClassB.m22();
		
		s.close();

	}

}

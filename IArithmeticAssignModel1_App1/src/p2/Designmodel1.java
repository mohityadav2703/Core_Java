package p2;
import p1.*;
import java.util.Scanner;
public class Designmodel1 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value-1 :");
		int v1=s.nextInt();
		System.out.println("Enter Value-2 :");
		int v2=s.nextInt();
		System.out.println("*******Choice*******");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiply\n4.Divide\n5.ModDiv");
		System.out.println("Enter the choice :");
		int choice=s.nextInt();
		
		IArithmetic ob = Access.getRef(choice);
		switch(choice)
		{
		case 1:
			System.out.println("Sum :"+ob.calculate(v1, v2));
			break;
			
		case 2:
			System.out.println("Subtract :"+ob.calculate(v1, v2));
			break;
			
		case 3:
			System.out.println("Multiply :"+ob.calculate(v1,v2));
			break;
			
		case 4:
			System.out.println("Divide :"+ob.calculate(v1,v2));
			break;
			
		case 5:
			System.out.println("ModDiv :"+ob.calculate(v1,v2));
			break;
			
			default:
				System.out.println("Invalid choice......");
		}
		s.close();
	}

}

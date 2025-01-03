package p2;
import p1.*;
import java.util.Scanner;
public class DemoMultipleInheritance3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Value :");
		int v1=s.nextInt();
		System.out.println("Enter Second Value :");
		int v2=s.nextInt();
		System.out.println("********Choice*********");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDiv");
		System.out.print("Enter The Choice :");
		int choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			Addition ad=new Addition();
			double r1=ad.calculate(v1,v2);
			System.out.println("Addition :"+r1);
			break;
		case 2:
			Subtraction sub = new Subtraction();
			double r2=sub.calculate(v1,v2);
			System.out.println("Subtraction :"+r2);
			break;
		case 3:
			Multiplication mul = new Multiplication();
			double r3=mul.calculate(v1,v2);
			System.out.println("Multiplication :"+r3);
			break;
		case 4:
			Division div = new Division();
			double r4 = div.calculate(v1,v2);
			System.out.println("Division :"+r4);
			break;
		case 5:
			ModDiv mod =new ModDiv();
			double r5=mod.calculate(v1,v2);
			System.out.println("ModDiv :"+r5);
			break;
			default:
				System.out.println("Invalid Choice.....");
		}
		s.close();
	}

}

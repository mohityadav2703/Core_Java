package p2;
import p1.Addition;
import p1.Subtraction;
import p1.Multiplication;
import p1.Division;
import p1.Modulus;
import java.util.Scanner;

public class DemoMethod9 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int val1=s.nextInt();
		System.out.println("Enter Second Number :");
		int val2=s.nextInt();
		System.out.println("*****Choice*****");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
		System.out.println("Choose Any Option");
		int choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			Addition add = new Addition();
			int res1=add.addition(val1, val2);
			System.out.println("Addition :"+res1);
			break;
			
		case 2:
			Subtraction sub = new Subtraction();
			int res2=sub.subtraction(val1,val2);
			System.out.println("Subtraction :"+res2);
			break;
			
		case 3:
			Multiplication mul = new Multiplication();
			int res3=mul.multiplication(val1, val2);
			System.out.println("Multiplication :"+res3);
			break;
			
		case 4:
			Division div = new Division();
			int res4=div.division(val1, val2);
			System.out.println("Division :"+res4);
			break;
			
		case 5:
			Modulus mod = new Modulus();
			int res5=mod.modulus(val1, val2);
			System.out.println("Modulus :"+res5);
			break;
			
			default:
				System.out.println("Invalid Choice.......");
				
				s.close();
		}

	}

}

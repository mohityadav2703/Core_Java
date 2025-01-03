package p2;
import p1.EmpSalary;
import java.util.Scanner;

public class DemoEmp {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Basic Salary :");
		int sal = s.nextInt();
		
		if(sal>=12000)
		{
			EmpSalary es = new EmpSalary();
			float res=es.cal(sal);
			System.out.println("Total Salary is :"+res);
		}
		else
		{
			System.out.println("Invalid Basic Salary :");
		}
		s.close();

	}

}

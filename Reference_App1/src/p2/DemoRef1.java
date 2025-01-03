package p2;
import p1.*;
import java.util.Scanner;

public class DemoRef1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Employee ob = new Employee();
		System.out.println("Enter EmployeeId :");
		ob.id=s.nextLine();
		System.out.println("Enter EmployeeName :");
		ob.name=s.nextLine();
		System.out.println("Enter EmployeeDesg :");
		ob.desg=s.nextLine();
		System.out.println("Enter EmployeeHNo :");
		ob.ad.hNo=s.nextLine();
		System.out.println("Enter EmployeeSName :");
		ob.ad.sName=s.nextLine();
		System.out.println("Enter EmployeeCity :");
		ob.ad.city=s.nextLine();
		System.out.println("Enter EmployeeState :");
		ob.ad.state=s.nextLine();
		System.out.println("Enter EmployeePinCode :");
		ob.ad.pinCode=s.nextInt();
		
		ob.getEmployee();
		s.close();
		
	}

}

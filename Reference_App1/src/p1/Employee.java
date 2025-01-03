package p1;

public class Employee
{
	public String id,name,desg;
	public Address ad = new Address();
	
	public void getEmployee()
	{
		System.out.println("******EmployeeDetails********");
		System.out.println("EmployeeId :"+id);
		System.out.println("EmployeeName :"+name);
		System.out.println("EmployeeDesg :"+desg);
		
		ad.getAddress();
	}
}

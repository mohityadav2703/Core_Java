package p1;

public class Student 
{
	public String name;
	public int rollNo;
	public String branch;
	
	Address ad = new Address();
	Contact ct = new Contact();
	Result rs = new Result();
	
	public void getStudent()
	{
		System.out.println("========Student Details========");
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rollNo);
		System.out.println("Branch: "+branch);
	}
}

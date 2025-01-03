package p1;

public class Student 
{
	public String name,branch;
	public int rollNo;
	
	public Address ad = new Address();
	public Contact ct = new Contact();
	
	public void getStudent()
	{
		System.out.println("*****StudentDetails*****");
		System.out.println("Name :"+name);
		System.out.println("RollNo :"+rollNo);
		System.out.println("Brach :"+branch);
		
		ad.getAddress();
		ct.getContact();
	}
}

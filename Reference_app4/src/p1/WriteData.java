package p1;
import java.util.Scanner;
public class WriteData 
{
	Student stu = new Student();
	
	public WriteData(Student stu)
	{
		this.stu=stu;
	}
	public void readStuDetails(Scanner s)
	{
		System.out.println("Enter Student Roll:");
		stu.rollNo=s.nextInt();
		System.out.println("Enter Student Name:");
		stu.name=s.nextLine();
		System.out.println("Enter Student Branch:");
		stu.branch=s.nextLine();
		System.out.println("Enter House Number:");
		stu.ad.hNo=s.nextLine();
		System.out.println("Enter Street Name:");
		stu.ad.sName=s.nextLine();
		System.out.println("Enter City :");
		stu.ad.city=s.nextLine();
		System.out.println("Enter State :");
		stu.ad.state=s.nextLine();
		System.out.println("Enter PinNo :");
		stu.ad.pinCode=s.nextInt();
		System.out.println("Enter Email_Id:");
		stu.ct.mailId=s.nextLine();
		System.out.println("Enter Phone Number:");
		stu.ct.phNo=s.nextLong();
		System.out.println("Enter Total Number:");
		stu.rs.totM=s.nextInt();
		System.out.println("Enter Percentage:");
		stu.rs.per=s.nextDouble();
		System.out.println("Enter Result:");
		stu.rs.result=s.nextLine();
		
		
	}
}

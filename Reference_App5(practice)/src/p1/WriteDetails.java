package p1;
import java.util.*;

public class WriteDetails {

	public StudentDetails sd =null;
	
	public WriteDetails(StudentDetails sd)
	{
		this.sd=sd;
	}
	
	public void readDetails(Scanner s)
	{
		System.out.println("Enter Name:");
		sd.name=s.nextLine();
		System.out.println("Enter Roll_NO:");
		sd.rollNo=Integer.parseInt(s.nextLine());
		System.out.println("Enter Branch:");
		sd.branch=s.nextLine();
		System.out.println("Enter College Name:");
		sd.c_Name=s.nextLine();
		System.out.println("Enter Phone_Number:");
		sd.p_No=Long.parseLong(s.nextLine());
		System.out.println("Enter Address:");
		sd.address=s.nextLine();
		
		s.close();
	}
	
}

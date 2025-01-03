package p2;
import p1.*;
import java.util.Scanner;

public class DemoRef2 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Student st = new Student();
		System.out.println("Enter Student Name :");
		st.name=s.nextLine();
		System.out.println("Enter Student RollNo :");
		st.rollNo=Integer.parseInt(s.nextLine());
		System.out.println("Enter Student Branch :");
		st.branch=s.nextLine();
		System.out.println("Enter Student MailId :");
		st.ct.mailId=s.nextLine();
		System.out.println("Enter Student PhoneNumber :");
		st.ct.phNo=Long.parseLong(s.nextLine());
		System.out.println("Enter Student HouseNumber:");
		st.ad.hNo=s.nextLine();
		System.out.println("Enter Student StreetName :");
		st.ad.sName=s.nextLine();
		System.out.println("Enter Student City :");
		st.ad.city=s.nextLine();
		System.out.println("Enter Student State :");
		st.ad.state=s.nextLine();
		System.out.println("Enter Student PinCode :");
		st.ad.pinCode=Integer.parseInt(s.nextLine());	
		st.getStudent();
		
		s.close();
		
	}

	private static long parseLong(long nextLong) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int parseInt(int nextInt) {
		// TODO Auto-generated method stub
		return 0;
	}

}

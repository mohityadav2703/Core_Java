package p2;
import java.util.Scanner;
import p1.User;

public class DemoUser {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		User ob = new User();
		System.out.println("Enter The UserName :");
		ob.name=s.nextLine();
		System.out.println("Enter The MailId :");
		ob.mailId=s.nextLine();
		System.out.println("Enter The PhoneNo :");
		ob.phNo=s.nextLong();
		ob.getUser();
		s.close();

	}

}

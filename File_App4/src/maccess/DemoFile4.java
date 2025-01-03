package maccess;
import test.Register;
import java.io.*;
import java.util.*;
public class DemoFile4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter The UserName :");
				String uN=s.nextLine();
				System.out.println("Enter The PassWord :");
				String pW=s.nextLine();
				System.out.println("Enter The Name :");
				String name=s.nextLine();
				
				Register ob1=new Register(uN,pW,name,new Date());
				File f=new File("D:\\soft\\Object.txt");
				FileOutputStream fos=new FileOutputStream(f);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(ob1); //Serialization
				System.out.println("*****Display-Details*****");
				System.out.println(ob1.Display());
				System.out.println("Object Stream Stored Successfully");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource

	}

}

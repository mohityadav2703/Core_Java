package p2;
import p1.StudentDetails;
import java.util.*;
public class DemoArray5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter The Number Of Student:");
				int n=Integer.parseInt(s.nextLine());
				
				StudentDetails sd[] = new StudentDetails[n];
				System.out.println("Enter The "+n+" Student Values:");
				for(int i=0;i<sd.length;i++)
				{
					System.out.println("Enter The Details of Student -"+(i+1));
					System.out.println("Enter The Student Id:");
					String id=s.nextLine();
					System.out.println("Enter The Student Name:");
					String name=s.nextLine();
					System.out.println("Enter The Student Branch:");
					String branch=s.nextLine();
					System.out.println("Enter The Student Address:");
					String addr=s.nextLine();
					System.out.println("Enter The Student Email:");
					String email=s.nextLine();
					System.out.println("Enter The Student Fee:");
					int fee=Integer.parseInt(s.nextLine());
					System.out.println("Enter The Student Phone:");
					long phno=Long.parseLong(s.nextLine());
					
					sd[i]=new StudentDetails(id,name,branch,addr,email,fee,phno);
				}//end of loop
				System.out.println("=============StudentDetails=============");
				Spliterator<StudentDetails> sp=Arrays.spliterator(sd);
				sp.forEachRemaining((k)->
							{
								System.out.println(k.display());
							});
			}//end of try
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}// end of try with resource
	}

}

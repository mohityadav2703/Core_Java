package p2;
import p1.Employee;
import java.util.*;
public class DemoArray3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter The Number Of Employee:");
				int n=Integer.parseInt(s.nextLine());
				
				Employee emp[]=new Employee[n];
				System.out.println("Enter "+n+" Employee Details...");
				for(int i=0;i<emp.length;i++)
				{
					System.out.println("Enter The Details Of Employee-"+(i+1));
					System.out.println("Enter The EmpId:");
					String id=s.nextLine();
					System.out.println("Enter The EmpName:");
					String name=s.nextLine();
					System.out.println("Enter The EmpDesg:");
					String desg=s.nextLine();
					System.out.println("Enter The EmpSal:");
					int sal=Integer.parseInt(s.nextLine());
					emp[i]=new Employee(id,name,desg,sal);
				}//end of loop
				System.out.println("==========EmplyeeDetails==========");
				Spliterator<Employee> sp=Arrays.spliterator(emp);
				sp.forEachRemaining((k)->
				{
					System.out.println(k.toString());
				});
			}//end of try
			catch(InputMismatchException ime)
			{
				System.out.println("Invalid input...");
			}
		}//end of try with resource

	}

}

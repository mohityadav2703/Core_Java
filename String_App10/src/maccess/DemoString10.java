package maccess;
import test.*;
import java.util.*;
public class DemoString10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter The StuName:");
			String name=s.nextLine();
			System.out.println("Enter The StuRollNo:");
			String rollNo=s.nextLine();
			int len=rollNo.length();
			if(len==10)
			{
				String yoj=rollNo.substring(0,2);
				String collCode=rollNo.substring(2,6);
				String brCode=rollNo.substring(6,8);
				String num=rollNo.substring(8);
				System.out.println("*****Details of rollNo*****");
				System.out.println("year of joining :"+yoj);
				System.out.println("College Code :"+collCode);
				System.out.println("Branch code :"+brCode);
				System.out.println("Number in Class :"+num);
				System.out.println("******************************");
				GenerateBranch gb = new GenerateBranch();
				String gBr=gb.generate(brCode);
				if(gBr==null)
				{
					System.out.println("RollNo holding invalid brCode...");
				}
				else
				{
					System.out.println("Entered RollNo belongs to :"+gBr);
					System.out.println("*****************************");
					System.out.println("Enter The Branch:");
					System.out.println("(CIVIL/EEE/MECH/ECE/CSE)");
					String eBr=s.nextLine().toUpperCase();
					CheckBranch cb = new CheckBranch();
					boolean k = cb.verify(eBr);
					if(k)
					{
						if(gBr.equals(eBr))
						{
							System.out.println("RollNo validate with branch successfully...");
							System.out.println("***********************");
							System.out.println("=====Enter 6 sub Marks=====");
							int i=1,totM=0;
							boolean p=false;
							while(i<=6)
							{
								System.out.println("Enter the marks of sub :"+i);
								int sub=s.nextInt();
								if(sub<0 || sub>100)
								{
									System.out.println("Invalid marks....");
									continue; //skip below lines from the iteration
								}
								if(sub>=0 && sub<=34)
								{
									p=true;
								}
								totM=totM+sub;
								i++;
							}//end of loop
							System.out.println("*****************");
							System.out.println("Name :"+name);
							System.out.println("RollNo:"+rollNo);
							System.out.println("Branch:"+eBr);
							System.out.println("TotalMarks:"+totM);
							float per = (float)totM/6;
							System.out.println("Percentage :"+per);
							if(p)
							{
								System.out.println("Final Result:Fail");
							}
							else
							{
								GenerateResult gr = new GenerateResult();
								String res=gr.result(per);
								System.out.println("Final Result :"+res);
							}
						}
						else
						{
							System.out.println("RollNo not belongs to branch");
						}
					}
					else
					{
						System.out.println("Invalid Branch....");
					}
				}
			}
			else
			{
				System.out.println("Invalid RollNo...");
			}
		}//end of try with resourse

	}

}

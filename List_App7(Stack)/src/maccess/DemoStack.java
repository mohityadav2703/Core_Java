package maccess;
import java.util.*;
public class DemoStack {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
				Stack<Integer> ob=new Stack<Integer>();
				while(true)
				{
					System.out.println("********Choice*********");
					System.out.println("\t1.push"+"\n\t2.pop"+"\n\t3.peek"+"\n\t4.search(object)"+"\n\t5.Exit");
					System.out.println("Enter The Choice :");
					switch(s.nextInt())
					{
					case 1:
						System.out.println("Enter The Element :");
						ob.push(new Integer(s.nextInt()));
						System.out.println(ob.toString());
						break;
					case 2:
						if(ob.empty())
						{
							System.out.println("Stack is empty...");
						}
						else
						{
							ob.pop();
							System.out.println(ob.toString());
						}
						break;
					case 3:
						if(ob.empty())
						{
							System.out.println("Stack is Empty....");
						}
						else
						{
							System.out.println(ob.peek());
							System.out.println(ob.toString());
						}
						break;
					case 4:
						if(ob.empty())
						{
							System.out.println("Stack is Empty...");
						}
						else
						{
							System.out.println("Enter The Element to be Searched :");
							Integer e1=new Integer(s.nextInt());
							int p=ob.search(e1);
							if(p>0)
							{
								System.out.println(e1+" found at pos : "+p);
							}
							else
							{
								System.out.println("Element not Found...");
							}
						}
						break;
					case 5:
						System.out.println("Operation Stopped...");
						System.exit(0);
						default:
						System.out.println("Invalid Choice...");	
					}
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource

	}

}

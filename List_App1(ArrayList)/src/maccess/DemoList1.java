package maccess;
import java.util.*;
public class DemoList1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
				ArrayList<Integer> a1=new ArrayList<Integer>();
				while(true)
				{
					System.out.println("******Choice******");
					System.out.println("\t1.add(E)"+"\n\t2.add(int,E)"+"\n\t3.remove(object)"+"\n\t4.remove(int)"+"\n\t5.get(int)"+"\n\t6.set(int,E)"+"\n\t7.Sorting"+"\n\t8.Exit");
					System.out.println("Enter The choice :");
					switch(s.nextInt())
					{
					case 1:
						System.out.println("Enter The Elements:");
						a1.add(new Integer(s.nextInt()));
						System.out.println(a1.toString());
						break;
					case 2:
						if(a1.isEmpty())
						{
							System.out.println("List is Empty....");
						}
						else
						{
							System.out.println("Enter The index :");
							int i1=s.nextInt();
							if(i1>=0 && i1<a1.size())
							{
								System.out.println("Enter The Elements :");
								a1.add(i1,new Integer(s.nextInt()));
								System.out.println(a1.toString());
							}
							else
							{
								System.out.println("Invalid Index....");
							}
						}
						break;
					case 3:
						if(a1.isEmpty())
						{
							System.out.println("List Is Empty.....");
						}
						else
						{
							System.out.println("Enter The Elements to be Removed :");
							if(a1.remove(new Integer(s.nextInt())))
							{
								System.out.println("Elements Remved Successfully....");
								System.out.println(a1.toString());
							}
							else
							{
								System.out.println("Elements Not Found...");
							}
						}
						break;
					case 4:
						if(a1.isEmpty())
						{
							System.out.println("List Is Empty....");
						}
						else
						{
							System.out.println("Enter The Index :");
							int i2=s.nextInt();
							if(i2>=0 && i2<a1.size())
							{
								a1.remove(i2);
								System.out.println("Elements removed Successfully...");
								System.out.println(a1.toString());
							}
							else
							{
								System.out.println("Invalid Index...");
							}
						}
						break;
					case 5:
						if(a1.isEmpty())
						{
							System.out.println("List is Empty.....");
						}
						else
						{
							System.out.println("Enter The index to get the eles :");
							int i3=s.nextInt();
							if(i3>=0 && i3<a1.size())
							{
								Integer e1=a1.get(i3);
								System.out.println("Ele at index "+i3+"is"+e1);
								System.out.println(a1.toString());
							}
							else
							{
								System.out.println("Invalid Index....");
							}
						}
						break;
					case 6:
						if(a1.isEmpty())
						{
							System.out.println("List is Empty....");
						}
						else
						{
							System.out.println("Enter The Index :");
							int i4=s.nextInt();
							if(i4>=0 && i4<a1.size())
							{
								System.out.println("Enter The Element :");
								a1.set(i4, new Integer(s.nextInt()));
								System.out.println(a1.toString());
							}
							else
							{
								System.out.println("Invalid index...");
							}
						}
						break;
					case 7:
						if(a1.isEmpty())
						{
							System.out.println("List is Empty....");
						}
						else
						{
							Collections.sort(a1); //sorting process
							System.out.println(a1.toString());
						}
						break;
					case 8:
						System.out.println("Operation Stopped...");
						System.exit(0);
						break;
						default:
							System.out.println("Invalid Choice....");
					}
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource

	}

}

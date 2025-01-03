package maccess;
import java.util.*;
public class DemoSet1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s)
		{
			try
			{
				Set<Integer> ob=null;
				String nm=null;
				while(true)
				{
					System.out.println("\n--------Choice--------");
					System.out.println("\t1.HashSet<E>"+"\n\t2.LinkedHashSet"+"\n\t3.TreeSet<E>"+"\n\t4.Exit");
					System.out.println("Enter The choice:");
					switch(s.nextInt())
					{
					case 1:
						ob=new HashSet<Integer>();
						nm="HashSet<E>";
						break;
					case 2:
						ob=new LinkedHashSet<Integer>();
						nm="LinkedHashSet<E>";
						break;
					case 3:
						ob=new TreeSet<Integer>();
						nm="TreeSet<E>";
						break;
					case 4:
						System.out.println("Operation Stopped on set....");
						System.exit(0);
						break;
						default:
							System.out.println("Invalid Choice...");
							continue; //skip the below lines
					}
					System.out.println("Operation Perform on "+nm);
					xyz:
						while(true)
						{
							System.out.println("\n******Choice******");
							System.out.println("\t1.add(E)"+"\n\t2.Remove(object)"+"\n\t3.Display"+"\n\t4.Exit");
							System.out.println("Enter The Choice:");
							switch(s.nextInt())
							{
							case 1:
								System.out.println("Enter The Integer-Element:");
								ob.add(new Integer(s.nextInt()));
								System.out.println("Elements added Successfully...");
								System.out.println(ob.toString());
								break;
							case 2:
								
								if(ob.isEmpty())
								{
									System.out.println("Set is Empty..");
								}
								else
								{
									System.out.println("Enter The Element to be removed :");
									if(ob.remove(new Integer(s.nextInt())))
									{
										System.out.println("Eement Removed SuccessFully....");
										System.out.println(ob.toString());
									}
									else
									{
										System.out.println("Elements not Available in Set...");
									}
								}
								break;
							case 3:
								System.out.println("=========Iterator=========");
								Iterator<Integer> it1= ob.iterator();
								while(it1.hasNext())
								{
									System.out.println(it1.next()+" ");
								}
								System.out.println("\n=========Iterator<E>=========");
								Iterator<Integer> it2=ob.iterator();
								it2.forEachRemaining((k)->
									{
											System.out.print(k.toString()+" ");
									});
								System.out.println("\n==========ForEach()(java8)==========");
								ob.forEach((k)->
										{
											System.out.print(k.toString()+" ");
										});
								break;
							case 4:
								System.out.println("Operation stopped on "+nm);
								break xyz;
								default:
									System.out.println("Invalid Choice..");
							}	
						}
				}//end of loop
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource
	}

}

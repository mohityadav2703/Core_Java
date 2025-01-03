package maccess;
import test.*;
import java.util.function.*;
import java.util.*;
@SuppressWarnings("unused")
public class DemoSet3 {
	@SuppressWarnings("unused")
	public static boolean b1=false;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s)
		{
			try
			{
				Set<Product> ob=null;
				String nm=null;
				while(true)
				{
					System.out.println("----------Choice----------");
					System.out.println("\t1.HashSet<E>"+"\n\t2.LinkedHashSet<E>"+"\n\t3.TreeSet<E>"+"\n\t4.Exit");
					System.out.println("Enter The Choice:");
					switch(Integer.parseInt(s.nextLine()))
					{
					case 1:
						ob=new HashSet<Product>();
						nm="HashSet<E>";
						break;
					case 2:
						ob=new LinkedHashSet<Product>();
						nm="LinkedHashSet<E>";
						break;
					case 3:
						ob=new TreeSet<Product>();
						nm="TreeSet<E>";
						break;
					case 4:
						System.out.println("Operation Stopped On Set...");
						System.exit(0);
						break;
						default:
							System.out.println("Invalid Choice....");
					}
					
					System.out.println("Enter The choice perform on "+nm);
					xyz:
						while(true)
						{
							System.out.println("========choice========");
							System.out.println("\t1.Add"+"\n\t2.Remove"+"\n\t3.ProductByProdCode"+"\n\t4.Display"+"\n\t5.Exit");
							System.out.println("Enter The Choice:");
							switch(Integer.parseInt(s.nextLine()))
							{
							case 1:
								System.out.println("Enter Product Code:");
								String pc=s.nextLine();
								System.out.println("Enter Product Name:");
								String pn=s.nextLine();
								System.out.println("Enter Product Price:");
								float pp=Float.parseFloat(s.nextLine());
								System.out.println("Enter Product Qty:");
								int pq=Integer.parseInt(s.nextLine());
								ob.add(new Product(pc,pn,pp,pq));
								ob.forEach((k)->
								{
									System.out.println(k);
								});
								break;
							case 2:
								if(ob.isEmpty())
								{
									System.out.println("Set is Empty....");
								}
								else
								{
									System.out.println("Enter The Pcode to remove Product:");
									String pc2=s.nextLine();
									Iterator<Product> it=ob.iterator();
									it.forEachRemaining((d)->
									{
										Product p=(Product)d;
										if(p.code.equals(pc2))
										{
											b1=true;
											it.remove();
										System.out.println("Product Removed Successfully...");	
										}
									});
									if(b1)
									{
										ob.forEach((k)->
										{
											System.out.println(k);
										});
									}
									else
									{
										System.out.println("Invalid ProductCode...");
									}
								}
								break;
							case 3:
								if(ob.isEmpty())
								{
									System.out.println("Enter The PCode to remove Product");
									String pc3=s.nextLine();
									Predicate<Product> p=(k)->
									{
										if(k.code.equals(pc3))
										{
											return true;
										}
										else
										{
											return false;
										}
									};
									ob.forEach((z)->
									{
										if(p.test(z))
										{
											b1=true;
											System.out.println(z);
										}
									});
									if(!b1)
									{
										System.out.println("Invalid ProdCode...");
									}
								}
								else
								{
									System.out.println("Set Is Empty....");
								}
								break;
							case 4:
								System.out.println("\n======forEach()(Java8)=======");
								ob.forEach((k)->
								{
									System.out.println(k.toString());
								});
								break;
							case 5:
								System.out.println("Operation Stopped...");
								System.exit(0);
								break;
							}
						}
				}
				
			}catch(Exception e)
			{
				
			}
		}//end of try with resource

	}

}

package maccess;
import test.Product;
import java.util.*;
import java.util.function.*;

public class DemoSet4 {
	public static boolean bl=false;
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	try(s;)
	{
		try
		{
			Set<Product> ob=null;
			String nm=null;
			while(true)
			{
				System.out.println("========Choice========");
				System.out.println("\t1.HashSet<E>"+"\n\t2.LinkedHashSet<E>"+"\n\t3.TreeSet<E>"+"\n\t4.Exit");
				System.out.println("Enter The Choice :");
				switch(Integer.parseInt(s.nextLine()))
				{
				case 1:
					ob=new HashSet<Product>();
					nm="HashSet<E>";
					break;
				case 2:
					ob=new LinkedHashSet<Product>();
					nm="LinkedHashSet";
					break;
				case 3:
					ob=new TreeSet<Product>();
					nm="TreeSet";
					break;
				case 4:
					System.out.println("Operation Stopped......");
					System.exit(0);
					break;
					default:
						System.out.println("Invalid Choice....");
						continue;
				}
				System.out.println("Perform Operation On "+nm);
				xyz:
					while(true)
					{
						System.out.println("*****Choice******");
						System.out.println("\t1.Add"+"\n\t2.Remove"+"\n\t3.ProductByProdCode"+"\n\t4.Display"+"\n\t5.Exit");
						switch(Integer.parseInt(s.nextLine()))
						{
						case 1:
							System.out.println("Enter The ProdCode:");
							String pc=s.nextLine();
							System.out.println("Enter The ProdName:");
							String pn=s.nextLine();
							System.out.println("Enter The ProdPrice:");
							float pp=Float.parseFloat(s.nextLine());
							System.out.println("Enter The ProdQty:");
							int pq=Integer.parseInt(s.nextLine());
							ob.add(new Product(pc,pn,pp,pq));
							System.out.println("Product Added SuccessFully....");
							ob.forEach((k)->
										{
											System.out.println(k.toString());
										});
							break;
						case 2:
							if(ob.isEmpty())
							{
								System.out.println("Set is Empty...");
							}
							else
							{
								System.out.println("Enter The PCode to Remove Product:");
								String pc2=s.nextLine();
								Iterator<Product> it=ob.iterator();
								it.forEachRemaining((d)->
								{
									Product p=(Product)d;
									if(p.code.equals(pc2))
									{
										bl=true;
										it.remove();
										System.out.println("Product Removed SuccessFully...");
									}
								});
								if(bl)
								{
									ob.forEach((k)->
											System.out.println(k)
											);
								}
								else
								{
									System.out.println("Invalid Product Code...");	
								}
							}
							break;
						case 3:
							if(ob.isEmpty())
							{
								System.out.println("Set Is Empty....");
							}
							else
							{
								System.out.println("Enter The ProdCode to remove the Product:");
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
														bl=true;
														System.out.println(z);
													});
													if(!bl)
													{
														System.out.println("Invalid ProdCode....");
													}
							
							}
							break;
						case 4:
							System.out.println("\n========ForEach()(Java8)========");
							ob.forEach((k)->
							{
								System.out.println(k.toString());
							});
							break;
						case 5:
							System.out.println("Operation Stopped....");
							System.exit(0);
							break xyz;
							default:
								System.out.println("Invalid Choice...");
						}

					}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}//end of try with resource

 }

}

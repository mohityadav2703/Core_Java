package maccess;
import java.util.*;
import test.CustomerValues;
public class DemoMap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try
			{
				Map<String,CustomerValues> m=null;
				String nm=null;
				while(true)
				{
					System.out.println("****Choice****");
					System.out.println("\t1.HashMap"+"\n\t2.LinkedHashMap"+"\n\t3.TreeMap"+"\n\t4.HashTable"+"\n\t5.Exit");
					System.out.println("Enter The Choice :");
					switch(Integer.parseInt(s.nextLine()))
					{
					case 1:
						m=new HashMap<String,CustomerValues>();
						nm="HashMap";
						break;
					case 2:
						m=new LinkedHashMap<String,CustomerValues>();
						nm="LinkedHashMap";
						break;
					case 3:
						m=new TreeMap<String,CustomerValues>();
						nm="TreeMap";
						break;
					case 4:
						m=new Hashtable<String,CustomerValues>();
						nm="Hashtable";
						break;
					case 5:
						System.out.println("Operation Stopped...");
						System.exit(0);
						default :
							System.out.println("Invalid Choice...");
							continue;
					}//end of switch
					System.out.println("Perform Operation on"+nm);
					xyz:
						while(true)
						{
							System.out.println("\t1.put(k,v)"
											+"\n\t2.remove(object)"
											+"\n\t3.get(Object)"
											+"\n\t4.keySet()"
											+"\n\t5.values()"
											+"\n\t6.entrySet()---display"
											+"\n\t7.exit");
							System.out.println("Enter The Choice :");
							switch(Integer.parseInt(s.nextLine()))
							{
							case 1:
								System.out.println("=====CustomerDetails=====");
								System.out.println("Enter CustId :");
								String id=s.nextLine();
								System.out.println("Enter CustName :");
								String name=s.nextLine();
								System.out.println("Enter CustCity :");
								String city=s.nextLine();
								System.out.println("Enter MailId :");
								String mid=s.nextLine();
								System.out.println("Enter CustPhNo :");
								long phNo=Long.parseLong(s.nextLine());
								m.put(new String(id), new CustomerValues(name,city,mid,phNo));
								System.out.println("Customer added successfully.....");
								m.forEach((k,v)->
								{
									System.out.println(k+"\t"+v);
								});
								break;
							case 2:
								System.out.println("Enter the key(id) to remove Customer Details :");
								String id2=s.nextLine();
								if(m.containsKey(id2))
								{
									m.remove(id2);
									System.out.println("CustDetails removed successfully....");
									m.forEach((k,v)->
									{
										System.out.println(k+"\t"+v);
									});
								}
								else
								{
									System.out.println("Invalid CustId..");
								}
								break;
							case 3:
								System.out.println("Enter the key(id) to get the values :");
								String id3=s.nextLine();
								if(m.containsKey(id3))
								{
									CustomerValues cv=m.get(id3);
									System.out.println(cv.toString());
								}
								else
								{
									System.out.println("Invalid CustId...");
								}
								break;
							case 4:
								if(m.isEmpty())
								{
									System.out.println("Map is Empty...");
								}
								else
								{
									Set<String> ks=m.keySet();
									System.out.println("======keySet======");
									ks.forEach((k)->
									{
										System.out.println(k);
									});
								}
								break;
							case 5:
								if(m.isEmpty())
								{
									System.out.println("Map is Empty...");
								}
								else
								{
									Collection<CustomerValues> cv=m.values();
									System.out.println("======Values======");
									cv.forEach((v)->
									{
										System.out.println(v);
									});
								}
								break;
							case 6:
								if(m.isEmpty())
								{
									System.out.println("Map is Empty....");
								}
								else
								{
									System.out.println("======DisplayDetails======");
									for(Map.Entry<String,CustomerValues> e :m.entrySet())
									{
										System.out.println(e.getKey()+"\t"+e.getValue());
									}
								}
								break;
							case 7:
								System.out.println("Operation Stopped "+nm);
								break xyz;
								default :
									System.out.println("Invalid Choice....");
							}
						}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}

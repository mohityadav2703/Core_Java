package p1;
public class Selection {
	public synchronized static void select(int n,String name)
	{
		if(n<=Available.available)
		{
			System.out.println(n+" Ticket Booked Successfully by "+name);
			Available.available=Available.available-n;
		}
		else
		{
			System.out.println("Sorry ! No Ticket Available For "+name);
		}
	}
}

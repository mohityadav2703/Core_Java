package p2;
import java.util.Scanner;
import p1.*;

public class DemoRef3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		BookDetails bd = new BookDetails();
		WriteData wd = new WriteData(bd);
		ReadData rd = new ReadData(bd);
		
		wd.readBookDetails(s);
		rd.disBookDetails();
		s.close();

	}

}

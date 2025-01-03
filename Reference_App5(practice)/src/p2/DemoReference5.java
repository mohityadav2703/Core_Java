package p2;
import p1.*;
import java.util.*;
public class DemoReference5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StudentDetails sd = new StudentDetails();
		WriteDetails wd = new WriteDetails(sd);
		ReadDetails rd = new ReadDetails(sd);
		
		wd.readDetails(s);
		rd.display();
		

	}

}

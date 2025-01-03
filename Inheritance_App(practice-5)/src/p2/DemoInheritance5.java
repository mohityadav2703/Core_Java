//instance member parent class method overriding process
package p2;
import p1.*;
import java.util.*;
public class DemoInheritance5 {

	public static void main(String[] args) {
		CClass ob = new CClass();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number");
		int v1=s.nextInt();
		System.out.println("Enter Sec Number");
		int v2=s.nextInt();
		int res=ob.add(v1,v2);
		System.out.println("ADD:"+res);
		s.close();
	}

}

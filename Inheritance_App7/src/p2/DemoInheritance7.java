package p2;
import p1.*;
import java.util.Scanner;

public class DemoInheritance7 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter first number :");
	int v1 = s.nextInt();
	System.out.println("Enter Second number :");
	int v2 = s.nextInt();
	
	C_class cs= new C_class();
	int res=cs.calculate(v1,v2);
	System.out.println("Result :"+res);
	s.close();

	}

}

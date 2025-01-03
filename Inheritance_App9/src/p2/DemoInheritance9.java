package p2;
import p1.*;

public class DemoInheritance9 {

	public static void main(String[] args) 
	{
		C_class ob = new C_class();
	//  ob.m(10) ==> p_class int(a);
	//  ob.m(10,11) ==> P_class (int a,int b)
	//  ob.m(10,11,12) ==> c_class(int a,int b,int c)
		ob.m(10, 11, 12,13); //==> c_class(int a,int b,int c,int d)
	}

}

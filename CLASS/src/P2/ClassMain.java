package P2;
import P1.*;

public class ClassMain {

	public static void main(String[] args) 
	{
		Components cmp= new Components();
		int a1=cmp.a;
		float a2=Components.b;
		
		System.out.println("******Access Variables******");
		System.out.println("The value of a :"+a1);
		System.out.println("The value of b :"+a2);
		
		cmp.method1(12, 13);
		Components.method2(14, 15);
		
		Components cmp1=new Components(123);
		int pc1=cmp1.pc;
		System.out.println("The value of pc1 :"+pc1);
	}

}

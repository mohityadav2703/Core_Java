package p2;
import p1.ITest;
public class DemolambdaExp1 {
	public static void main(String[] args) {
		int r=20;
		ITest ob=(int a)->
		{
			System.out.println("The Value of a :"+a);
			System.out.println("The Value of m :"+ITest.m);
			System.out.println("The Value of r :"+r);
		};
		ob.m1(12);
		ob.dis1(13);
	}

}

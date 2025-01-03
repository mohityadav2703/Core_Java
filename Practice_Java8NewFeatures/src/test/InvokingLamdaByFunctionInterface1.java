package test;

interface Interf1{
	public int m2(int a, int b);
}


public class InvokingLamdaByFunctionInterface1 {

	public static void main(String[] args) {
		
		Interf1 i=(a,b)->a+b;
		System.out.println(i.m2(10, 20));
		System.out.println(i.m2(100, 200));
	}

}

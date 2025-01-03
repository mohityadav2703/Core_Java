package test;

interface Interf{
	public void m1();
}

public class InvokingLamdaByFunctionInterface {
	public static void main(String[] args) {
		
		Interf i=()->System.out.println("This is m1() method");
		i.m1();
	}

}

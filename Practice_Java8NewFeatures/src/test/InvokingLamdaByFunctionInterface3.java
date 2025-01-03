package test;

interface Interf3{
	public int squareOf(int x);
}

public class InvokingLamdaByFunctionInterface3 {
	public static void main(String[] args) {
		Interf3 i=(x)->x*x;
		System.out.println("Square is :"+i.squareOf(11));
		System.out.println("Square is :"+i.squareOf(17));
	}
}

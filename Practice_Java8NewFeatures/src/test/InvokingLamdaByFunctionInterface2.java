package test;

interface Interf2{
	public int getLength(String s);
}

public class InvokingLamdaByFunctionInterface2 {

	public static void main(String[] args) {
		Interf2 i=(s)->s.length();
		System.out.println("Length is :"+i.getLength("Mohit"));
		System.out.println("Length is :"+i.getLength("Welcome"));
	}
}

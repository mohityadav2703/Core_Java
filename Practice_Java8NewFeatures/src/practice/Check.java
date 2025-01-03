package practice;

interface Interf{
	public int add(int a,int b);
}

public class Check {
	public static void main(String[] args) {
		Interf i = (a,b)->a+b;
		System.out.println("The sum is :"+i.add(20, 30));
	}
}

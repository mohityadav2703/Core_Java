package test;
import java.util.*;
import java.util.stream.*;
public class DemoStream1 {
	public static void main(String[] args) {
		// Array-object
		Integer a[]= {11,12,13,14,15,16,17,18,19,20};
		//ArrayList Object
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=21;i<=30;i++)
		{
			al.add(new Integer(i));
		}
		System.out.println("======Array-Object======");
		for(Integer k :a)
		{
			System.out.print(k+" ");
		}
		System.out.println("\n\n=====ArrayList-Object=====");
		System.out.println(al.toString());
		
		//stram to Array
		Stream<Integer> sm1=Arrays.stream(a);
		
		//Stream to ArrayList
		Stream<Integer> sm2=al.stream();
		System.out.println("\n======Odd Elements From Array======");
		sm1.filter((e)->e%2!=0).forEach((k)->{
			System.out.print(k+" ");
		});
		System.out.println("\n\n======Even Elements From ArrayList======");
		sm2.filter((e)->e%2==0).forEach((k)->{
			System.out.print(k+" ");
		});
		
		System.out.println("\n\n====Collect odd elements in List====");
		Stream<Integer> sm3=al.stream();
		List<Integer> l=sm3.filter((e)->e%2!=0).collect(Collectors.toList());
		System.out.println(l.toString());
		
		System.out.println("\n=====Sum of Elements=====");
		Stream<Integer> sm4=al.stream();
		System.out.println(sm4.filter((e)->e%1==0).reduce((sum,i)->sum+i));
	}

}

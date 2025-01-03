package maccess;
import java.util.*;
public class DemoList6 {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		for(int i=11;i<=20;i++)
		{
			v.add(new Integer(i));
		}
		System.out.println("*******ListIterator********");
		ListIterator<Integer> ob1=v.listIterator();
		System.out.println("Forward :");
		while(ob1.hasNext())
		{
			System.out.print(ob1.next()+" ");
		}
		System.out.println("\nBackward :");
		while(ob1.hasPrevious())
		{
			System.out.print(ob1.previous()+" ");
		}
		System.out.println("\n********ListIterator<E> Index*******");
		ListIterator<Integer> ob2=v.listIterator(3);
		System.out.println("Forward :");
		while(ob2.hasNext())
		{
			System.out.print(ob2.next()+" ");
		}
		System.out.println("\nBackward :");
		while(ob2.hasPrevious())
		{
			System.out.print(ob2.previous()+" ");
		}
		
	}

}

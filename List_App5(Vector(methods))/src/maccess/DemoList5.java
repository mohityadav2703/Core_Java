package maccess;
import java.util.*;
public class DemoList5 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		System.out.println("default capacity :"+v.capacity());
		System.out.println("Size :"+v.size());
		for(int i=11;i<=11;i++)
		{
			v.addElement(new Integer(i));
		}
		System.out.println(v.toString());
		System.out.println("First Elements :"+v.firstElement());
		System.out.println("Last Elements :"+v.lastElement());
		System.out.println("Elements at index 2"+v.elementAt(2));
		System.out.println("Capacity :"+v.capacity());
		System.out.println("Size :"+v.size());
		for(int i=11;i<=15;i++)
		{
			v.addElement(new Integer(i));
		}
		System.out.println(v.toString());
		System.out.println("Capacity :"+v.capacity());
		System.out.println("Size :"+v.size());
		v.insertElementAt(new Integer(700), 2);
		System.out.println(v.toString());
		System.out.println("Capacity :"+v.capacity());
		System.out.println("Size :"+v.size());
		for(int i=11;i<=15;i++)
		{
			v.addElement(new Integer(i));
		}
		for(int i=11;i<=15;i++)
		{
			v.addElement(new Integer(i));
		}
		System.out.println(v.toString());
		System.out.println("Capacity :"+v.capacity());
		System.out.println("Size :"+v.size());
		System.out.println("======Enumeration<E>=======");
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement()+" ");
		}
		System.out.println("\n=======Iterator<E>-asIterator()========");
		Enumeration<Integer> e2=v.elements();
		Iterator<Integer> it=e2.asIterator();
		it.forEachRemaining((k)->
		{
			System.out.println(k+" ");
		});
		 
	}

}

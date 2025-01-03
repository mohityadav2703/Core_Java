// Some Important methods of DeQueue

package maccess;
import java.util.*;
public class DemoDeque {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		for(int i=11;i<=17;i++)
		{
			ad.add(new Integer(i));
		}
		System.err.println("******After add()******");
		System.out.println(ad.toString());
		
		ad.addFirst(new Integer(8));
		System.err.println("******After addFirst()******");
		System.out.println(ad.toString());
		
		ad.addLast(new Integer(20));
		System.err.println("******After addLast()*******");
		System.out.println(ad.toString());
		
		ad.offer(new Integer(19));
		System.err.println("******After offer()******");
		System.out.println(ad.toString());
		
		ad.offerFirst(new Integer(2));
		System.err.println("******After offerFirst()******");
		System.out.println(ad.toString());
		
		ad.offerLast(new Integer(36));
		System.err.println("******After offerLast()*******");
		System.out.println(ad.toString());
		
		ad.remove();
		System.err.println("******After remove()*******");
		System.out.println(ad.toString());
		
		ad.removeFirst();
		System.err.println("******After removeFirst()*******");
		System.out.println(ad.toString());
		
		ad.removeLast();
		System.err.println("******After removeLast()*******");
		System.out.println(ad.toString());
		
		ad.poll();
		System.err.println("******After poll()*******");
		System.out.println(ad.toString());
		
		ad.pollFirst();
		System.err.println("******After pollFirst()*******");
		System.out.println(ad.toString());
		
		ad.pollLast();
		System.err.println("******After pollLast()*******");
		System.out.println(ad.toString());
		
		ad.getFirst();
		System.err.println("******After getFirst()*******");
		System.out.println(ad.toString());
		
		ad.getLast();
		System.err.println("******After getLast()*******");
		System.out.println(ad.toString());
		
		ad.peek();
		System.err.println("******After peek()*******");
		System.out.println(ad.toString());
		
		ad.peekFirst();
		System.err.println("******After peekFirst()*******");
		System.out.println(ad.toString());
		
		ad.peekLast();
		System.err.println("******After peekLast()*******");
		System.out.println(ad.toString());
		
		for(int i=11;i<=17;i++)
		{
			ad.add(new Integer(i));
		}
		System.err.println("******After add()*******");
		System.out.println(ad.toString());
		
		ad.removeFirstOccurrence(new Integer(16));
		System.err.println("*******removeFirstOccurence(16)********");
		System.out.println(ad.toString());
		
		ad.removeLastOccurrence(new Integer(15));
		System.err.println("******removeLastOccurence(15)*******");
		System.out.println(ad.toString());
		
		System.err.println("*******Iterator()*******");
		Iterator<Integer> it=ad.iterator();
		it.forEachRemaining((k)->
		{
			System.out.print(k.toString()+" ");
		});
		
		System.err.println("\n*******DecendingIterator()********");
		Iterator<Integer> it1=ad.descendingIterator();
		it1.forEachRemaining((k)->
		{
			System.out.print(k.toString()+" ");
		});
	}
}

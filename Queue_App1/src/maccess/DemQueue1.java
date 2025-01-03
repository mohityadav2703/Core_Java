package maccess;
import java.util.*;
public class DemQueue1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=21;i<=25;i++)
		{
			pq.add(new Integer(i));
		}
		System.out.println("******After Add()******");
		System.out.println(pq.toString());
		
		pq.offer(new Integer(26));
		System.out.println("*******After offer()*******");
		System.out.println(pq.toString());
		
		System.out.println("Peek Ele :"+pq.peek());
		
		pq.remove();
		System.out.println("******After Remove()********");
		System.out.println(pq.toString());
		
		pq.poll();
		System.out.println("******After Poll()******");
		System.out.println(pq.toString());
		
		System.out.println("Peek Ele :"+pq.peek());
		
		pq.offer(new Integer(700));
		System.out.println("******After offer()*******");
		System.out.println(pq.toString());
		pq.poll();
		System.out.println("******After Poll()********");
		System.out.println(pq.toString());
		
		System.out.println("Peek Elem :"+pq.peek());
		
		System.out.println("******After element()*******");
		System.out.println("element :"+pq.element());
		System.out.println(pq.toString());
		
		System.out.println("Peek Ele :"+pq.peek());
		

	}

}

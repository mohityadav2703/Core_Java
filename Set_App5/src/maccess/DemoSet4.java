//Some important methods of sets

package maccess;
import java.util.*;
public class DemoSet4 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs1=new LinkedHashSet<Integer>();
		lhs1.add(new Integer(1));
		lhs1.add(new Integer(2));
		lhs1.add(new Integer(3));
		lhs1.add(new Integer(4));
		
		LinkedHashSet<Integer> lhs2=new LinkedHashSet<Integer>();
		lhs2.add(new Integer(11));
		lhs2.add(new Integer(12));
		lhs2.add(new Integer(13));
		lhs2.add(new Integer(14));
									//Immutable object
		Set<Integer>lhs3=Set.of(2,3,4,11);
		System.out.println("==========Data==========");
		System.out.println("lhs1 :"+lhs1.toString());
		System.out.println("lhs2 :"+lhs2.toString());
		System.out.println("lhs3 :"+lhs3.toString());
		
		System.out.println("=========addAll()=========");
		lhs1.addAll(lhs2);
		System.out.println("lhs1 :"+lhs1.toString());
		System.out.println("lhs2 :"+lhs2.toString());
		System.out.println("lhs3 :"+lhs3.toString());
		
		System.out.println("=========Contains(object)===========");
		System.out.println(lhs1.contains(new Integer(13)));
		
		System.out.println("=========ContainsAll()==========");
		System.out.println(lhs1.containsAll(lhs3));
		
		Set<Integer> lhs4 =Set.of(2,12,14,17);
		
		System.out.println("========RetainAll()=========");
		lhs1.retainAll(lhs4);
		System.out.println(lhs1.toString());
		System.out.println(lhs2.toString());
		System.out.println(lhs3.toString());
		System.out.println(lhs4.toString());
		
		System.out.println("=========Size()==========");
		System.out.println(lhs1.size());
		System.out.println(lhs2.size());
		System.out.println(lhs3.size());
		System.out.println(lhs4.size());
		
		System.out.println("=========RemoveAll()==========");
		Set<Integer> lhs5=Set.of(12,14);
		lhs2.removeAll(lhs5);
		System.out.println("lhs1 :"+lhs1.toString());
		System.out.println("lhs2 :"+lhs2.toString());
		System.out.println("lhs3 :"+lhs3.toString());
		System.out.println("lhs4 :"+lhs4.toString());
		System.out.println("lhs5 :"+lhs5.toString());
		
		System.out.println("=========Clear()==========");
		lhs1.clear();
		System.out.println("lhs1 :"+lhs1.toString());
		System.out.println("lhs2 :"+lhs2.toString());
		System.out.println("lhs3 :"+lhs3.toString());
		System.out.println("lhs4 :"+lhs4.toString());
		System.out.println("lhs5 :"+lhs5.toString());
	}

}

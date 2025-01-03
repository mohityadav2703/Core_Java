package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_WorkSpace {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		//add element
		list.add(30);
		list.add(12);
		list.add(21);
		list.add(12);
		list.add(19);
	
		//remove element
		list.remove(2);
		System.out.println(list);
	}
}

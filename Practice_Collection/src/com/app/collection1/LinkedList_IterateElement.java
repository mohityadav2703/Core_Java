package com.app.collection1;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_IterateElement {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("India");
		list.add("Srilanka");
		list.add("Bangladesh");
		list.add("Nepal");
		list.add("Bhutan");
		list.add("Mayanmar");
		
		for(String st : list) {
			System.out.print(st+" ");
		}
	}
}

package com.app.collection1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_MixString {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mohit");
		list.add("Nihit");
		list.add("Chillu");
		list.add("Chandan");
		list.add("Deepak");
		
		System.out.print("Original List :");
		for(String ab : list) {
			System.out.print(ab+" ");
		}
		
		System.out.print("\nAfter Mixing List :");
		Collections.shuffle(list);
		
		list.spliterator().forEachRemaining(k-> System.out.print(k+" "));
	}
}

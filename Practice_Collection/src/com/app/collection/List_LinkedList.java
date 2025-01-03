package com.app.collection;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedList {
	public static void main(String[] args) {
		List<Integer> li=new LinkedList<Integer>();
		for(int i=10;i<=17;i++) {
			li.add(i);
		}
		li.spliterator().forEachRemaining(k-> System.out.print(k+" "));
	}

}

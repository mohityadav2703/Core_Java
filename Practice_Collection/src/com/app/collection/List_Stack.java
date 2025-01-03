package com.app.collection;

import java.util.List;
import java.util.Stack;

public class List_Stack {

	public static void main(String[] args) {
		List<Integer> li=new Stack<Integer>();
		for(int i=10;i<=17;i++) {
			li.add(i);
		}
		li.iterator().forEachRemaining(k-> System.out.print(k+" "));
	}
}

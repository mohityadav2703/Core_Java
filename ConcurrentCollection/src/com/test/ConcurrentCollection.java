//ConcurrentCollection : To work with Collection object in Thread-Safe Environment we use ConcurrentCollection.

package com.test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollection {
	public static void main(String[] args) {
		
		List<String> names = new CopyOnWriteArrayList<>();
		names.add("first");
		names.add("Second");
		names.add("Third");
		names.add("Fourth");
		names.add("Fifth");
		names.add("Sixth");
		names.add("Seventh");
		
		//To display
		Runnable t1 = ()->{
			for(String str : names) {
				System.out.println(str);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		//To update
		Runnable t2 =()->{
			names.add("NEW-ELEMENT");
			names.add("NEW-ELEMENT");
			names.add("NEW-ELEMENT");
		};
		
		new Thread(t2).start();
		new Thread(t1).start();
		
	}
}

package test;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1, 1};
		
		Map<Integer,Integer> hs = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!hs.containsKey(arr[i])) {
				hs.put(arr[i], 1);
			}
			else {
				int cnt=hs.get(arr[i]);
				hs.put(arr[i], cnt+1);
			}
		}
		System.out.print(hs);
		
	}

}

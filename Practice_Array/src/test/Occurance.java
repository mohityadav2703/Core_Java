package test;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1, 1};
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				int cnt=map.get(arr[i]);
				map.put(arr[i], cnt+1);
			}
		}
	System.out.println(map.toString());
		
	}

}

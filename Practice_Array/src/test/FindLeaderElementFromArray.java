// Leader Elements = element which is greater then N/2.
// In this array leader element is :7 

package test;

import java.util.HashMap;
import java.util.Map;

public class FindLeaderElementFromArray {
	public static void main(String[] args) {
		int[] arr= {1,6,6,5,7,4,1,7,7,7,7,7,7,7,2};
		int leader = arr.length/2;  //7
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				int cnt=map.get(arr[i]);
				map.put(arr[i], cnt+1);
			}
		}
		
		
	}
}

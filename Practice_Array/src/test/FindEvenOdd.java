// Print Odd and Even number and sum of both and total number of odd and even

package test;

import java.util.Arrays;

public class FindEvenOdd {

	public static void main(String[] args) {
		int []arr= {8,5,10,12,3,1,4};
		int even=0, odd=0;
		int sumEven=0, sumOdd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
				sumEven=sumEven+arr[i];
			}
			else {
				odd++;
				sumOdd=sumOdd+arr[i];
			}
		}
		int []even1 = new int[even];
		int []odd1 = new int[odd];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even1[i]=arr[i];
				System.out.println("Even :"+arr[i]);
			}
			else {
				System.out.println("Odd :"+arr[i]);
			}
		}
		System.out.println("Total Number of Even are :"+even1.length);
		System.out.println("Total Number of Odd are :"+odd1.length);
		System.out.println("Total Sum of Even is :"+sumEven);
		System.out.println("Total Sum of Odd is :"+sumOdd);
		System.out.println(Arrays.asList(even1));
	}
}

// program to display the pair of 2 element which sum is 7

package test;
import java.util.Scanner;

public class FindPairOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of sum to find pairs of two");
		int sum=sc.nextInt();
		
		int[] arr= {2,6,1,3,4,5};
		
		for(int i=0;i< arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}

}

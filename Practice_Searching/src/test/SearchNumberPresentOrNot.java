// Check the number present or not in given String

package test;
import java.util.Scanner;

public class SearchNumberPresentOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to find :");
		int val=sc.nextInt();
		
		int[] arr= {5,3,6,1,4,2};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				System.out.println("Num is present at :"+i+" Position");
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("Num is not Present ");
		}
	}
}

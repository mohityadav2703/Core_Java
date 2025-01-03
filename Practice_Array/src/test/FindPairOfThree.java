package test;
import java.util.Scanner;

public class FindPairOfThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of sum to find pairs of three");
		int sum = sc.nextInt();
		int[] arr= {4,6,3,5,8,2};
		
		for(int i=0;i< arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
					}
				}
			}
		}
	}
}

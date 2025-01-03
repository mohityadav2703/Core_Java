package test;
import java.util.Scanner;

public class NthLargestNumber {

	public static void main(String[] args) {
		int[] a= {1,3,6,2,4,7,5,8};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the position of largest number :");
		int larg=sc.nextInt();
		System.out.println("Enter the position of smallest number :");
		int small=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Sorted Array :");
		for(int no : a) {
			System.out.print(no+" ");
		}
		System.out.println("\nLargest Number of position "+larg+" is :"+a[larg-1]);
		System.out.println("Smallest Number of position "+small+" is :"+a[a.length-small]);
	}
}

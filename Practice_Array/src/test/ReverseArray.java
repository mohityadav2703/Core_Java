//Write a program to reverse the array

package test;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {1,3,5,2,10,6,7,13};
		
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}

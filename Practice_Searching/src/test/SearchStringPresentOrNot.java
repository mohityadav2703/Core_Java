//Search the Given String is present or not

package test;
import java.util.Scanner;

public class SearchStringPresentOrNot {
	public static void main(String[] args) {
		String[] arr= {"Mohit","Nihit","Deepak","Chandan","Satrudhan","Rajeev"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String you want to search :");
		String str=sc.nextLine();
		
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(str)) {
				System.out.println("Given String is present at Position :"+i);
				temp++;
			}
		}
		if(temp==0) {
			System.out.println("Given String is Not present :");
		}
	}

}

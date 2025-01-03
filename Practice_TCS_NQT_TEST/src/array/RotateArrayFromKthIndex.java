package array;
import java.util.Scanner;
public class RotateArrayFromKthIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,4,5,6,7,8,9};//5 6 7 8 9 1 2 3 4
		System.out.println("Enter Any Integer Value ");
		int k=sc.nextInt();
		int [] res=new int[arr.length];
		int index=0;
		
		for(int i=k;i<arr.length;i++) {
			res[index]=arr[i];
			index++;
		}
		for(int i=0;i<k;i++) {
			res[index]=arr[i];
			index++;
		}
		for(int b : res) {
			System.out.print(b+" ");
		}
	}

}

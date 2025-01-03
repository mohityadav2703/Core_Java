package array;
import java.util.Scanner;

public class AddElementsInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Elements");
		int len=sc.nextInt();
		
		int[] arr= {6,1,2,4,3,7,5,9,8};
		int[] ele=new int[len];
		int[] res=new int[arr.length+ele.length];
		int index=0;
		
		System.out.println("Enter the "+len+" elements");
		for(int i=0;i<ele.length;i++) {
			ele[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			res[index]=arr[i];
			index++;
		}
		for(int i=0;i<ele.length;i++) {
			res[index]=ele[i];
			index++;
		}
		
		for(int ab : res) {
			System.out.print(ab+" ");
		}
		
		sc.close();
	}
}

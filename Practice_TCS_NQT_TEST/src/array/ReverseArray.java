package array;


public class ReverseArray {
	public static void main(String[] args) {
		int[] a = { 12, 6, 2, 1, 9, 8, 4, 7, 5, 13 };
		int[] rev=new int[a.length];
		int index=0;

		for(int i=a.length-1;i>=0;i--) {
			rev[index]=a[i];
			index++;
		}
		for(int ab : rev) {
			System.out.print(ab+" ");
		}
	}
}

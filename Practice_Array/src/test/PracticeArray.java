// reverse half of array and add remaing without reverse

package test;

public class PracticeArray {
	public static void main(String[] args) {
		int[] a= {20,11,14,9,19,23,33,2,7,41};
		int[] a1=new int[a.length];
		int index=0;
		
		for(int i=a.length/2-1;i>=0;i--) {
			a1[index]=a[i];
			index++;
		}
		
		for(int i=index;i<a.length;i++) {
			a1[index]=a[i];
			index++;
		}
		
		for(int ab : a1) {
			System.out.print(ab+", ");
		}
	}
}
package test;

public class MultiplyTwoArrayInReverse {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int[] rev=new int[a.length];
		int index=0;
		for(int i=a.length-1;i>=0;i--) {
			rev[index]=a[i];
			index++;
		}
		
		for(int i=0;i<a.length/2+1;i++) {
			int res=a[i]*rev[i];
			System.out.print(res+" ");
		}
		
    }
}
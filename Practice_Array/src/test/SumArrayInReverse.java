/**
 * input :{4,5,6}
 * output:{11,10,9}
 */


package test;

public class SumArrayInReverse {
	public static void main(String[] args) {
		int []arr= {4,5,6};
		int []res=new int[arr.length];
		int index=0;
		
		for(int i=arr.length-1;i>=0;i--) {
			
			for(int j=i-1;j>=0;j--) {
				res[index]=arr[i]+arr[j];
				index++;
			}
		}
		for(int ab : res) {
			System.out.print(ab+" ");
		}
		
	}

}

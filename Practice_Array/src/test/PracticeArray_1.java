/* Break Array into two parts with equal size, and Reverse the both part of array, and multiply the both array
   ex :{1,2,3,4,5,6,7,8,9,10} => {5,4,3,2,1} And {10,9,8,7,6} =>{5,4,3,2,1,10,9,8,7,6}
   	   					{(1*10),(2*9),(3*8),(4*7),(5*6)} =>final output :{10,18,24,28,30}
*/
package test;

public class PracticeArray_1 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int[] a1=new int[a.length]; 			//10=>		a1={5,4,3,2,1 || 10,9,8,7,6}
		int[] r1=new int[a1.length/2];			//05=>	    r1={5,4,3,2,1}
		int[] r2=new int[a1.length/2];			//05=>		r2={10,9,8,7,6}
		int[] r3=new int[a1.length/2];
		int[] finalArray=new int[a1.length/2];	//05=>		final={10,18,24,28,30}
		
		int index=0, indR1=0, indR2=0, indR3=0, indR4=0;
		
		//r1={5,4,3,2,1}
		for(int i=a.length/2-1;i>=0;i--) {
			a1[index]=a[i];
			r1[indR1]=a[i];
			index++;
			indR1++;
		}
		
		//r2={10,9,8,7,6}
		for(int i=a.length-1;i>=a.length/2;i--) {
			a1[index]=a[i];
			r2[indR2]=a[i];
			index++;
			indR2++;
		}
		
		//r3={6,7,8,9,10}
		for(int i=a.length/2;i<a.length;i++) {
			r3[indR3]=a[i];
			indR3++;
		}
		
		for(int i=finalArray.length-1;i>=0;i--) {
			int n1=0,n2=0;
			n1=r1[i];
			n2=r3[i];
			finalArray[indR4]=n1*n2;
			indR4++;
		}
		System.out.print("Original Array are :");
		for(int k : a) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		System.out.print("r1[] elements are :");
		for(int aa :r1) {
			System.out.print(aa+" ");
		}
		
		System.out.print("\nr2[] elements are :");
		for(int aa: r2) {
			System.out.print(aa+" ");
		}
		
		System.out.print("\nReversed[] array are :");
		for(int aa : a1) {
			System.out.print(aa+" ");
		}
		
		System.out.print("\nFinal[] array are :");
		for(int ab : finalArray) {
			System.out.print(ab+" ");
		}

	}

}

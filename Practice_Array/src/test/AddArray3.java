/* break array into two parts and reverse both array and add both array
 * Ex :{1,2,3,4,5,6,7,8,9,10} => {5,4,3,2,1} and {10,9,8,7,6}
 * 		{5,4,3,2,1,10,9,8,7,6} :{(1+10),(2+9),(3+8),(4+7),(5+6)} =>{11,11,11,11,11} 	
 */
package test;

public class AddArray3 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11};
		int mid=arr.length/2;
		int[] r1=new int[mid];
		int[] r2=new int[mid+1];
		int index=0;
		int index1=0;
		
		for(int i=mid-1;i>=0;i--) {
			r1[index]=arr[i];
			index++;
		}
		
		for(int i=arr.length-1;i>=mid;i--) {
			r2[index1]=arr[i];
			index1++;
		}
		
		int[] result=new int[mid+1];
		for(int i=0;i<=mid;i++) {
			result[i]=r1[i]+r2[mid+1 -i -1];
		}				
		
	
		for(int ab : result) {
			System.out.print(ab+" ");
		}		
	}
}
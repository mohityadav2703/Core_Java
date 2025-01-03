/*Def : Bubblesort is a comparision based sorting algorithm, in this
 * 	comparing each pair of adjecent element and swap them. 
 */

package test;

public class BubbleSortInAscending {
	public static void main(String[] args) {
		int [] a= {12,5,19,18,2,7,9,6};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}

}

/* Def : Selectionsort is the combination of searching and sorting. it 
 * sort an array by repeatedely finding the minimum element and putting 
 * it at the beginning.
 */

package test;

public class SelectionSortAscending {
	public static void main(String[] args) {
		int []a= {38,52,9,18,6,62,13};
		
		int temp,min;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

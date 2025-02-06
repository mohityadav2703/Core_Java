//Find the elements which are greater then with their neighbours

package test;

public class ElementGreaterThanItsNeighbour {

	public static void main(String[] args) {
		int[] a = { 1, 2, 6, 4, 3, 5, 2,7,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[j]>a[i] && a[j]> a[j+1]) {
					System.out.print(a[j]+" ");
				}
				break;
			}
		}
	}
}

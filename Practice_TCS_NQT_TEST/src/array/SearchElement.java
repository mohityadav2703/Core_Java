package array;

public class SearchElement {
	public static void main(String[] args) {
		int[] arr= {7,3,2,1,6,5,9,8,4};
		int k=9;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				System.out.println("Element "+k+" Is Present At Position : " +i);
			}
		}
	}

}

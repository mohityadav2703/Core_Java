package array;

public class RepeatingElementInArray {
	public static void main(String[] args) {
		int[] arr= {1,2,4,1,2,4,6,7,8,6,5};
		int[] res=new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				res[index]=arr[i];
				index++;
			}
		}
		for(int ab :res) {
			System.out.print(ab+" ");
		}
	}

}

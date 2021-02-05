
public class RevArr {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		
		System.out.print("Normal Array: ");		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.print("Reverse Array: ");
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}

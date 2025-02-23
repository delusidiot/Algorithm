package algorithm;

public class Permutaion {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		permutation(arr, 3);
	}
	public static void permutation(int[] arr, int destNum) {
		permutation(arr, 0, destNum);
	}
	public static void permutation(int[] arr, int curNum, int destNum) {
		if(curNum==destNum) {
			for(int i = 0; i < destNum; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for(int i = 0; i+curNum < arr.length; i++) {
			swap(arr, curNum, curNum+i);
			permutation(arr,curNum+1,destNum);
			swap(arr, curNum, curNum+i);			
		}
	}
	public static void swap(int[] arr, int origin, int changer) {
		int temp = arr[origin];
		arr[origin] = arr[changer];
		arr[changer] = temp;
	}
}

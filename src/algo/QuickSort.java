package algo;

public class QuickSort {

	/***
	 * Take the right most value as pivot-p.
	 * take two var i,j.
	 * initially i=-1; j=0;
	 * j will be used to compare with p.
	 * 
	 * if j<p; then i++; swap i,j; j++;
	 * if j>p; then j++;
	 * 
	 * once the loop is completed, then
	 * 1. swap i+1,p; OR
	 * 2. move p to i+1 and shift the array to right.
	 * 
	 * Now, p should be at its correct position in array.
	 *  
	 * Continue this now for the remaining subarrays.
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		MergeSort.printArray(arr);

		sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		MergeSort.printArray(arr);
		
	}
	
	private static int pivot(int[] arr, int l, int r){
		int p = arr[r];
		int i=l-1;
		int j=l;
		for(int x=l;x<r;x++){
			if(p>arr[x]){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}else if(p<arr[x]){
				j++;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = p;
		arr[r] = temp;
		
		return i+1;
	}
	
	private static void sort(int[] arr, int l, int r){
		if(l<r){
			int p = pivot(arr, l,r);
			sort(arr,l,p-1);
			sort(arr,p+1,r);
		}

	}
}

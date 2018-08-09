package algo;

public class MergeSort {

	/***
	 * Keep on dividing the array into half.
	 * Then once all arrays are reduced to size 1, then start merging them in sorted order.
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}

	private static void merge(int[] arr, int l1, int m, int r) {
		// length of both sub arrays
		int n1 = m - l1 + 1;
		int n2 = r - m;

		// create 2 new subarray
		int[] L = new int[n1];
		int[] R = new int[n2];

		// fill values in 2 sub arrays
		for (int i = 0; i < n1; i++) {
			L[i] = arr[i + l1];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = arr[i + m + 1];
		}

		// initialize pointers for both sub arrays
		int i = 0;
		int j = 0;

		// initialize pointer for merged array
		int k = l1;

		// sort and update the values in merged array
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// fill any remaining values from both sub arrays
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	private static void sort(int[] arr, int i, int j) {

		if (i == j)
			return;
		
		int mid = (i + j) / 2;
		sort(arr, i, mid);
		sort(arr, mid + 1, j);
		merge(arr, i, mid, j);

	}

	public static void printArray(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}

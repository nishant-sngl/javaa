package algo;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {12, 11, 13, 5, 6};
		for(int d:arr){
			System.out.print(d + " | ");
		}
		System.out.println();
		insSort(arr);
	}
	
	/***
	 * Outer loop starts from Index=1; then this value is compared to all the values before that index.
	 * Then the test value is placed at the correct position and the remaining array is shifter right. 
	 * 12 | 11 | 13 | 5 | 6 | 
	 * 11 | 12 | 13 | 5 | 6 | 
	 * 11 | 12 | 13 | 5 | 6 | 
	 * 5 | 11 | 12 | 13 | 6 | 
	 * 5 | 6 | 11 | 12 | 13 |
	 * @param a
	 * @return
	 */
	private static int[] insSort(int[] a){
		int len = a.length;
		for(int i = 1;i<len;i++){
			int test = a[i];
			int j = i-1;
			while(j>=0 && test<a[j]){//this while CONDITION sequence also matters
				a[j+1]=a[j];
				j--;
			}
			a[j+1] = test;
			for(int d:a){
				System.out.print(d + " | ");
			}
			System.out.println();
		}
		return a;
	}
}

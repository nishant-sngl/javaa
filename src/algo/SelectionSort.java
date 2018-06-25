package algo;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {64, 25, 12, 22, 11};
		for(int i:arr)
			System.out.print(i + " ");
		System.out.println();
		arr = selSort(arr);
		for(int i:arr)
			System.out.print(i + " ");
	}
	
	/*** In every loop find the smallest int and swap it with the starting index of that loop.
	 * then start the loop from next value.
	 * 64 25 12 22 11 
	   11 | 25 | 12 | 22 | 64 | 
	   11 | 12 | 25 | 22 | 64 | 
	   11 | 12 | 22 | 25 | 64 | 
	   11 | 12 | 22 | 25 | 64 | 
	   11 12 22 25 64 
	 * @param a
	 * @return
	 */
	private static int[] selSort(int[] a){
		int len = a.length;
		for(int i =0;i<len-1;i++){
			int min = a[i];
			int index = i; 
			for(int j = i+1;j<len;j++){
				if(a[j]<min){
					min = a[j];
					index = j;
				}
			}
			int temp = a[index];
			a[index] = a[i];
			a[i] = temp;
			for(int x:a)
				System.out.print(x + " | ");
			System.out.println();
		}
		return a;		
	}
}

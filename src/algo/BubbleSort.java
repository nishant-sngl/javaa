package algo;

public class BubbleSort {

	/***
	 * Keep pushing the largest value to the right most 
	 * 4 | 5 | 1 | 3 | 
4 | 1 | 3 | 5 | 
1 | 3 | 4 | 5 | 
1 | 3 | 4 | 5 | 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {4,5,1,3};
		for(int a1:a)
			System.out.print(a1+" | ");
		System.out.println();
		int len = a.length;
		bubbleSortRecursive(a,len);
	}
	
	/***
	 * time = n2
	 * space = 1
	 * @param a
	 * @return
	 */
	private static int[] bubbleSort1(int[] a){
		int l = a.length;
		for(int i=0;i<l-1;i++){
			for(int j=0;j<l-1;j++){
				if(a[j]>a[j+1]){
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a;
	}
	
	private static int[] bubbleSort(int[] a){
		int l = a.length;
		for(int i=0;i<l-1;i++){
			boolean swaped=true;
			for(int j=0;j<l-1;j++){
				if(a[j]>a[j+1]){
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					swaped = true;
				}
			}
			if(!swaped)
				break;
		}
		
		return a;
	}
	
	/***
	 * time = n2
	 * space = 1
	 * @param a
	 * @return
	 */
	private static void bubbleSortRecursive(int[] a, int l){
		if(l==1)
			return;
		
			for(int j=0;j<l-1;j++){
				if(a[j]>a[j+1]){
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
			for(int a1:a)
				System.out.print(a1 + " | ");
			System.out.println();
		bubbleSortRecursive(a, l-1);
	}
	
}

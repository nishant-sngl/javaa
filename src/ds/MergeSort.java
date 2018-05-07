package ds;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {4,1,3,2,6,7};
		int len = arr.length;
		sort(arr,0,len-1);
	}
	
	static void sort(int arr[],int i,int j){
		int x = (j+i)/2;
		while(i<j){
			sort(arr,i,x);
			sort(arr,x+1,j);
			
			merge(arr,i,x,j);
		}
	}
	
	static void merge(int arr[],int i, int x, int j){
		
	}
	
}

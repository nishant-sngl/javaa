package algo;

import java.util.Arrays;

public class BinarySearch {

	static int x = 7;
	public static void main(String[] args) {
		int[] arr = {1,4,7,3,9,5};
		Arrays.sort(arr);
		System.out.println(arr);
		int len = arr.length;
		int i=0;
		int j=len-1;
		int index = bs1(arr, i, j);
		System.out.println(index);
	}
	
	private static int bs1(int[] arr, int i, int j){
		int mid = i+((j-i)/2);
		if(arr[mid]==x){
			return mid;
		}else if(arr[mid]<x){
			return bs1(arr,mid+1,j);
		}else if(arr[mid]>x)
			return bs1(arr,i,mid-1);
		return mid;
	}

	private static int bs(int[] arr, int i, int j){
		int mid = j+(j-i)/2;
		if(arr[mid]==x){
			return mid;
		}else if(arr[mid]>x){
			j=mid-1;
			return bs(arr,i,j);
		}else if(arr[mid]<x){
			i=mid+1;
			return bs(arr,i,j);
		}
		return mid;
	}
	
	
	
	
	
	
}

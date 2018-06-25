package algo;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
		int x = 30;
		for(int i:arr)
			System.out.print(i);
		System.out.println();
		//System.out.println(lSearch(arr, x));
		System.out.println(bSearch(arr, x,0,arr.length));
	}
	
	private static int lSearch(int[] a,int x){
		for(int i = 0; i<a.length; i++){
			if(a[i]==x)
				return i+1;
		}
		return -1;
	}
	
	private static int bSearch(int[] a,int s,int x,int y){
		Arrays.sort(a);
		for(int i:a)
			System.out.print(i);
		System.out.println();
		int mid = (x+y)/2;
		if(a[mid]==s)
			return mid;
		else if(a[mid]>s)
			return bSearch(a,s,x,mid);
		else if(a[mid]>s)
			return bSearch(a,s,mid+1,y);
		
		return -1;
	}
}

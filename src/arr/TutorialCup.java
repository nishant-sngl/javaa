package arr;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TutorialCup {

	public static void main(String[] args) {
		reqSum();
	}
	
	static void swap(){
		int x=2;int y=3;
		x=x+y;
		y=x-y;
		x=x-y;
	}
	
	/***
	 * Time: O(n)
	 * Space: O(1)
	 */
	static void reverseArr(){
		System.out.println("In reverse array");
		int[] arr = {1,3,4,6,9};
		int x=0;
		int y=arr.length-1;
		do{
			arr[x]=arr[x]+arr[y];
			arr[y]=arr[x]-arr[y];
			arr[x]=arr[x]-arr[y];
			x++;
			y--;
		}while(x<y);
		
		for(int i:arr){
			System.out.println(i);
		}
	}
	
	static void reqSum(){
		System.out.println("finding 2 numbers whose sum equals a specific number");
		int[] arr = {9,3,4,6,1};
		int i = 10;
		Arrays.sort(arr);
		for(int a:arr)
			System.out.println(a);
		
		int x = 0;
		int y = arr.length-1;
		while(x<y){
			if(arr[x]+arr[y]>i)
				y--;
			else if(arr[x]+arr[y]<i)
				x++;
			else if(arr[x]+arr[y]==i){
				System.out.println(arr[x]);
				System.out.println(arr[y]);
				//break; // putting break will stop the while loop when one combination is found
				x++; y--; // commenting break will make sure the while loop goes on and 
			}
				
		}
	}
	
	
}
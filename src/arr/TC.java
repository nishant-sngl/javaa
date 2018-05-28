package arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.InterningXmlVisitor;

import global.Generic;

public class TC extends Generic{

	
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
	
	/***
	 * Find pair of elements from an array whose sum is equal to a given number i.
	 */
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
	
	/***
	 * Find just greater and smaller element than number x from an unsorted array (Floor and Ceil)
	 */
	static void floorCeil(){
		int[] arr = {-1,3,4,6,1000};
		int i = 0;
		int small=Integer.MIN_VALUE; // this will initiate the variable with lowest int value.
		int big=Integer.MAX_VALUE; // this will initiate the variable with highest int value.
		for(int s:arr){
			if(s<i && s>small){
				small = s;
			}else if(s>i && s<big){
				big = s;
			}	
		}
		System.out.println(small);
		System.out.println(big);
	}
	
	/***
	 * Find the sum of contiguous subarray in a one-dimensional array of numbers which has the largest sum
	 */
	static void maxSubArraySum(){
		int[] arr = {-1,3,4,6,100};
		
	}
	
	/***
	 * One number is missing from an array of numbers from 1 to N. Find the missing number.
	 */
	static void missingNumber(){
		int arr[] = {1,2,3,4,5,7};
		int n = 7;
		int sum = n*(n+1)/2;
		int sumArr=0;
		for(int s:arr){
			sumArr+=s;
		}
		System.out.println(sum-sumArr);
	}
	
	/***
	 * One number is missing from an array of numbers from 1 to N. Find the missing number.
	 */
	static void missingNumber1(){
		int arr[] = {1,2,3,4,5,6,8};
		int n = 8;
		int x=0,y=0;
		for(int i=1;i<=n;i++){
			x^=i; //using XOR
		}
		for(int s:arr){
			y^=s;
		}
		System.out.println(x^y);
	}
	
	/***
	 * Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times
	 */
	static void oddRepeat(){
		int arr[] = {1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6,6};
		for(int s:arr){
			int c=0;
			for(int t:arr){
				if(s==t)
					c++;
			}
			if(isOdd(c)){
				System.out.println(s);
				break;
			}
		}
	}
	
	/***
	 * Given an array of positive integers. All numbers occur even number of times except few numbers which occur odd number of times
	 */
	static void oddRepeat1(){
		int arr[] = {1, 1, 1, 1, 2, 2, 3, 3, 4, 4,4, 5, 5, 5, 5, 6, 6, 6, 6,6};
		HashSet<Integer> list = new HashSet<>();
		
		for(int s:arr){
			int c=0;
			for(int t:arr){
				if(s==t)
					c++;
			}
			if(isOdd(c)){
				list.add(s);
			}
		}
		for(int s:list){
			System.out.println(s);
		}
	}
	
	/***
	 * Sort array elements in such a way that the element with the highest number of occurences comes first. If the number of occurences are equal then the print the number which appeared first in the array.
	 */
	static void sortOccurances(){
		int arr[] = {8, 5, 2, 8, 5, 6, 8, 2};
		HashMap<Integer, Integer> hash = new HashMap<>();
		for(int s:arr){
			if(hash.containsKey(s)){
				hash.put(s, hash.get(s)+1);
			}else{
				hash.put(s, 1);
			}
		}
		System.out.println(hash);
		//not complete
	}
	
	/***
	 * Sort array elements in such a way that the element with the highest number of occurrences comes first. If the number of occurences are equal then the print the number which appeared first in the array.
	 * PENDING
	 */
	static void sortOccurances1(){
		int arr[] = {8, 5, 2, 8, 5, 6, 8, 2};
		//Arrays.sort(arr); // array sorted
/*		for(int s:arr)
			System.out.println(s);*/
		Set<Integer> set = new HashSet<>();
		for(int s:arr){
			set.add(s);
		}
		System.out.println(set);
		//set created with unique int
		Iterator it = set.iterator();
		int[][] d2 = new int[set.size()][2];
		int i = 0;
		while(it.hasNext()){
			int val = (int) it.next();
			d2[i][0]= val;
			System.out.println(val);
			d2[i][1]=0;
		}
		//array created with the mapping of each int  frequency
		
		
		/*for(int s:arr){
			int i = isPresentInArray(d2,s);
			if(i>0){
				d2[i][1]+=1;
			}else if(i==-1){
				ds[][]
			}
		}
		
		System.out.println(hash);*/
	}
	    
	    
	static int isPresentInArray(int[][] arr, int n){
		if(arr==null)
			return -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i][0]==n)
				return i;
		}
		return -1;
		
	}
	
	/***
	 * Find two smallest numbers from an array
	 */
	static void firstN2ndSmallest(){
		int[] arr = {7, 6, 8, 10, 11, 5, 13, -1};
		int first = 0;
		int second = 0;
		if(arr[0]<arr[1]){
			first = arr[0];
			second = arr[1];
		}
		else{
			first = arr[1];
			second = arr[0];
		}
		
		for(int i=2;i<arr.length;i++){
			if(arr[i]<second){
				if(arr[i]<first){
					second = first;
					first=arr[i];
				}
				else if(arr[i]> first)
					second=arr[i];
			}
		}
		System.out.println(first);
		System.out.println(second);
	}
	
	/***
	 * Given a sorted array, we need to find if a given x is a majority element.
	 * Majority element: Number occurring more than half the size of the array. 
	 */
	static void majority(){
		int arr[] = {1, 2, 2, 2,3,2};
		int len = arr.length;
		System.out.println("len: " + len);
		Arrays.sort(arr);
		int mid=Integer.MAX_VALUE;
		if(isOdd(len)){
			System.out.println("odd");
			mid = arr[(len+1)/2];
			System.out.println(mid);
		}else{
			System.out.println("even");
			mid = arr[len/2];
			System.out.println(mid);
		}
		int count =0;
		for(int s:arr){
			if(true){
				if(s==mid){
					count++;
				}
			}
		}
		System.out.println("count " + count);
		if(count>len/2){
			System.out.println("true");
		}else
			System.out.println("false");
	}
	
	/***
	 * Given a sorted array, we need to find if a given x is a majority element.
	 * Majority element: Number occurring more than half the size of the array. 
	 * PENDING - without sorting
	 */
	static void majority1(){
		int arr[] = {1, 2, 2, 2,3,2};
		int len = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int x:arr){
			if(map.get(x)==null)
				map.put(x, 1);
			else
				map.put(x, map.get(x)+1);
		}
		//Iterator it = map.i
		for(HashMap.Entry m:map.entrySet())	{
			System.out.println(m.getValue());
		}
		int maxIndex = 0;
		int maxValue = 0;
	}
	
	/***
	 * Maximum difference between two elements in the array such that larger element occurs after the smaller one.
	 * Done by SORTING
	 */
	static void diff(){
		int[] arr = { 4,  7,  2,  18,  3,  6,  8,  11,  21};
		Arrays.sort(arr);
		for(int a:arr){
			System.out.println(a);
		}
		System.out.println(arr[arr.length-1] - arr[0]);
	}
	
	/***
	 * Maximum difference between two elements in the array such that larger element occurs after the smaller one.
	 * Done without SORTING
	 * Loop From the last of the array as we will have to check the larger number occurs later.
	 * Run another loop from start and do:
	 * If the present element is smaller than the number present at the index of the outer loop, then check if its difference is larger than the present difference.If yes then update the max_difference.
	 * Else increment the loop counter and check for the next difference.
	 */
	static void diff1(){
		int[] arr = { 4,  7,  2,  18,  3,  6,  8,  11,  0};
		int large = arr[1]-arr[0];
		int len = arr.length;
		for(int i=0;i<len;i++){
			for(int j = i+1;j<len;j++){
				int diff = arr[j] - arr[i];
				if(diff>large)
					large = diff;
			}
		}
		System.out.println(large);
	}
		
	/***
	 * Arrange Even numbers in First Half and Odd numbers in Second Half
	 * Segregate even and odd number such that even numbers occur first and then odd numbers * 
	 */
	static void evenOdd(){
		int[] arr = {7,  2,  4,  9,  10,  11,  13,  27};
		int x = 0;
		int y = arr.length-1;
		while(x<y){
			System.out.println("inside while");
			if(arr[x]%2==1 && !(arr[y]%2==1)){
				System.out.println("in odd even");
				//swap(arr[x], arr[y]);
				arr[x]=arr[x]+arr[y];
				arr[y]=arr[x]-arr[y];
				arr[x]=arr[x]-arr[y];
				x++; y--;
			}else if(arr[x]%2==1 && arr[y]%2==1){
				System.out.println("in odd odd");
				while(arr[y]%2==1 && x<y){
					y--;
				}
				//swap(arr[x], arr[y]);
				arr[x]=arr[x]+arr[y];
				arr[y]=arr[x]-arr[y];
				arr[x]=arr[x]-arr[y];
				y--;
				x++;
			}else if(!(arr[x]%2==1) && !(arr[y]%2==1)){
				System.out.println("in even even");
				while(!(arr[x]%2==1) && x<y){
					x++;
				}
				//swap(arr[x], arr[y]);
				arr[x]=arr[x]+arr[y];
				arr[y]=arr[x]-arr[y];
				arr[x]=arr[x]-arr[y];
				x++;
				y--;
			}else{
				x++;
				y--;
			}
		}
		for(int a:arr){
			System.out.println(a);
		}
	}

	/***
	 * Given a sorted array and a number and you have to find the pair of elements whose sum is closest/near to a given number
	 * PENDING
	 */
	public static void largestSum2Num(){
		int[] a = { 4, 16, 28, 37, 42, 56, 63, 89, 124, 245};
		int b = 101;
		int l=a.length;
		for(int i=0;i<l;i++){
			
		}
	}
	
	/***
	 * Print all distinct elements of the array
	 * Using list
	 * @param argslargestSum2Num
	 */
	static void distinct(){
		int[] arr= {2,1,1,1,2,2,3,3,3,4,1};
		LinkedList<Integer> list = new LinkedList<>();
		for(int a:arr){
			if(!(list.contains(a))){
				list.add(a);
			}
		}
		System.out.println(list);
	}
	
	/***
	 * Print all distinct elements of the array
	 * Using Set
	 * @param argslargestSum2Num
	 */
	static void distinct1(){
		int[] arr= {2,1,1,1,2,2,3,3,3,4,1};
		Set set = new HashSet<>();
		for(int a:arr){
			set.add(a);
		}
		System.out.println(set);
	}
	
	/***
	 * Print all distinct elements of the array
	 * Using inner loop
	 * @param argslargestSum2Num
	 */
	static void distinct2(){
		int[] arr= {2,1,1,1,2,2,3,3,3,4,1};
		int l = arr.length;
		System.out.println(arr[0]);
		for(int i = 1; i<l; i++){
			int count =0;
			for(int j = 0;j<i;j++){
				if(arr[j]==arr[i]){
					count++;
				}
			}
			if(count==0)
				System.out.println(arr[i]);
		}
	}
	
	/***
	 * Print all distinct elements of the array
	 * Using hash map
	 * @param argslargestSum2Num
	 */
	static void distinct3(){
		int[] arr= {2,1,1,1,2,2,3,3,3,4,1};
		int l = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int a:arr){
			if(map.containsKey(a))
				map.put(a, map.get(a)+1);
			else
				map.put(a, 1);
		}
		Set set = map.keySet();
		System.out.println(set);
	}
		
	/***
	 * There can be multiple repeating numbers in an array 
	 * but you have to find the first occurence of number which 
	 * is repeating (occuring second time)
	 * @param args
	 */
	public static void firstRepeat(){
		int[] arr = { 5, 4, 2, 8, 9, 7, 12, 5, 6, 12, 0, 7};
		int l = arr.length;
		int count = 0;
		for(int i=0;i<l;i++){
			for(int j=i+1;j<l;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
					count++;
					break;
				}
			}
			if(count>0){
				break;
			}
		}
	}
	
	/***
	 * There can be multiple repeating numbers in an array 
	 * but you have to find the first occurence of number which 
	 * is repeating (occuring second time)
	 * @param args
	 */
	public static void firstRepeat1(){
		int[] arr = { 5, 4, 2, 8, 9, 7, 12, 5, 6, 12, 0, 7};
		int l = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int a:arr){
			if(!(map.containsKey(a))){
				map.put(a, 1);
			}else {
				System.out.println(a);
				break;
			}	
		}
	}
	
	/***
	 * We have three sorted arrays and you have to find common numbers which is present in all three arrays
	 * @param args
	 */
	static void commonNumbersIn3Arrays(){
		int a[] = {1, 5, 10, 20, 40, 80};
		int x = a.length;
		int b[] = {6, 7, 20, 80, 100};
		int y = b.length;
		int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
		int z = c.length;
		
		int i,j,k=0;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int a1:a){
			if(map.containsKey(a1)){
				map.put(a1, map.get(a1)+1);
			}else
				map.put(a1, 1);
		}
		for(int b1:b){
			if(map.containsKey(b1)){
				map.put(b1, map.get(b1)+1);
			}else
				map.put(b1, 1);
		}
		for(int c1:c){
			if(map.containsKey(c1)){
				map.put(c1, map.get(c1)+1);
			}else
				map.put(c1, 1);
		}
		System.out.println("map is:" + map);
		
		for(HashMap.Entry m:map.entrySet()){
			if((int)m.getValue()==3){
				System.out.println(m.getKey());
			}
		}
	}
	
	/***
	 * We have three sorted arrays and you have to find common numbers which is present in all three arrays
	 * Pending - with loop
	 * @param args
	 */
	static void commonNumbersIn3Arrays1(){
		int a[] = {1, 5, 10, 20, 40, 80};
		int x = a.length;
		int b[] = {6, 7, 20, 80, 100};
		int y = b.length;
		int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
		int z = c.length;
		
		int i,j,k=0;
		
		if(a[x]==b[y] && b[y]==c[z]){
			x++;y++;z++;
		}else{
			
		}	
	}
	
	/***
	 * Find the smallest missing number in N sized sorted array
	 * having unique elements in the range of 0 to M-1, where M>N
	 * @param args
	 */
	static void smallestMissing(){
		int[] arr = {0,1,2,3,4,5,7,8,9};
		int l = arr.length;
		int x = 0,i = 0;
		while(i<l){
			if(arr[x]==i){
				i++;
				x++;
			}else{
				while(i!=arr[x]){
					System.out.println(i);
					return;
				}
			}
		}
	}
	
	/***
	 * In the given array, you need to find maximum sum of elements such that no two are adjacent (consecutive).
	 * You can not add immediate neighbour numbers. 
	 * Pending - yet to be done...have to understand logic
	 * @param args
	 */
	static void alternateMaxSum(){
		int[] arr ={4,10,8,-5,6,9,-2};
		int l = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<l;i++){
			int sum=0;
			for(int j=i;j<l;j+=2){
				sum=sum+arr[j];
			}
			System.out.println("1st sum: " + sum);
			if(sum>max)
				max=sum;
		}
		System.out.println(max);
	}
	
	/***
	 * In the given sorted array,
	 * find the number of times X is coming. (X is integer)
	 * @param args
	 */
	static void occurenceX(){
		int[] arr = {1,2,2,2,2,3,3,3,4,4,4,5,5};
		int l = arr.length;
		int x = 5;
		int c=0;
		for(int a:arr){
			if(a==x)
				c++;
		}
		System.out.println(c);
	}
	
	/***
	 * In the given sorted array,
	 * find the number of times X is coming. (X is integer)
	 * DONE BY:- without looping complete array.
	 * @param args
	 */
	static void occurenceX1(){
		int[] arr = {1,2,2,2,2,3,3,3,4,4,4,5,5};
		int l = arr.length;
		int x = 2;
		int a=0,b=l-1;
		while(arr[a]!=x){
			a++;
		}
		while(arr[b]!=x){
			b--;
		}
		System.out.println(b-a+1);
	}
	
	/***
	 * Rotate the given image by 90 degrees
	 * Image : An image can be represented as a 2D matrix which can be stored in a buffer.
	 * So, the matrix contains it's base address.
	 */
	static void rotateImage(){
		//Basic idea: In rotated_image [i] [m-j-1] = given_image [j] [i] for all i, j
		int arr1[][] = new int[3][4];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[0][3] = 4;	 
		arr1[1][0] = 5;
		arr1[1][1] = 6;
		arr1[1][2] = 7;
		arr1[1][3] = 8;	 
		arr1[2][0] = 9;
		arr1[2][1] = 10;
		arr1[2][2] = 11;
		arr1[2][3] = 12;
		
		int arr2[][] = new int[4][3];
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				arr2[1][j] = arr1[j][i];
			}
		}
		
		for(int[] a:arr1)
			for(int a1:a)
				System.out.println(a1);
		
		for(int[] a:arr2)
			for(int a1:a)
				System.out.println(a1);
	}
	
	
	/***
	 * In the given unsorted array, which may also contain duplicates, 
	 * find the minimum distance between 2 different numbers in the given array.
	 * @param args
	 */
	static void minDist(){
		int a= 8;
		int b= 7;
		int[] arr = {4,7,5,6,5,3,6,8,5};
		int l = arr.length;
		int min = Integer.MAX_VALUE;
		int x = 0;
		for(int i=0;i<l;i++){
			if(arr[i]==b){
				x=a;
			}else if(arr[i]==a){
				x=b;
			}
			
			if(arr[i] == a || arr[i] == b)
			for(int j=i+1;j<l;j++){
				if(arr[j]==x){
					int temp = j-i; 
					if(min>temp)
						min = temp;
				}
			}
		}
		System.out.println(min);
	}
	
	/***
	 * Find all pair of elements in the given array with given difference. 
	 * (array without duplicates).
	 * @param args
	 */
	static void pairDiff(){
		int[] arr = {90, 70, 20, 80, 50, 25, 35, 15, 100, 150};
		
	}
	
	public static void main(String[] args) {
		minDist();
	}
}
package str;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Str {

	/***
	 * In the given string find the maximum occurring character
	 * Using HashMap
	 * 
	 */
	static void charOccur(){
		String s = "aacbcc";
		char[] c = s.toCharArray();
		char maxChar = 0;
		int maxCount = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch:c){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
				for(HashMap.Entry m:map.entrySet()){
					if((int)m.getValue()>maxCount){
						maxCount = (int)m.getValue();
						maxChar = (char)m.getKey();
					}
				}
				
			}else{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		if(maxCount==0){
			System.out.println("there are not dup");
		}else{
			System.out.println("max count: "+ maxCount);
			System.out.println("max char: "+ maxChar);
		}
	}
	
	/***
	 * 
	 * @param args
	 */
	static void concat2Str(){
		String s1="abc";String s2="def";
		String a = "";
		for(char c1:s1.toCharArray()){
			a+=c1;
		}
		for(char c2:s2.toCharArray()){
			a+=c2;
		}
		System.out.println(a);
	}
	
	/***
	 * Remove duplicates from a string
	 * Done by SET.
	 * @param args
	 */
	static void unique(){
		String str = "tutorialcup";
		char[] c = str.toCharArray();
		Set set = new HashSet<>();
		for(char ch:c){
			set.add(ch);
		}
		System.out.println(set);
	}
	
	/***
	 * Remove duplicates from a string
	 * Done by ASCII array.
	 * @param args
	 */
	static void unique1(){
		String str = "tutorialcup";
		char[] ch = str.toCharArray();
		int[] arr = new int[256];
		for(char c:ch){
			int ascii = (int)c;
			arr[ascii]++;
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				System.out.println((char)i);
			}
		}
	}
	
	/***
	 * Check whether the given string is palindrome or not.
	 * @param args
	 */
	static void palindrome1(){
		String s= "madam";
		char[] ch = s.toCharArray();
		int l = s.length();
		int a=0; int b=l-1;
		while(a<b){
			if(ch[a]==ch[b]){
				a++;b--;
			}else{
				System.out.println("not palindrome");
				return;
			}
		}
		System.out.println("Palindrome");
	}
	
	/***
	 * 
	 * @param args
	 */
	static void sort1(){
		String s[] = {"Abhishek", "Zeroess","Hello","Amit","Bananan","Problem","Ankush","Ahmed"};
		Arrays.sort(s);
		for(String str:s)
			System.out.println(str);
	}
	
	/***
	 * 
	 * @param args
	 */
	static void rev(){
		String s="basket";
		int l = s.length();
		char[] ch = s.toCharArray();
		int n = 0;
		while(n<l){
			reverse(n);
			System.out.println(ch[n]);
		}
	}
	static void reverse(int n){
		n++;
	}
	
	public static void main(String[] args) {
		rev();
		
	}
}

package String1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Str1 {

public static void main(String[] args) throws Exception {
        
	System.out.println(power(3,4));
        
	}

	static long power(int n, int p) throws Exception{
    if(n<0 || p<0){
        throw new Exception("java.lang.Exception: n or p should not be negative");
    }else if(n==0 && p==0){
        throw new Exception("java.lang.Exception: n and p should not be zero");
    }else{
        return (long) Math.pow(n, p);
    }
}
	static void token(){
		Scanner in = new Scanner(System.in);
		String n = in .nextLine();
		n = n.replaceAll("\\W"," ");
		String[] n1 = n.split(" ");
		System.out.println(n1.length-1);
		for(String s:n1){
			if(s.equals("")){}
			else System.out.println(s.trim());
		}
			
		   
	}
	
	static void convert(){
		 Scanner in = new Scanner(System.in);
		   int n = in .nextInt();
		   in.close();
		   String s = String.valueOf(n);
		   System.out.println(s);
	}
	static void series(){
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp = a+((2^0)*b);// 0+(1*2)
            System.out.println(temp);
            for(int j=1;j<n;j++){
            	System.out.print(temp);
            	temp = temp + ((2^j)*b);
            	System.out.print(" ");
            }
            System.out.println();
        }
        
        in.close();
        
	}
	static void table(){
		 Scanner in = new Scanner(System.in);
	     int N = in.nextInt();
	     for(int i=1;i<=10;i++){
	    	 System.out.println(N +" X " + i + " = " + N*i);
	     }
	}
static void tokans(){
	/*Scanner sc=new Scanner(System.in);
    String A=sc.next();*/
	String A = "Nishant.singhal shamli 123 ds1d 34 blr";
	//String A = "Nishant.singhalshamli123ds1d34blr";
    //String[] str = A.split("\\.\\d\\s");
	System.out.println(A.replaceAll("\\D", ""));
	/*System.out.println(A);
    for(String s:str)
    	System.out.println(s);*/
}
	
static void anagram(){
	Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();
    char[] c = A.toCharArray();
    //System.out.println(c);
    int l = A.length();
    String status = "yes";
    //HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
    for(int i=0;i<l;i++){
    	if(map.containsKey(Character.toLowerCase(c[i]))){
    		map.put(Character.toLowerCase(c[i]), map.get(Character.toLowerCase(c[i]))+1);
    	}else{
    		map.put(Character.toLowerCase(c[i]), 1);
    	}
    }
    //System.out.println(map);
    
    char[] d = B.toCharArray();
    //System.out.println(c);
    int j = B.length();
    //HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    TreeMap<Character, Integer> map1 = new TreeMap<Character, Integer>();
    for(int i=0;i<j;i++){
    	if(map1.containsKey(Character.toLowerCase(d[i]))){
    		map1.put(Character.toLowerCase(d[i]), map1.get(Character.toLowerCase(d[i]))+1);
    	}else{
    		map1.put(Character.toLowerCase(d[i]), 1);
    	}
    }
    //System.out.println(map1);
    
    //System.out.println(map.equals(map1));
    if(map.equals(map1)) System.out.println("Anagrams");
    else System.out.println("Not Anagrams");
}
	void tc1(){
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length()+B.length();
        System.out.println(sum);
        if(A.compareTo(B)<0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        //System.out.println(Character.toUpperCase(A.charAt(0)) + Character.toUpperCase(B.charAt(0)));
        System.out.println(Character.toUpperCase(A.charAt(0))+A.substring(1) + " " + Character.toUpperCase(B.charAt(0))+B.substring(1));
        
	}
	
	static void tc2(){
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String str = S.substring(start, end);
        System.out.println(str);
	}
	
	static void tc3(){
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        //scan.close();
        List<String> arr = new ArrayList<>();
        for(int i=0;i<=s.length()-k;i++){
        	arr.add(s.substring(i, i+k));
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(0) + " " + arr.get(arr.size()-1));
	}
	
	static void palindrome(){
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] c = A.toCharArray();
        //System.out.println(c);
        int l = A.length();
        String status = "yes";
        for(int i=0;i<l;i++){
        	l--;
        	if(i<l){
            	if(c[i]!=c[l]){
            		status="no";
            		break;
            	}
        	}

        }
        System.out.println(status);
	}
}

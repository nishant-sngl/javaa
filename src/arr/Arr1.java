package arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Arr1 {
	public static void main(String[] args) {
		bal2();
	}
	
	
	static void bal2(){
/*		HashMap<String, String> map = new HashMap<String, String>();
		map.put("}", "{");
		map.put(")", "(");
		map.put("]", "[");*/
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("}");
		list1.add(")");
		list1.add("]");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("{");
		list2.add("(");
		list2.add("[");
		
	      Scanner sc = new Scanner(System.in);
	      while (sc.hasNext()) {
	         String input=sc.next();
	         String[] ch = input.split("");
	         System.out.println(ch.length);
	         ArrayList<String> list = new ArrayList<String>();
	         for(String s:ch)
	        	 list.add(s);
	         int i=0;
	         try{
	         while(true){
	        		 System.out.println("i "+i);//2
	        		 if(list1.contains(list.get(i))){ //}
	        			 int index = list1.indexOf(list.get(i));
	        			 System.out.println("in 1st if" + list.get(i));
	        			 if(list2.get(index).equals(list.get(i-1))){
	        				 System.out.println(list.get(i));
	        				 System.out.println(list.get(i-1));
	        				 list.remove(i);
	        				 list.remove(i-1);
	        				 if(list.size()!=0){
	        					 System.out.println("list exists");
	        					 i=i-2;
	        				 }
	        				 else{
	        					 System.out.println("true");
	        					 break;
	        				 }
	        			 }
	        		 }
	        		 i++;
	         }
	         }catch(IndexOutOfBoundsException e){
	        	 System.out.println("false");
	         }
	      }
	}
	static void bal1(){
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("}", "{");
		map.put(")", "(");
		map.put("]", "[");
	      Scanner sc = new Scanner(System.in);
	      while (sc.hasNext()) {
	         String input=sc.next();
	         String[] ch = input.split("");
	         System.out.println(ch.length);
	         ArrayList<String> list = new ArrayList<String>();
	         for(String s:ch)
	        	 list.add(s);
	         int i=0;
	         try{
	         while(true){
	        		 System.out.println("i "+i);//2
	        		 if(map.containsKey(list.get(i))){ //}
	        			 System.out.println("in 1st if" + list.get(i));
	        			 if(map.get(list.get(i)).equals(list.get(i-1))){
	        				 System.out.println(list.get(i));
	        				 System.out.println(list.get(i-1));
	        				 list.remove(i);
	        				 list.remove(i-1);
	        				 if(list.size()!=0)
	        					 i=i-2;
	        				 else{
	        					 System.out.println("true");
	        					 break;
	        				 }
	        			 }
	        		 }
	        		 i++;
	         }
	         }catch(IndexOutOfBoundsException e){
	        	 System.out.println("false");
	         }
	      }
	}
	
	static void phone(){
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i=0;i<n;i++){
			map.put(scan.next(), scan.next());
		}
		String name = "";
		ArrayList<String> str = new ArrayList<String>();
		do{
			name = scan.next();
			str.add(name);
		}while(scan.hasNext());
		System.out.println(str);
		for(int i=0;i<str.size();i++){
			String ph = map.get(str.get(i));
			System.out.println(ph);
			if(ph==null){
				System.out.println("Not found");
			}else{
				System.out.println(str.get(i)+" "+ph);
			}
		}
	}
	
	static void lists2(){
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			arr.add(scan.nextInt());
		int condCount = scan.nextInt();
		for(int i=0;i<condCount;i++){
			String cond = scan.next();
			if(cond.equals("Insert")){
				int x = scan.nextInt();
				int y = scan.nextInt();
				arr.add(x, y);
			}else if(cond.equals("Delete")){
				int z = scan.nextInt();
				arr.remove(z);
			}
		}
		for(int u:arr){
			System.out.print(u);
			System.out.print(" ");
		}
	}
	
	static void arrayGame(){
		Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
	}
	static boolean canWin(int leap, int[] game){
		boolean status = false;
		int n = game.length;
		int i=0;
		do{
			status = false;
			if(game[i+1]==0){
				i=i+1;
				status=true;
			}else if(game[i+leap]==0){
				i=i+leap;
				status=true;
			}else if(i==n-1 || i+leap>=n){
				return true;
			}else return false;
		}while(!(i==n-1) || !(i+leap>=n));
		return status;
	}
	
	static void list1(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++){
			int d = scan.nextInt();
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			for(int j=0;j<d;j++){
				list2.add(scan.nextInt());
			}
			list1.add(list2);
		}
		System.out.println(list1);
		
		int n1 = scan.nextInt();
		//HashMap<Integer, Integer> cond = new HashMap<Integer, Integer>();
		ArrayList<ArrayList<Integer>> cond1 = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n1;i++){
			ArrayList<Integer> cond2 = new ArrayList<Integer>();
			for(int j=0;j<2;j++){
				cond2.add(scan.nextInt());
			}
			cond1.add(cond2);
		}
		System.out.println(cond1);

		
		for(int i=0;i<cond1.size();i++){
			//System.out.println("in last for");
			ArrayList<Integer> getCond = cond1.get(i);
			System.out.println(getCond);
			try{
				ArrayList<Integer> getList = list1.get(getCond.get(0)-1);
				//System.out.println(getList);
				System.out.println(getList.get(getCond.get(1)-1));
			}catch(IndexOutOfBoundsException e){
				System.out.println("ERROR!");
			}
		}
	}
	
	static void subArr(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
        	arr[i] = in.nextInt();
        }
        int neg=0;
        for(int i=0;i<n;i++){
        	for(int j=i;j<n;j++){
        		int sum=0;
        		for(int k=i;k<=j;k++){
        			sum+=arr[k];
        		}
        		if(sum<0) neg++; 
        	}
        }
        System.out.println(neg);
	}
	
	static void hourGlass(){
		//Scanner in = new Scanner(System.in);
        //int arr[][] = new int[6][6];
        int arr[][] = {{1,1,1,1,1,1},{0,0,0,1,1,2},{8,0,0,1,1,2},{0,0,0,1,6,2},{0,0,0,1,1,3},{0,0,0,1,1,2}};
        //arr[1]={1,1,2,0,0,0};
        
        /*for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
            //in.nextLine();
        }*/
		
        int k=-1000;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                int sum = (arr[i][j] + arr[i][j+1] + arr[i][j+2]) + (arr[i+1][j+1]) + (arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
                if(k<sum) k=sum;
            }
        }
        System.out.println(k);
	}
	
	static void a1(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			int val = scan.nextInt();
			a[i]=val;
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}
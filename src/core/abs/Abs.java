package core.abs;

import java.util.Arrays;

public class Abs {

/*	public static void main(String[] args) {
		Abs1 obj = new Abs3();
		obj.a1();
		obj.a2();
		obj.a3();
		obj.a4();
		obj.a5();
	}*/
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,1,5,1,1};
		System.out.println(max(a));
	}
	
	public static int max(int[] a){
		Arrays.sort(a);
		int max = 0;
		int t=0;
		int n=a.length;
		for(int i=0;i<n-1;i++){
			if(a[i]==a[i+1]){
				t++;
			}else{
				if(t>max)
					max=t;
				t=0;
			}

		}
		return max+1;
	}
}

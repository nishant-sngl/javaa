package core.recursion;

public class Factorial {

	public static void main(String[] args) {
		
		int x = 5;
		long[] memo = new long[x+1];
		for(long i:memo)
			i=0;
		System.out.println(fact(x,memo));
		
	}
	
	public static long fact(int n){
		if(n<=1){
			return 1;
		}else{
			return n * fact(n-1);
		}
	}
	
	public static long fact(int n, long[] memo){
		long result;
		if(n<=1){
			result = 1;
		}else if(memo[n]!=0){
			return memo[n];
		}else{
			result = n * fact(n-1);
			memo[n] = result;
		}
		return result;
	}
	
}

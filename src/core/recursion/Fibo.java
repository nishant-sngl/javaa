package core.recursion;

public class Fibo {

	
	public static void main(String[] args) {
		int x = 4;
		int[] memo = new int[x+1];
		for(int i:memo)
			i=-1;
		System.out.println(fiboMemo(x,memo));
	}
	
	private static int fibo(int x) {
		// TODO Auto-generated constructor stub
		if(x<=1){
			return x;
		}else{
			return fibo(x-1)+fibo(x-2);
		}
	}
	
	private static int fibo(int x, int[] memo) {
		// TODO Auto-generated constructor stub
		int result;
		if(x<=1){
			result = x;
		}else if(memo[x]!=0){
			return memo[x];
		}else{
			result = fibo(x-1,memo)+fibo(x-2,memo);
			memo[x] = result;
		}
		return result;
	}
	
	private static int fiboMemo(int x, int[] memo) {
		// TODO Auto-generated constructor stub
		if(memo[x]==-1){
			if(x<=1){
				memo[x] = x;
			}else{
				memo[x] = fiboMemo(x-1,memo)+fiboMemo(x-2,memo);
			}
		}
		return memo[x];
	}
}

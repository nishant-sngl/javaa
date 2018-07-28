package core.recursion;

public class Factorial {

	public static void main(String[] args) {
		
		int x = 18;
		System.out.println(fact(x));
		
	}
	
	public static long fact(int n){
		if(n<=1){
			return 1;
		}else{
			return n * fact(n-1);
		}
	}
	
}

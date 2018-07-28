package core.recursion;

public class Fibo {

	
	public static void main(String[] args) {
		int x = 10;
		System.out.println(fibo(x));
	}
	
	private static int fibo(int x) {
		// TODO Auto-generated constructor stub
		if(x<=1){
			return x;
		}else{
			return fibo(x-1)+fibo(x-2);
		}
	}
}

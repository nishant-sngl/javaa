package core.recursion;

public class GCD {

	public static void main(String[] args) {
		int x=131;
		int y=22;
		int big,small;
		if(x>y){
			big=x;
			small=y;
		}else{
			big=y;
			small=x;
		}
		System.out.println(getGcd(big, small));
	}
	
	public static int getGcd(int x, int y){
		int q = x/y;
		int rem = x%y;
		if(rem==0){
			return y;
		}else{
			return getGcd(y,rem);
		}
		
	}
}

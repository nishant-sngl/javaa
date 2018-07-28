package core.recursion;

public class Bunny {

	public static void main(String[] args) {
		
		int x=3;
		System.out.println(bunny2(x));
	}
	
	private static int bunny1(int x){
		if(x==0){
			return 0;
		}else{
			
			return 2+bunny1(x-1);
		}
	}
	
	private static int bunny2(int x){
		if(x==0){
			return 0;
		}else{
			if(x%2==0){
				return 3+bunny2(x-1);
			}else{
				return 2+bunny2(x-1);
			}
		}
	}
}

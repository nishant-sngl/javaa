package core.recursion;

public class OtherRec {

	public static void main(String[] args) {
		long x = 818;
		System.out.println(countx("xxixx"));
	}
	
	
	private static long sumDigits(long n){
		if(n<10){
			return n;
		}else{
			return (n%10) + sumDigits(n/10);
		}
	}
	

	private static long count7(long n){
		if(n<10){
			if(n==7){
				return 1;
			}else{
				return 0;
			}
		}else{
			if(n%10==7){
				return 1+count7(n/10);
			}else{
				return 0+count7(n/10);
			}
		}
	}
	
	private static long count8(long n){
		if(n<10){
			if(n==8){
				return 1;
			}else{
				return 0;
			} 
		}else{
			if(n%10==8){ 
				if((n/10)%10==8){
					return 2+count8(n/10);
				}else{
					return 1+count8(n/10);
				}
			}else{
				return 0+count8(n/10);
			}
		}
	}
	
	private static int pow(int n, int c){
		if(c==1){
			return n;
		}else{
			return n*pow(n, c-1);
		}
	}

	private static int countx(String s, int i){
		if(i==s.length()-1){
			if(s.charAt(i)=='x'){
				return 1;
			}else{
				return 0;
			}
		}else{
			if(s.charAt(i)=='x'){
				return 1+countx(s,i+1);
			}else{
				return 0+countx(s,i+1);
			}
		}
	}
	
	private static int countx(String s){
		if(s.length()==0){
				return 0;
		}else{
			if(s.charAt(0)=='x'){
				return 1+countx(s.substring(1));
			}else{
				return 0+countx(s.substring(1));
			}
		}
	}
}

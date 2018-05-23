package global;

public class Generic {

	/***
	 * Return true if the int is an odd number. Else returns false.
	 * @param c
	 * @return
	 */
	public static boolean isOdd(int c){
		int mod = c%2;
		if(mod==0)
			return false;
		else if(mod!=0)
			return true;
		return false;
	}
	
	/***
	 * swaps two numbers
	 */
	public static void swap(int x, int y){
		//int x=2;int y=3;
		x=x+y;
		y=x-y;
		x=x-y;
	}
}

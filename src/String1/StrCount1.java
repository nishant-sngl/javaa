package String1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***
 * Count Uppercase, Lowercase, special character and numeric values
 * @author nishant
 *
 */
public class StrCount1 {

	public static void main(String[] args) {
		count2();
	}
	
	/***
	 * By ASCII
	 */
	private static void count1(){
		String str = "#GeeKs01fOr@gEEks07";
		char[] ch = str.toCharArray();
		int up = 0,low = 0,num = 0,spl=0;
		for(char c:ch){
			//System.out.println((int)c);
			int x = (int)c;
			if(c>=65 && c<=90)
				up++;
			else if(c>=97 && c<=122)
				low++;
			else if(c>=48 && c<=57)
				num++;
			else
				spl++;
		}
		System.out.println("UPPER: "+up);
		System.out.println("lower: "+low);
		System.out.println("num: "+num);
		System.out.println("spl: "+spl);
	}
	
	/***
	 * By Regex
	 */
	private static void count2(){
		String str = "#GeeKs01fOr@gEEks07";
		char[] ch = str.toCharArray();
		int up = 0,low = 0,num = 0,spl=0;
		for(char c:ch){
			//System.out.println((int)c);
			Pattern upper = Pattern.compile("[A-Z]");
			Pattern lower = Pattern.compile("[a-z]");
			Pattern number = Pattern.compile("[0-9]");
			//Pattern upper = Pattern.compile([A-Z]);
			Matcher mU= upper.matcher(Character.toString(c));
			Matcher mL= lower.matcher(Character.toString(c));
			Matcher mN= number.matcher(Character.toString(c));
			
			if(mU.find())
				up++;
			else if(mL.find())
				low++;
			else if(mN.find())
				num++;
			else
				spl++;
		}
		System.out.println("UPPER: "+up);
		System.out.println("lower: "+low);
		System.out.println("num: "+num);
		System.out.println("spl: "+spl);
	}
	
}
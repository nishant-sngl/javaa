package String1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrCount2 {

	public static void main(String[] args) {
		shortest();
	}
	
	private static void shortest(){
		String s = "this is a test string";
		String p = "[t(2}is]";
		Pattern ptr = Pattern.compile(p);
		Matcher mm = ptr.matcher(s);
		System.out.println(mm.find());
		char[] c = s.toCharArray();
		int l = s.length();
		String max = null;
		for(int i = 0;i<l-4;i++){
			for(int j = i+3;j<l-4;j++){
				String temp = s.substring(i, j);
				System.out.println(temp);
				int tempL = temp.length();
				Matcher m = ptr.matcher(temp);
				if(m.find()){
					System.out.println("found--------------");
					if(max==null){
						max=temp;
					}else if(max.length()>temp.length()){
						max = temp;
					}
				}
			}
			System.out.println("max here is: " + max);
		}
		System.out.println(max);
	}
}

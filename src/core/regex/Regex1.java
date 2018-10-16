package core.regex;

import java.io.File;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {
		/*Pattern p = Pattern.compile("[a-]");
		Matcher m = p.matcher("ababbzaba");
		while(m.find()){
			System.out.println(m.start()+" -- "+m.group());
		}*/
		/*StringTokenizer st = new StringTokenizer("nishant Singhal aa"," ");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}*/
		//System.out.println(isMobile("6999999991"));
		//getJavaFileCount();
		LinkedList<String> l = new LinkedList<>();
		String s = "dfsefwe\bfefe\b";
		int i =s.indexOf("h");
		System.out.println(i);
	}
	
	private static boolean isMobile(String n){
		
		Pattern p = Pattern.compile("[7-9][0-9]{9}");
		Matcher m = p.matcher(n);
		while(m.find() && m.group().equals(n)){
			return true;
		}
		return false;
	}
	/***
	 * Program to find the matching number of file names in any dir.
	 * @return
	 */
	private static int getJavaFileCount(){
		int c=0;
		Pattern p = Pattern.compile("[a-zA-Z0-9]+[.]xml");
		File f = new File(System.getProperty("user.dir"));
		String[] l = f.list();
		for(String s:l){
			Matcher m = p.matcher(s);
			if(m.find() && m.group().equals(s)){
				System.out.println(s);
				c++;
			}
		}
		System.out.println(c);
		return c;
	}
}
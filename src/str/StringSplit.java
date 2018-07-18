package str;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringSplit {

	public static void main(String[] args) {
		ArrayList<String> filter = new ArrayList<>();
		filter.add(".");
		filter.add("#");
		//split("abc.def#ghi.jkl#q", filter);
		spl1();
		
	}
	
	private static void split(String s, ArrayList<String> l){
		ArrayList<String[]> mList = new ArrayList<>();
		for(int i=0;i<l.size();i++){
			String[] aa = s.split(l.get(i));
			for(int j=0;j<aa.length;j++){
				System.out.println(aa[j]);
			}
			mList.add(aa);
		}
		for(int i=0;i<mList.size();i++){
			String[] temp = mList.get(i);
			for(int j=0;j<temp.length;j++){
				System.out.println(temp[j]);
			}
		}
		
	}
	
	private static void spl1(){
		String[] sep_list = { " ", "\n", "[", "]", "{", "}", "(", ")" };
		StringBuffer regexp = new StringBuffer("");
		regexp.append("[");
		for(String s : sep_list) {
		    regexp.append("[");
		    regexp.append(Pattern.quote(s));
		    regexp.append("]");
		}
		regexp.append("]");
		 
		/*String orginal = "a b\nc[d]e{f}g(h)i";
		StringBuffer result = new StringBuffer("");*/
		String orginal = "a b\nc[d]e{f}g(h)i";
		String[] a = orginal.split(regexp.toString());
		/*for(String string : a) {
		    result.append(string);
		}*/
		for(String string : a) {
		    System.out.println(string);
		}
		//System.out.println(result);
	}
	
}

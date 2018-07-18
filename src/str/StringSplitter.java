package str;

import java.util.regex.Pattern;

/**
	 * Class for splitting strings into lists of substrings. Constructor
	 * can have one or more parameters specifying all separator characters
	 * as an enum. 
	 *
	 * Example #1: 
	 *    new StringSplitter(Separator.PERIOD).split(“foo.bar#baz”);
	 *    returns: {“foo”, “bar#baz”} 
	 *
	 * Example #2: 
	 *    new StringSplitter(Separator.PERIOD, Separator.HASH).split(“foo.bar#baz”);
	 *    returns: {“foo”, “bar”, “baz”} 
	 *
	 * IMPLEMENT FOLLOWING:
	 *
	 * (1) StringSplitter class and Separator enum supporting at two or 
	 *     more different separators. 
	 *
	 * (2) Some tests for the StringSplitter. TestNG/JUnit approach is preferred 
	 *
	 */
	public class StringSplitter {

		String[] param ;
		
	  // TODO: Constructor
	  public StringSplitter(String[] param) {
		// TODO Auto-generated constructor stub
		this.param = param;  
	}

	  /**
	   * Splits the given string based on the separator(s) given at
	   * in the constructor.
	   * @param string String to be split
	   * @return Resulting list of substrings.
	   */
	  public String[] split(String string) {
	    // TODO: Code goes here
		  StringBuffer regexp = new StringBuffer("");
			regexp.append("[");
			for(String s : param) {
			    regexp.append("[");
			    regexp.append(Pattern.quote(s));
			    regexp.append("]");
			}
			regexp.append("]");
			
			String[] a = string.split(regexp.toString());
		  
		  return a;
	  }
	  
	  public static void main(String[] args) {
		  //String[] param =  {" ", "\n", "[", "]", "{", "}", "(", ")"};
		  String[] param =  {Separator.SPACE.name(),Separator.ENTER.name(),Separator.OPENSQUARE.name()};
		  StringSplitter obj = new StringSplitter(param);
		  String[] a = obj.split("a b\nc[d]e{f}g(h)i");
		  for(String string : a) {
			    System.out.println(string);
			}
	  }	  
	}
	

	enum Separator {
		SPACE {public String toString() {return " ";}},
		ENTER {
		        public String toString() {
		            return "\n";
		        }
		    },
		OPENSQUARE {
		        public String toString() {
		            return "[";
		        }
		    }
	}
	
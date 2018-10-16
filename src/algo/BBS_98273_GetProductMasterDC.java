package algo;

public class BBS_98273_GetProductMasterDC {

	
	public static void main(String[] args) {
		String s = "abcAbcAbZ";
		System.out.println(case1(s));
	}
	
	static int case1(String s){
		char[] c = s.toCharArray();
		int x=0;
		for(int i = 0;i<c.length;i++){
			if((int)c[i]>=65 && (int)c[i]<=92){
				x++;
			}
		}
		return x+1;
	}
}

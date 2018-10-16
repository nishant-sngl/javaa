package ds.stackQ;
/***
 * Implementing stack by Array
 * @author nishant
 * ###Proper####
 *
 */
public class Stk2 {

	static int[] stk = null;
	int top = -1;
	
	public static void main(String[] args) {
		
		Stk2 s = new Stk2();
		System.out.println("empty: " + s.isEmpty());
		System.out.println(s.push(10));
		System.out.println(s.push(20));
		System.out.println(s.push(30));
		System.out.println(s.push(40));
		System.out.println(s.push(50));
		System.out.println("printing stk: ");
		s.printStk();
		System.out.println("empty: " + s.isEmpty());
		System.out.println("full: " + s.isFull());
		s.peak();
		
	}
	
	void peak(){
		System.out.println(stk[top-1]);
	}
	
	void printStk(){
		for(int i=top-1;i>=0;i--){
			System.out.println(stk[i]);
		}
	}
	
	boolean isEmpty(){
		if(stk==null){
			return true;
		}
		return false;
	}
	
	boolean isFull(){
		int l = stk.length;
		if(l-1==top){
			return true;
		}
		return false;
	}
	
	int push(int x){
		if(isEmpty()){
			stk= new int[2];
			top = 0;
		}
		if(isFull()){
			resize();
		}
		stk[top] = x;
		top++;
		return top;
	}
	
	static void resize(){
		int[] tempArr = new int[stk.length*2];
		for(int i=0;i<stk.length;i++){
			tempArr[i] = stk[i];
		}
		stk=tempArr;
	}
}

package stackQ;

public class Stack {
	
	int size = 0; //taking the initial size as 0
	String[] stack = new String[size]; //creating stack object
	int top = -1; //taking the initial value of TOP as -1
	
	
	/***
	 * This method will push the values into stack
	 * @param val
	 */
	public void push(String val){
		if(top==size-1){ //if the top is about to reach the stack size then double the stack size.
			resize();
		}
		//System.out.println("Current size is " + size);
		stack[++top] = val; //increasing top location and assigning value to it.
		//System.out.println("Current TOP is " + top);
	}
	
	private void resize(){
		String[] newStack = null; //create a temp stack.
		if(size==0){
			size=1;
			newStack = new String[size]; //if the initial stack is empty, then init the stack with size =1;
		}
		else{
			size*=2;
			newStack = new String[size]; // if the stack exists, then double the size of the array.
			for(int i=0;i<size/2;i++){
				newStack[i] = stack[i]; // copy the old arrey into new array
			}
		}
		stack = newStack; //point old array ref to the new array.
	}
	
	/***
	 * To reduce the size of the stack to half.
	 */
	private void desize(){
		String[] newStack = null;
			newStack = new String[size/2];
		for(int i=0;i<size/2;i++){
			newStack[i] = stack[i];
		}
		stack = newStack;
		size=size/2;
	}
	
	/***
	 * Printing the stack in LIFO order
	 */
	public void show(){
		for(int i=stack.length-1;i>=0;i--){
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
	
	/***
	 * Popping out the elements from the stack in LIFO pattern
	 * @return
	 */
	public String pop(){
		String str= null;
		str = stack[top];
		stack[top] = null;
		top--;
		System.out.println("top: " + top);
		System.out.println("size: " + size);
		if(size/2>=top)
			desize();
		return str;
	}
}

package ds.stack;

public class Stack{
	public static void main(String[] args) {
		
		Stack1 s = new Stack1();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.printAll();
		int x = s.pop();
		System.out.println(x + " is popped");
		s.printAll();
	}
}

class Stack1 {

	int[] arr = new int[5];
	int head = 0;
	
	void push(int i){
		arr[head] = i;
		head++;
	}
	
	void printAll(){
		for(int i=0;i<head;i++){
			System.out.print(arr[i]);
			System.out.println(" ");
		}
	}
	
	int pop(){
		int x = arr[head-1];
		head--;
		return x;
	}
	
}



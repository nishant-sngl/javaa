package ds.queue;

public class Que {
	
	public static void main(String[] args) {
		Q q = new Q();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		q.printAll();
		int x = q.pop();
		System.out.println(x + " is popped");
		q.printAll();
	}
}

class Q{
	
	int[] arr = new int[5];
	int head = 0;
	int tail = 0;
	
	void push(int i){
		arr[head] = i;
		head++;
	}
	
	void printAll(){
		for(int i=tail;i<head;i++){
			System.out.print(arr[i]);
			System.out.println(" ");
		}
	}
	
	int pop(){
		int x = arr[tail];
		tail++;
		return x;
	}
}

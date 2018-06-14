package stackQ;

public class Queue {

	int size = 5;
	int[] q = new int[size];
	int front = 0;
	int rear = 0;
	
	public void enqueue(int value){
		q[rear] = value;
		rear = (rear+1)%size;
		size++;

	}
	
	public int dequeue(){
		int val = q[front];
		front = (front+1)%size;
		size--;
		return val;
	}
	
	/*private void resize(){
		int[] newQ = null; //create a temp stack.
		if(size==0){
			size=1;
			newQ = new int[size]; //if the initial stack is empty, then init the stack with size =1;
			
		}
		else{
			size*=2;
			newQ = new int[size]; // if the stack exists, then double the size of the array.
			for(int i=0;i<size/2;i++){
				newQ[i] = q[i]; // copy the old arrey into new array
			}
		}
		q = newQ; //point old array ref to the new array.
	
	}*/
	
	public void show(){
		System.out.print("visible elements: ");
		for(int i=front;i<rear;i++){
			System.out.print(q[i] + " ");
		}
		System.out.println();
		System.out.print("Total array: ");
		for(int i:q){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

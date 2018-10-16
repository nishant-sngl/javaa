package ds.stackQ;

public class Queue {

	int size = 5;
	int[] q = new int[size];
	int front;
	int rear;
	int size1;
	
	public void enqueue(int value){
		if(!isFull()){
			q[rear] = value;
			rear = (rear+1)%size;
			size1++;
		}else
			System.out.println("The Q is full");
	}
	
	public int dequeue(){
		if(!isEmpty()){
			int val = q[front];
			front = (front+1)%size;
			size1--;
			return val;
		}else{
			System.out.println("THe Q is empty");
			return 0;
		}
	}
	
	public int getSize(){
		return (size1);
	}
	
	public boolean isEmpty(){
		return (getSize()==0);
	}
	
	public boolean isFull(){
		return (getSize()==5);
	}
	
	public void show(){
		System.out.print("visible elements: ");
		for(int i=0;i<size1;i++){
			System.out.print(q[(front+i)%5] + " ");
		}
		System.out.println();
		System.out.print("Total array: ");
		for(int i:q){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

package ds;

public class BubbleSort {

	public static void main (String[] args) {
		//code
		int[] arr = {1,2,3,4,5};
		int j=0;
		while(j<5){
			System.out.println(j + " run");
			boolean flag = false;
		    for(int i=0;i<4;i++){
		        if(arr[i]>arr[i+1]){
		      	  int temp = arr[i];
		      	  arr[i] = arr[i+1];
		      	  arr[i+1] = temp;
		      	  flag = true;
		        }
		    }
		    //because of this flag the prog will stop if any of the items are not
		    //swapped in the inner loop. IE, the array is already swapped.
	        if(!flag)
	        	break;
		    j++;
		}
		for(int i=0;i<5;i++){
		    System.out.println(arr[i]);
		}
	}
	
	static void swap(int x, int y){
	  int temp = x;
      x = y;
      y = temp;
	}
}

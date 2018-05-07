package ds;

public class SelectionSort {

	public static void main(String[] args) {
		slecSort1();
	}
	
	static void slecSort1(){
		int[] arr = {5,4,3,2,1};
		for(int i=0;i<arr.length;i++){
			int min = arr[i];
			int index = i;
			//boolean flag = false;
			for(int j=i+1;j<arr.length;j++){
				if(min>arr[j]){
					min=arr[j];
					index = j;
				//	flag=true;
				}
			}
			//if(flag){
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			//}
		}
		for(int x:arr){
			System.out.println(x);
		}
	}
	
	static void slecSort2(){
		int[] arr = {5,4,3,2,1};
		for(int i=0;i<arr.length;i++){
			int min = arr[i];
			int index = i;
			boolean flag = false;
			for(int j=i+1;j<arr.length;j++){
				if(min>arr[j]){
					min=arr[j];
					index = j;
					flag=true;
				}
			}
			if(flag){
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		for(int x:arr){
			System.out.println(x);
		}
	}
}

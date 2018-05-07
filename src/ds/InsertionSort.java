package ds;

public class InsertionSort {

	public static void main(String[] args) {
		insertSort1();
	}

	static void insertSort1(){
		int arr[] = { 12, 11, 13, 5, 6};
		for(int i=1;i<5;i++){
			System.out.println("");
			System.out.println("-------i------- "+ i);
			int j=0;
			int temp = arr[i];
			int index = i;
			System.out.println("temp="+temp);
			while(arr[i]<arr[j] && j<i){
				arr[index]=arr[index-1];
				System.out.println("arr new: " + arr[index]);
				j++;
				index--;
			}
			arr[index]=temp;
			for(int x:arr){
				System.out.print(x);
				System.out.print(" ");
			}
		}
		System.out.println("++++++==");
		for(int x:arr){
			System.out.println(x);
		}
	}
	
	static void insertSort(){
		int arr[] = { 12, 11, 13, 5, 6};
		for(int i=1;i<5;i++){
			System.out.println("");
			System.out.println("-------i------- "+ i);
			//int indexFrom;
			int indexTo=0;
			boolean flag = false;
			for(int j=0;j<i;j++){
				System.out.println("j= "+j);
				System.out.println(arr[i]);
				System.out.println(arr[j]);
				if(arr[i]<arr[j]){
				//	indexFrom = i;
					indexTo = j;
					flag=true;
					System.out.println("indexto= " +indexTo);
					break;
				}
			}
			if(flag){
				int temp = arr[i];
				System.out.println("temp= "+temp);
				for(int j=i;j>indexTo;j--){
					arr[j] = arr[j-1];
					System.out.println(arr[j]);
				}
				arr[indexTo] = temp;
				System.out.println(arr[indexTo]);
			}
			for(int x:arr){
				System.out.print(x);
				System.out.print(" ");
			}
		}
		System.out.println("++++++==");
		for(int x:arr){
			System.out.println(x);
		}
	}
}

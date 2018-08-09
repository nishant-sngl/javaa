package arr;

public class Rotate {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		for(int x:a)
			System.out.println(x);
		System.out.println("-----");
		shift(a, 2);
	}
	
	static void shift(int[] a, int n){
		int[] a1 = new int[a.length];
		for(int i=0;i<a.length;i++){
			a1[i]=a[i];
		}
		for(int i =0;i<a.length;i++){
			a1[i] = a[(i+2)%a.length];
		}
		for(int x:a1)
			System.out.println(x);
	}
}

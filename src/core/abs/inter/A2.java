package core.abs.inter;

public class A2 extends A1{

	A2(){
		System.out.println("in A2 const");
	}
	public int f2() {
		return 0;
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		Inter o1 = new A2();
		A1 o2 = new A2();
		
		o1.f2();
		o1.f1();
		
		o2.f2();
		o2.f1();
	}
	
}

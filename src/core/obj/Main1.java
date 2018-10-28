package core.obj;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main1 {

	public static void main(String[] args) {
	/*
		Obj1 o1 = new Obj1(12, "abc");
		Obj1 o2 = new Obj1(12, "abc");
		System.out.println(o1.equals(o2));
		System.out.println(o1==o2);
		new String(Files.readAllBytes(Paths.get(path)));*/
		
		A o = A.getObj();
		A o1 = A.getObj();
		System.out.println(o.equals(o1));
		System.out.println(o==o1);
	}
	
	static class A{
		
	/*	static A obj = new A();
		private void A(){
		}
		
		public static A getObj(){
			return obj;
		}*/
		
		/***
		 * This approach is called lazy instantiation.
		 * This is better bcz, the the above approach the object will be created even if we do not call the getObj().
		 */
		static A obj;
		private void A(){
		}
		
		public static A getObj(){
			if(obj==null)
				obj = new A();
			return obj;
		}
	}
}

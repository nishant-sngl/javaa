package core.designPattern.factory;


public class FactoryMain {

	public static void main(String[] args) {
		
		/*Without Factory DP, we need to mention the class name everytime
		So the client code has to be changed in case of new class implementation.
		*/
		
/*		//Android obj = new Android();
		//Ios obj = new Ios();
		Win obj = new Win();
		obj.spec();*/
		
		/*With Factory DP, We create a class Operate,
		which will handle the object creation, depending upong the input string.
		So in future if any new OS is launched then we need to just pass the new string.
		The Lib will handle the object creation of that new class internally.
		*/
		Operate op = new Operate();
		OS obj = op.getInstance("open");
		obj.spec();
	}
}

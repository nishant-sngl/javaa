package core.designPattern.factory;

public class Operate {

	public OS getInstance(String str){
		
		if(str.equals("open"))
			return new Android();
		else if(str.equals("close"))
			return new Ios();
		else
			return new Win();
	}
}

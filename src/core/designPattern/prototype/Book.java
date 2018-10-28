package core.designPattern.prototype;

public class Book {

	String bName;
	int bId;
	
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	
	@Override
	public String toString() {
		return "Book [bName=" + bName + ", bId=" + bId + "]";
	}
	
}

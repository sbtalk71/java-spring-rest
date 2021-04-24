package inheritance;

public class Box {

	private int length;
	private int breadth;
	private int height;
	
	
	public Box(int length, int breadth, int height) {
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	
	
	public String boxDetails() {
		return ""+"volume = "+(length*breadth*height);
	}
	
	
	
	
}

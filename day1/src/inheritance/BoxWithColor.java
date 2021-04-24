package inheritance;

public class BoxWithColor extends Box {

	private String color = "colorless";

	public BoxWithColor(int length, int breadth, int height, String color) {
		super(length, breadth, height);
		this.color = color;
	}

	
	@Override
	public String boxDetails() {
		
		return super.boxDetails()+" and Color = "+this.color;
		
	}
}

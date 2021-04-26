package inheritance;

public class BoxMain2 {

	public static void main(String[] args) {
		
	BoxWithColor box = new BoxWithColor(10,20,30,"blue");
	
	System.out.println(box.boxDetails());
	
	Cube c = new Cube(21);
	System.out.println(c.boxDetails());
	
	System.out.println(c);
	}
	
}

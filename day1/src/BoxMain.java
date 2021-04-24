
public class BoxMain {

	public static void main(String[] args) {
		Box box = new Box(10,20,20);
		
		System.out.println(box.volume());
		
		Box box2=new Box(10,20,30,"blue");
		
		Box box3=new Box(10,20,30,"blue",18.9);
		
		Box cube=new Box(10);
		
		//display the color, wt and volume of each Box Type

	}

}

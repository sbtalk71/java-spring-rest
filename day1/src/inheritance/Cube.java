package inheritance;

public class Cube extends Box {

	public Cube(int length){
		super(length, length, length);
	}
	
	@Override
	public String boxDetails() {
		
		return "Cube "+super.boxDetails();
	}
	
	@Override
	public String toString() {
		
		return this.getClass().getName();
	}
	
	@Override
	public int hashCode() {
		System.out.println("Hashcode executes..");
		return 1;
	}
	
	public void show() {
		System.out.println("this is Cube.show()");
	}
}

package abstractdemo;

public class Main {

	public static void main(String[] args) {
		
		Figure ref;
		
		Triangle t= new Triangle(10, 20);
		Rectangle r = new Rectangle(10,20);
		
		ref=t;
		System.out.println("Area of Triangle ' "+ref.area());
		
		ref=r;
		System.out.println("Area of Rectangle ' "+ref.area());

	}

}

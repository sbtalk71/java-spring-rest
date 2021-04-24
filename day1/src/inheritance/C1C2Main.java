package inheritance;

import java.io.FileInputStream;
import java.io.InputStream;

public class C1C2Main {
	
	public static void show(Box o) {
		
		System.out.println(o.toString());
	}

	public static void main(String[] args) {
		C1 c = new C2();
		
		//C2 c2= (C2)new C1();
		
		Object o = new String("I am Java");
		
		//show("demo");
		//show(120);
		//show(c);
		
		Cube cube = new Cube(10);
		show(cube);
		

		
	}

}

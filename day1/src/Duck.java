
public class Duck {

	static {
		System.out.println("Static Block Executes..");
	}
	static int duckCount = 0;

	public Duck() {
		duckCount++;
	}

	public static void fun() {
		System.out.println("fun with static ...");
	}
}

class Main {

	public static void main(String[] args) {
		/*
		 * Duck d1= new Duck(); Duck d2= new Duck(); Duck d3= new Duck(); Duck d4= new
		 * Duck(); Duck d5= new Duck();
		 */
		System.out.println(Duck.duckCount);
		Duck.fun();

	}
}
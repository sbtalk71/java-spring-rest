package lambda;

public class LmbdaDemo2 {
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		System.out.println(cal.doOperation(2, 3, (x,y)->x+y));
		System.out.println(cal.doOperation(6, 3, (x,y)->x-y));
		System.out.println(cal.doOperation(8, 3, (x,y)->x*y));
	}
}

@FunctionalInterface
interface Math {

	public int calculate(int a, int b);
}

class Calculator {

	public int doOperation(int a, int b, Math m) {

		return m.calculate(a, b);
	}

}
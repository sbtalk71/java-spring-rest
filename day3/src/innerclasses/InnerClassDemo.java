package innerclasses;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class InnerClassDemo {

	public void greet(Greeter greeter) {
		System.out.println(greeter.greetMessage());
	}

	public static void main(String[] args) {

		InnerClassDemo d = new InnerClassDemo();

		d.greet(() -> " Good Morning ");// ()->"Message"

		Greeter g_anoon = () -> "Good After Noon";

		d.greet(() -> "Hello there");

		Add a = (x, y) -> x + y;

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 78, 98, 23, 97);
		nums.stream().filter(i->i%2==0).forEach(s->System.out.println(s));
		
	}

}

/*
 * class MyEvenPredicate implements Predicate<Integer> {
 * 
 * @Override public boolean test(Integer t) { if (t % 2 == 0) { return true; }
 * else { return false; } }
 * 
 * }
 * 
 * class MyIntConsumer implements Consumer<Integer> {
 * 
 * @Override public void accept(Integer t) { System.out.println(t.intValue());
 * 
 * }
 * 
 * }
 */
interface Add {
	public int add(int a, int b);
}

@FunctionalInterface
interface Greeter {

	public String greetMessage();
	// public String fun();
}

/*
 * class GoodMorning implements Greeter{
 * 
 * @Override public String greetMessage() { return "Good Morning";
 * 
 * }
 * 
 * }
 * 
 * class GoodAfterNoon implements Greeter{
 * 
 * @Override public String greetMessage() { return "Good Afternoon";
 * 
 * }
 * 
 * }
 * 
 * class GoodEvening implements Greeter{
 * 
 * @Override public String greetMessage() { return "Good Evening";
 * 
 * }
 * 
 * }
 */
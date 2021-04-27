package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Shantanu", "Anubhav", "Sriram", "John", "Ankita", "Rupa", "Arun");

		names.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

		List<String> someNames = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());

		// print the names of those having less than 6 chars

		// print the names of those with a greeting message having name length more than
		// 6 chars

		names.stream().filter(s -> s.length() > 6).map(name -> "welcome " + name).forEach(System.out::println);

		names.stream().map(name -> new Integer(name.length())).mapToInt(n -> n.intValue()).forEach(System.out::println);

		int max = names.stream().map(name -> new Integer(name.length())).mapToInt(n -> n.intValue()).max().getAsInt();

		System.out.println(max);

		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 6, 8, 9, 11, 3, 5, 67, 78, 87, 95);

		// calculate the sum of odd numbers

		int sum = numList.stream().filter(n -> n % 2 != 0).mapToInt(n -> n.intValue()).sum();
		System.out.println(sum);

		int result = numList.stream().filter(n -> n % 2 != 0).mapToInt(n -> n.intValue()).reduce((x, y) -> x * y)
				.getAsInt();
		System.out.println(result);
	}

}

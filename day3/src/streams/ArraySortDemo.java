package streams;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDemo {

	public static int compareByLength(String s1, String s2) {
		return s1.length() - s2.length();
	}

	public static void main(String[] args) {

		String[] names = new String[] { "Shantanu", "Anubhav", "Sriram", "John", "Ankita", "Rupa", "Arun" };

		System.out.println(names.length);

		// Arrays.sort(names,new MySorter());
		//Arrays.sort(names, (x, y) -> x.compareTo(y));
		Arrays.sort(names,ArraySortDemo::compareByLength);

		for (String name : names) {
			System.out.println(name);
		}
	}

}

class MySorter implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o2.compareTo(o1);
	}

}
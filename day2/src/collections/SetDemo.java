package collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		//Set<String> listOfCities = new HashSet<>();
		
		SortedSet<String> listOfCities = new TreeSet<>();
		listOfCities.add("Hyderabad");
		listOfCities.add("Chennai");
		listOfCities.add("Bangalore");
		listOfCities.add("Pune");
		listOfCities.add("Bhubaneshwar");
		listOfCities.add("Pune");
		System.out.println(listOfCities);

		
		System.out.println(listOfCities);

		Iterator<String> itr = listOfCities.iterator();

		while (itr.hasNext()) {

			String city = itr.next();
			System.out.println("Welcome to " + city);
		}
		
		for(String city:listOfCities) {
			System.out.println(city);
		}
	}

}

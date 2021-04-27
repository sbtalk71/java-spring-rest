package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//@SuppressWarnings("unchecked") 
public class ListDemo {

	public static void main(String[] args) {

		// List<String> listOfCities = new ArrayList<>();
		//List<String> listOfCities = new LinkedList<>();
		Vector<String> listOfCities= new Vector<>();

		listOfCities.add("Hyderabad");
		listOfCities.add("Chennai");
		listOfCities.add("Bangalore");
		listOfCities.add("Pune");
		listOfCities.add("Bhubaneshwar");
		listOfCities.add("Pune");
		System.out.println(listOfCities);

		System.out.println(listOfCities.get(4));
		listOfCities.remove(3);
		listOfCities.add(2, "Delhi");

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

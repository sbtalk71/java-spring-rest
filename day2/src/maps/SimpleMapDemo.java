package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SimpleMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> cityWithCode=new HashMap<>();
		
		cityWithCode.put(40, "Hyderabad");
		cityWithCode.put(33, "Kolkata");
		cityWithCode.put(80, "Bangalore");
		cityWithCode.put(44, "Chennai");
		cityWithCode.put(11, "Delhi");
		
		System.out.println(cityWithCode.get(33));
		
		Set<Integer> keySet=cityWithCode.keySet();
		
		for(Integer key:keySet) {
			System.out.println(key+" ----> "+cityWithCode.get(key));
		}
		
		Collection<String> cities= cityWithCode.values();
		for(String city: cities) {
			System.out.println(city);
		}

	}

}

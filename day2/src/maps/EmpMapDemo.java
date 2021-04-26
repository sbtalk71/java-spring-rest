package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import collections.Emp;

public class EmpMapDemo {

	public static void main(String[] args) {
		Map<Integer, Emp> empDb=new HashMap<>();
		
		empDb.put(100,new Emp(100, "Shantanu", "Hyderabad", 56000));
		empDb.put(101,new Emp(101, "Ankur", "Hyderabad", 66000));
		empDb.put(102,new Emp(102, "Sangita", "Bangalore", 45000));
		empDb.put(103,new Emp(103, "Charan", "Hyderabad", 76000));
		empDb.put(104,new Emp(104, "Ankit", "Bangalore", 76000));
		empDb.put(105,new Emp(105, "Karan", "Bangalore", 66000));
		empDb.put(106,new Emp(106, "Rupesh", "Hyderabad", 56000));
		empDb.put(107,new Emp(107, "Mohit", "Chennai", 96000));
		empDb.put(108,new Emp(108, "Chandra", "Hyderabad", 56000));
		empDb.put(109,new Emp(109, "Ranga", "Hyderabad", 86000));
		
		
		Set<Integer> keySet=empDb.keySet();
		
		for(Integer key:keySet) {
			System.out.println(key+" ----> "+empDb.get(key));
		}
		
		

	}

}

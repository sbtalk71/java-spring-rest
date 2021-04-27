package assignment;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Set<Person> personSet = new HashSet<>();
		personSet.add(new Person("John", "male", 56));
		personSet.add(new Person("Kiran", "female", 34));
		personSet.add(new Person("Mary", "female", 55));
		personSet.add(new Person("Scott", "male", 46));
		personSet.add(new Person("Montu", "male", 26));
		personSet.add(new Person("Arun", "male", 36));
		personSet.add(new Person("Sita", "female", 26));
		personSet.add(new Person("Ajay", "male", 46));
		personSet.add(new Person("smita", "female", 32));
		
		personSet.stream().filter(p->p.getGender().equals("male")).forEach(System.out::println);
		
		personSet.stream().filter(p->p.getAge()>45).map(p->p.getName()+" is eligible for Vaccination").forEach(System.out::println);
		
		int max_age=personSet.stream().filter(p->p.getGender().equals("male")).mapToInt(p->p.getAge()).max().getAsInt();
		
		personSet.stream().filter(p->p.getAge()==max_age).forEach(System.out::print);

	}

}

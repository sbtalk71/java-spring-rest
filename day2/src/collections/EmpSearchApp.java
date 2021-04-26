package collections;

import java.util.ArrayList;
import java.util.List;

public class EmpSearchApp {

	List<Emp> empList = new ArrayList<>();

	public void init() {
		empList.clear();
		empList.add(new Emp(100, "Shantanu", "Hyderabad", 56000));
		empList.add(new Emp(101, "Ankur", "Hyderabad", 66000));
		empList.add(new Emp(102, "Sangita", "Bangalore", 45000));
		empList.add(new Emp(103, "Charan", "Hyderabad", 76000));
		empList.add(new Emp(104, "Ankit", "Bangalore", 76000));
		empList.add(new Emp(105, "Karan", "Bangalore", 66000));
		empList.add(new Emp(106, "Rupesh", "Hyderabad", 56000));
		empList.add(new Emp(107, "Mohit", "Chennai", 96000));
		empList.add(new Emp(108, "Chandra", "Hyderabad", 56000));
		empList.add(new Emp(109, "Ranga", "Hyderabad", 86000));

	}

	public void searchEmp(String pattern) {
		for (Emp e : empList) {
			if (e.getName().contains(pattern)) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {

		EmpSearchApp app = new EmpSearchApp();
		app.init();
		
		app.searchEmp("r");

	}

}

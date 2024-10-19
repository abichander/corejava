package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getNAme() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	
}

public class SortingComparable {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>(Arrays.asList(
				
				
				new Employee("kapil", 2000),
				new Employee("abi",1500),
				new Employee("keerthi",1600),
				new Employee("banu",2500)
				));
				Collections.sort(employees);
				for (Employee e:employees) {
					System.out.println(e);
				}
				
	
				
				

	}

}

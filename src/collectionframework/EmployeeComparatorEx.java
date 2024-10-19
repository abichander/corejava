package collectionframework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeData{
	String eName;
	int eSalary;
	LocalDate eDateOfJoining;
	String eDesignation;
	public EmployeeData(String eName, int eSalary, LocalDate eDateOfJoining, String eDesignation) {
		super();
		this.eName = eName;
		this.eSalary = eSalary;
		this.eDateOfJoining = eDateOfJoining;
		this.eDesignation = eDesignation;
	}
	@Override
	public String toString() {
		return "EmployeeData [eName=" + eName + ", eSalary=" + eSalary + ", eDateOfJoining=" + eDateOfJoining
				+ ", eDesignation=" + eDesignation + "]";
	}
	
	
}
class sortByName implements Comparator<EmployeeData>{

	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {
		
		return o1.eName.compareTo(o2.eName);
	}
	
}
class SortBySalary implements Comparator<EmployeeData>{


	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {
		if(o1.eSalary<o2.eSalary) {
			return -1;
			
		}
		else if(o1.eSalary>o2.eSalary) {
			return 1;
		}
		return 0;
		
	}
	
}


public class EmployeeComparatorEx {

	
	public static void main(String[] args) {
		ArrayList<EmployeeData> alist=new ArrayList<>();
		alist.add(new EmployeeData("abi",25635,LocalDate.of(2023,05, 20),"Developer"));
		alist.add(new EmployeeData("nivi",256545,LocalDate.of(2021,05, 20),"Developer"));
		alist.add(new EmployeeData("zoya",55635,LocalDate.of(2020,05, 20),"Developer"));
		alist.add(new EmployeeData("rohan",67635,LocalDate.of(2018,05, 20),"Developer"));
		alist.add(new EmployeeData("bala",98535,LocalDate.of(2015,05, 20),"Developer"));
		System.out.println("EmployeeData:"+alist);
		Collections.sort(alist,new sortByName());
		System.out.println("Sort By Name:");
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		Collections.sort(alist,new SortBySalary());
		System.out.println("Sort By Salary:");
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));


	}

}
}
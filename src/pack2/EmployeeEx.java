package pack2;

import pack1.Employee;
 class Emp extends Employee{
	 Emp(){
		 
	 }
	 void msg() {
		 display();
	 }
 }

public class EmployeeEx {
	public static void main(String[]args) {
		Emp emp=new Emp();
		emp.msg();
	}

}

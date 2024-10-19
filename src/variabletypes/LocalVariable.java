package variabletypes;

public class LocalVariable {
	public void StudentAge()
	{
		int age=0;
		age=age+30;
		System.out.println("Student age is :" +age);
				
	}

	public static void main(String[] args) {
		LocalVariable temp=new LocalVariable();
		temp.StudentAge();
		
		

	}

}

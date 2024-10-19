package stringrelated;

public class StudentMain {
	String name="abi";
	//return type methodname(paramterlist){}
	void callStudent()
	{
		System.out.println("Call Student");
	}
    void greeting(String center) {
    	System.out.println("Hello "+center +" learner");
    }
	public static void main(String[] args) {
		int age=21;
		StudentMain s=new StudentMain();//create object for studentmain
		System.out.println("Name :"+s.name);
		System.out.println("Age :"+age);
		s.callStudent();
		s.greeting("chennai");
		System.err.println("Error in my code");
		
		// TODO Auto-generated method stub

	}

}

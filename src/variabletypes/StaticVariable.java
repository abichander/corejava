package variabletypes;
class Student{
	public static double fees;
	public static String name="abi";
}

public class StaticVariable {

	public static void main(String[] args) {
		Student.fees=999989;
		System.out.println(Student.name +" annual fees :" +Student.fees);
		// TODO Auto-generated method stub

	}

}

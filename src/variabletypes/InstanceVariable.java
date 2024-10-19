package variabletypes;
class SubjectMarks{
	int Science;
	int Maths;
	int GK;
	
}

public class InstanceVariable {

	public static void main(String[] args) {
		SubjectMarks Stud1=new SubjectMarks();
		Stud1.Science=67;
		Stud1.Maths=99;
		Stud1.GK=88;
		
		SubjectMarks Stud2=new SubjectMarks();
		Stud2.Science=87;
		Stud2.Maths=89;
		Stud2.GK=100;
		System.out.println("Marks for first object:");
		System.out.println(Stud1.Science);
		System.out.println(Stud1.Maths);
		System.out.println(Stud1.GK);
		
		
		System.out.println("Marks for second object:");
		System.out.println(Stud2.Science);
		System.out.println(Stud2.Maths);
		System.out.println(Stud2.GK);
		
				
		
		
		
		
	

	}

}

package array;

public class OverLoad {

	
	//Constructor overloading:name are same but parameter only differ
	class Learner{
	int lid;
	String lname;
	Learner() {
	lid=1;
	lname="ohm";
	System.out.println("Default constructor");
	}
	Learner(int lid,String lanme) {
	this.lid=lid;
	lname=lanme;
	System.out.println("Paramerterized constructor"); 
	}
	Learner(Learner l){
	lid=l.lid;
	lname=l.lname;
	System.out.println("copy constructor"); 
	}
	@Override
	public String toString() {
	return "Learner [lid=" + lid + ", lname=" + lname + "]";
	}
	void display() {
	System.out.println("lid=" + lid + ", lname=" + lname );
	}

	}
	public class ConstructorTypes {


	public static void main(String[] args) {
	Learner l=new Learner();//default constructor is called
	//System.out.println(l);
	l.display();

	Learner l1=new Learner(101,"priya");
	System.out.println(l1);

	Learner l2=new Learner(l);
	System.out.println(l2);



	}


	}



}

package packageaccessspecifier;
class Vehicle{
	void display(){
		System.out.println("display vehicle method ");
	}
}
class Car extends Vehicle{
	String cname="BMW";
	void dispalyCar() {
		display();
		System.out.println("My Car:"+cname);
	}
}

public class DefaultInSubclass {

	public static void main(String[] args) {
		Car c=new Car();
		c.dispalyCar();

	}

}

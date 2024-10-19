package oops;

public class Interface {
	 interface Flower{
		 void color();
	}

	 class Rose implements Flower{
		 public void color() {
			 System.out.println("The color of rose is Red");
		 }
	 }
	 class Jasmine implements Flower{
		 public void color() {
			 System.out.println("The color of jasmine is White");
		 }
	 }
	 class Lotus implements Flower{
		 public void color() {
			 System.out.println("The color of lotus is Pink");
		 }
	 }
	 public class Colors{

	public static void main(String[] args) {
	     Rose ro=new Rose();
	     ro.color();
	     Jasmine ja=new Jasmine();
	     ja.color();
	     Lotus lo=new Lotus();
	     lo.color();
	

	}
	 
	 }
}

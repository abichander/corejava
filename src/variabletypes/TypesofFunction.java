package variabletypes;
public class TypesofFunction{
	
		
	

void msg() {
    System.out.println("Message function");
}
//Function with string return type
 String display() {
    return "My display method";    
}
//Function with string return type and parameter
 String gretting(String s) {
    return "Hello" +s;
 }
 //Function return type int
 int add() {
     int a=4,b=5;
     return a+b;
 }
//Function with return type int and parameter
 int mul(int a,int b) {
     return a*b;
 }
//Function with return type float for static
 static float area(int r) {
     return (float) (3.14*r*r);
 
 
	
}
}
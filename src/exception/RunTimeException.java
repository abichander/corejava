package exception;

public class RunTimeException {

	public static void main(String[] args) {
		int a=10,b=2;
        float c;
try {
    c=a/b;
    System.out.println("Value of C: "+c);
    int arr[]= {-2,3,4};
    System.out.println("Value of arr[5]: "+arr[2]);
    System.out.println("Value of arr[-2]: "+arr[0]);
    String s="123";
    //String s="pkdfp";
    System.out.println("Convert into number: "+Integer.parseInt(s));
    String str="Hello";
    //String str=null ;
    
    System.out.println("Length: "+str.length());
    int[] array = new int[-3];
    System.out.println("Array length: " + array.length);
}
catch (ArithmeticException e) {
    System.out.println(e);
}
catch (ArrayIndexOutOfBoundsException e1) {
	System.out.println(e1);
}
catch (NumberFormatException e2) {
	System.out.println(e2);
}catch (NullPointerException e3) {
	System.out.println(e3);
}
catch (NegativeArraySizeException e4) {
	System.out.println(e4);
}finally {
	System.out.println("End Of Program");
}

	}

}

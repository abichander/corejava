package looping;

public class ReverseString {

	public static void main(String[] args) {
		String a="HOME";
		String rev=" ";
		for (int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println("Original String is :"+a);
System.out.println("Reversed STring is "+rev);
	}

}

package stringrelated;

public class StringMethod {

	public static void main(String[] args) {
		String s=new String("Java is a Programming Language ");
		String s1="Ahi";
		String s2="AhII";
		String s3="Java";
		System.out.println("Length :"+s.length());
		System.out.println("char At :"+s.charAt(10));
		System.out.println("char At :"+s1.charAt(0));
		System.out.println("Uppercase :"+s.toLowerCase());
		System.out.println("concat :"+s1.concat("Everyone"));
		System.out.println("My string :"+ s1);
		System.out.println("Equals :"+s1.equals(s2));
		System.out.println("Equals ignore :"+s1.equalsIgnoreCase(s2));
		System.out.println("index of :"+s.indexOf('a'));
		System.out.println("last index of :"+s.lastIndexOf('a'));
		System.out.println("compare :"+s2.compareTo(s1));
		System.out.println("Contains :"+s.contains(s3));
		String s5="  ";
		System.out.println("Blank :"+s5.isBlank());
		System.out.println("Length :"+s5.length());
		System.out.println("Empty :"+s5.isEmpty());
		String s6="  hello   ";
		System.out.println("trim :"+s6.trim().length());
		System.out.println("replace :"+s6.replace("hello", "welcome"));
		System.out.println("substring :"+s.substring(1,5));

		

	}

}

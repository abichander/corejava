package stringbuffer;

public class Demo {



	public static void main(String[] args) {
		String str="Hi Java";
		String s=new String("Welcome");
		String b="Hello";
		String c="Developers";
		System.out.println("length :"+str.length());
		System.out.println("compare :"+b.compareTo(str));
		System.out.println("index :"+c.indexOf('o'));
		System.out.println("blank :"+s.isBlank());
		System.out.println("replace :"+b.replace(b,c));
		//System.out.println();
		String s1="  ";
		System.out.println("empty :"+s1.isEmpty());
		System.out.println("blank :"+s1.isBlank());
	}

}

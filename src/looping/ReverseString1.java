package looping;

public class ReverseString1 {

		public static String revString(String s) {
			String rev="";
			for (int i = s.length()-1; i >=0; i--) {
			      rev=rev+s.charAt(i);
			    }
			return rev;
		}
		public static void revString1(String s) {
			String rev="";
			for (int i = s.length()-1; i >=0; i--) {
			      rev=rev+s.charAt(i);
			    }
			System.out.println("Reverse : "+rev);
		}
		public static void main(String[] args) {
			String s="Hello",rev="";
			for (int i = s.length()-1; i >=0; i--) {
			      rev=rev+s.charAt(i);
			    }
			System.out.println("Revers String:"+rev);
			System.out.println("Revers String using function:"+revString("Welcome"));
			revString1("Hi");
			String strr="String";
			StringBuffer sb=new StringBuffer();
			sb.append(strr);
			System.out.println("Reverse String  : "+sb.reverse());


		}


	}





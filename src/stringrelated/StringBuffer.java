package stringrelated;

public class StringBuffer {

	

	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hi");
		//StringBuffer sb=new StringBuffer ("welcome");
		System.out.println("My String before append :"+sb);
		sb.append("Everyone");
		System.out.println("My String after append : "+sb);
		System.out.println("Reverse String :"+sb.reverse());
		sb.insert(4,"learners");
		System.out.println("My String after insert : "+sb);
		sb.delete(4,10);
		System.out.println(" My String after delete : "+sb);

	}

	
	

	

}

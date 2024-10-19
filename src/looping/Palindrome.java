package looping;

public class Palindrome {

	public static void main(String[] args) {
		int num=123,temp=num,rem=0,rev=0;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev) {
			System.out.println("Number is Palindrome");
		}
		else
			
		{
			System.out.println("Not  a Palindrome");
		}

	}

}

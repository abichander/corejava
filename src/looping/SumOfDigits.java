package looping;

public class SumOfDigits {
	int SumOfDigitsno() {
		int a=456,d=0,sum=0;
		while(a!=0) {
			d=a%10;
			sum=sum+d;
			a=a/10;
		}
		System.out.println("Sum of Digits :"+sum);
		return 0;
	}
	static void printEven() {
		int n=10;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		SumOfDigits s=new SumOfDigits();
		
		s.SumOfDigitsno();
		printEven();
		System.out.println("sum of digits :"+s.SumOfDigitsno());
		
	

	}

}

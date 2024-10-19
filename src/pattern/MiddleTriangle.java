package pattern;

import java.util.Scanner;
class MiddleTriangle1{
	static void printPattern(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.println(j+" ");
			}
			System.out.println();
		}
	}
public class MiddleTriangle {
	class MiddleTriangle2{
}
	static void printPattern(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.println(j+" ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 3 inputs to get middle triangle");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	MiddleTriangle1.printPattern(n1);	

	}

}
}

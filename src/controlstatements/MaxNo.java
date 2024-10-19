package controlstatements;

import java.util.Scanner;

public class MaxNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Values of a,b,c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+ "is max");
		}else if (b>c && b>a) {
			System.out.println(b+ "is max");
			
		}
		else
		{
			System.out.println(c+ "is max");
			
	}

	}

}

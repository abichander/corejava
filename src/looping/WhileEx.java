package looping;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		while(true) {
		System.out.println("1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Modulus\n 6.Exit");
		int input=sc.nextInt();
		System.out.println("enter the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(input) {
		case 1:{
			int res=a+b;
			System.out.println("Addition :" +res);
			break;
		}case 2:{
			int res=a-b;
			System.out.println("Subtraction :" +res);
			break;
		}case 3:{
			int res=a*b;
			System.out.println("Multiplication :" +res);
			break;
	}case 4:{
		int res=a/b;
		System.out.println("Division :" +res);
		break;

}case 5:{
	int res=a%b;
	System.out.println("Modulus :" +res);
	break;
}case 6:{
	System.out.println("Exit" );
	System.exit(0);
	break;
}
		}
		}


	}

}

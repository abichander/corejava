package controlstatements;

import java.util.Scanner;

public class MarkSheet {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the maths mark");
int maths=sc.nextInt();
System.out.println("enter the eng mark");
int eng=sc.nextInt();
System.out.println("enter the gk mark");
int gk=sc.nextInt();
int scored=maths+eng+gk;
System.out.println("the score is :"+scored);
double per=(double)scored/300*100;
System.out.println("percentage is:"+per);
if(per>=90) {
	System.out.println(" Grade A+");
}
else if(per>=80 && per<80) {
	System.out.println("Grade A");
}else if(per>=70 && per<=80) {
	System.out.println("Grade B+");
}else if(per>=60 && per<70) {
	System.out.println("Grade B");
}else if(per>=50 && per<=60) {
	System.out.println("Grade C");
}else if (per>=40 && per<=50) {
	System.out.println("Pass");
}else {
	System.out.println("Fail");
}

	}

}

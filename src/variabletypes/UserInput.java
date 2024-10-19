package variabletypes;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur Name:");
		String name=sc.nextLine();
		System.out.println("Name :"+name);
System.out.println("Enter ur Age :");
int age=sc.nextInt();
System.out.println("Age :"+age);
System.out.println("Enter ur percentage ");
float percent=sc.nextFloat();
System.out.println("Percentage :"+percent);
System.out.println("Enter ur Grade");
char ch=sc.next().charAt(0);
System.out.println("Grade :"+ch);
	}

}

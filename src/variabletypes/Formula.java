package variabletypes;

import java.util.Scanner;

public class Formula {
	public int distance (int t) {
		int u=10;
		int a=5;
		 int dt=u*t+((a*t*t)/2);
		 return dt;
		
	}

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      int t=sc.nextInt();
     int t1=sc.nextInt();
     Formula d=new Formula();
      System.out.println(d.distance(t));
      System.out.println(d.distance(t1));
   
	}

}

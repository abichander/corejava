package variabletypes;

public class TypesofOperator {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		int c=a++;
		int d=++b;
		System.out.println("c :" +c +" d :" +d);
         int e=20/2;
         int f=20%3;
         System.out.println("e :"+e+ " f :"+f);
         int a1=5;
         System.out.println("a1 :"+ ~a1);
         int x=10;
         System.out.println("left shift :::"+(x<<1));
         int y=10;
         System.out.println("right shift :::"+(y>>1));
         int no=32;
         String res=no%2==0?"Even":"Odd";//ternary operator
         System.out.println("REsult :"+res);
         if(no%2==0) {
        	 System.out.println("even");
         }else
         {System.out.println("odd");
         
         }
        		
         int m=12;
         int n=32;
         int o=32;
         System.out.println("equal to ::"+(n==o));
         System.out.println("not equal to ::"+(!(m==n)));
         System.out.println("less than :"+(m<n));
         System.out.println("greater than :"+(m>n));
         System.out.println("less than or equal to :"+(m<=o));
         System.out.println("greater than or equal to :"+(n>=m));
         int  p=9;
         int   q=8;
         System.out.println(" bitwise and :"+(p&q));
         System.out.println("bitwise or :"+(p|q));
        
         System.out.println("logical and :"+((p<q)&& (m>n)));
         System.out.println("logical or :"+((p<q)||(m<n)));
         //max of 3 numbers
         int n1=10;
         int n2=23;
         int n3=22;
         int res1=((n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3));
         System.out.println("max is :"+res1);
         
	}

}

package variabletypes;
class VariableDemo2 {
	static int count =0;
	int cnt=0;
	public void increment()
	{ count++;
	
	}
	public void incre()
	{
		cnt++;
	}
}
public class VariableDemo{
	
	public static void main(String[] args) {

		VariableDemo2 v=new VariableDemo2();
		v.increment();
		System.out.println("Count static :"+VariableDemo2.count);
		VariableDemo2 v1=new VariableDemo2();
		v.increment();
		System.out.println("Count static 2 time :"+VariableDemo2.count);
		VariableDemo2 v2=new VariableDemo2();
		v2.incre();
		System.out.println("count instance :"+v2.cnt);
		VariableDemo2 v3=new VariableDemo2();
		v3.incre();
		System.out.println("count instance :"+v3.cnt);
		
		
	}
		

	}




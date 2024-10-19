package threadprogram;


	
	class ThreadOne extends Thread{
	public void run() {
	System.out.println("Thread1");
	int num=10;
	for (int i = 1; i <= 10; i++) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(num + "*" + i + "=" + num * i);
	}
	}
	}
	class Threadtwo extends Thread{
	public void run() {
	System.out.println("Thread2");
	for(int i=11;i<=15;i++) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(i);
	}
	}
	}
	public class ThreadMultipleEx {


	public static void main(String[] args) {
	ThreadOne t=new ThreadOne();
	t.setName("Threadone");
	System.out.println("Thread name : "+t.getName());
	System.out.println("Min Priority "+Thread.MIN_PRIORITY);
	System.out.println("Max Priority "+Thread.MAX_PRIORITY);
	System.out.println("Normal Priority "+Thread.NORM_PRIORITY);
	t.setPriority(8);
	t.start();
	Threadtwo t1=new Threadtwo();
	t1.setPriority(2);

	t1.start();


	}


	}






package threadprogram;



	class Thread1 extends Thread{
		public void run() {
			System.out.println("Thread1");
			for(int i=0;i<3;i++) {
				System.out.println(i);
			}
		}
	}
	class Thread2 extends Thread{
		public void run() {
			System.out.println("Thread2");
			for(int i=5;i<8;i++) {
				System.out.println(i);
			}
		}
	}
	class Thread3 extends Thread{
		public void run() {
			System.out.println("Thread3");
			for(int i=10;i<13;i++) {
				System.out.println(i);
			}
		}
	}
	public class ThreadUsingInheritance {


		public static void main(String[] args) {
			Thread1 t1=new Thread1();//thread is born
			t1.start();//Runnble-->run() method called
			Thread2 t2=new Thread2();//thread is born
			t2.start();
			Thread3 t3=new Thread3();//thread is born
			t3.start();


		}
	}




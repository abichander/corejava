package threadprogram;


public class YeildProg implements Runnable{


public void run()
{
System.out.println("Started " + Thread.currentThread());

Thread.yield();
System.out.println("Ended " + Thread.currentThread());
}
public static void main (String[] args)
{
YeildProg y1 = new YeildProg();

Thread t1 = new Thread(y1, "First child thread");

YeildProg y2 = new YeildProg();

Thread t2 = new Thread(y1, "Second child thread");


t1.start();
t2.start();
}
}


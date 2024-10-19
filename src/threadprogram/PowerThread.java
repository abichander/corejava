package threadprogram;

 
class PowerNum {
synchronized void displayPower(int num) {
int temp = 1; 
for (int i = 1; i <= 3; i++) {
System.out.println(num + "^" + i + "=" + num * temp);
temp = temp * num; 
try {
Thread.sleep(1000); 
} catch (InterruptedException e) {
e.printStackTrace(); 
}
}
}
}
class MulNum {
synchronized void tableMultiplication(int num) {

for (int i = 1; i <= 3; i++) {
System.out.println(num + "*" + i + "=" + num *i);

try {
Thread.sleep(1000); 
} catch (InterruptedException e) {
e.printStackTrace(); 
}
}
}
}


class MulThread1 extends Thread{
MulNum m;
public MulThread1(MulNum m) {
this.m=m;
}
public void run() {
m.tableMultiplication(5);
}
}
class MulThread2 extends Thread{
MulNum m;
public MulThread2(MulNum m) {
this.m=m;
}
public void run() {
m.tableMultiplication(15);
}
}
class Power1 extends Thread {
PowerNum p;
Power1(PowerNum p) {
this.p = p;
}
public void run() {
p.displayPower(2); 
}
}
class Power2 extends Thread {
PowerNum p;


Power2(PowerNum p) {
this.p = p;
}
public void run() {
p.displayPower(3); 
}
}


public class PowerThread {
public static void main(String[] args) {
PowerNum p1 = new PowerNum(); 
Power1 power1 = new Power1(p1); 
// power1.start(); 
Power2 power2 = new Power2(p1); 
// power2.start(); 
MulNum m=new MulNum();
MulThread1 m1=new MulThread1(m);
m1.start();
MulThread2 m2=new MulThread2(m);
m2.start();
}
}
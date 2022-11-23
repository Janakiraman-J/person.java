public class MyClass1 implements Runnable {
public void run(){
System.out.println("Interface_thread is running");}
public static void main(String args[]) {
Runnable r=new MyClass1();
r.run();
}
}
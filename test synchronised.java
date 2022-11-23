public class TestSynchronization{
public static void main(String args[]){
final Table obj = new Table();
Thread t1=new Thread(){
public void run(){
obj.printTable(5);
}
}
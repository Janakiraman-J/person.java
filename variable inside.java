interface Sam {
int x=58; //public static final
void read(); }
class SamSample1 implements Sam{
public void read(){
System.out.println("Hello Sam"); }
public static void main(String amulaya[]) {
Sam s=new SamSample1();
System.out.println(x);
s.read();
}
}
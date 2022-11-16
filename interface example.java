interface interf {
	public void m();
	}
public class InterfaceDemo implements interf {
	public void m() {
	System.out.println("Hello_method"); }
 public static void main(String args[]) {
	InterfaceDemo i=new InterfaceDemo();
		i.m();
 }
}
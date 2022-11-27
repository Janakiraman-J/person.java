interface Writable {
void write(String s); }
public class FunctionInterfaceTest implements Writable {
public void write(String s){
System.out.println(s);}
public static void main(String[] args) {
FunctionInterfaceTest t=new FunctionInterfaceTest();
t.write("Anudip-Java");
    
}
    
}
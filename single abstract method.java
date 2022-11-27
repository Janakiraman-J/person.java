//single abstract method 

interface Jani {
void m();//Single Abstract method, also called Functional Interface
default void m1() {
 System.out.println("default hi");}
 static void m2(){
 System.out.println("welcome Static");}}
class TestFunctionlInterface implements Jani {
public void m(){
System.out.println("Hello, Functional Interface");}
public static void main(String args[]) {
Jani j=new TestFunctionlInterface();
j.m(); j.m1(); Jani.m2();
    
}
    
}
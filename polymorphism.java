class A {
void add(int a,int b) {
System.out.println(+(a+b)); }
void add(double a,double b) {// method overloading 
System.out.println(+(a+b)); }
}
class B extends A {
void add(int a,int b) {//method overriding 
System.out.println(+(a*b));}} 
class PolymarphsimDemo {
public static void main(String args[]) {
B b=new B();
b.add(9,5);//45
b.add(5.2,2.5); //7.7 
}
    
}
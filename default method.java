interface Drawable {
int a=75;
void draw();// abstract method =no body
static int cube(int x) { // static method in interface
return x*x*x; }
default void print() {
System.out.println("Default method");}}
class TestInterface7 implements Drawable {
public void draw() {
System.out.println("drawing something");}
public static void main(String[] args){
Drawable d=new TestInterface7();
System.out.println(d.a);
d.draw();
System.out.println(Drawable.cube(5));
d.print();
    
}
    
}
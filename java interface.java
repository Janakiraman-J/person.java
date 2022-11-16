interface Printable {
int Min=50;
void print(); }
class TestInterface implements Printable {
public void print() {
System.out.print("Hello Welcome"); }
public static void main(String[] arg) {
TestInterface t=new TestInterface();
t.print(); }}
//Interface declaration 
interface Drawable {
void draw();
}
class Rectangle implements Drawable {
public void draw() {
System.out.println("Drawing a Rectangle"); }
}
class Circle implements Drawable {
public void draw() {
System.out.println("Drawing a Circle"); }
}
class TestInterface1 {
public static void main(String args[]) {
/*Circle c=new Circle();
c.draw();
Rectangle r=new Rectangle();
r.draw();*/
Drawable d=new Rectangle();
d.draw();}}
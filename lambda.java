Example1:
public void m1() {
System.out.println("Hello Lambda"); }
()->System.out.println("Hello Lambda");

Example2:
public void add(int a, int b) {
System.out.println(a+b); }
(a,b)->System.out.println(a+b);

Example3:
public int squareInt(int n) {
return n*n; }
n-> {return n*n;}
n->n*n;

Example4: 
public void m4(String s){
return s.length();}
s->s.length();
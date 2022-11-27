//An Interface contains 2 abstract methods, so we can’t go for lambda expression but here we can 
happily apply implements inner classes.

interface A {
void m1(); void m2();}
class InnerClassDemo{
public static void main(String arg[]) {
A a=new A() {
public void m1() {
System.out.println("M1 method");}
public void m2() {
System.out.println("M2 method");} };
a.m1(); a.m2(); }}
class ExceptionDemo {
static int x=10;
static int m() {
try {
System.out.println("In Try");
System.out.println(10/0);
return 10;
}catch(Exception e) {
System.out.println("In Catch");
return 20;}
finally {
System.out.println("In Finally");
System.out.println(30);}}
public static void main(String arg[]) {
int x=m();
System.out.println(x);}}

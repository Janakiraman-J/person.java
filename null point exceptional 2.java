class NullPointerExceptionTest1 {
public static void main(String args[]) {
String[] s=new String[10];
s[5]="JAVA Full STACK";
String lowercaseString=s[5].toLowerCase();
System.out.println(lowercaseString);}}
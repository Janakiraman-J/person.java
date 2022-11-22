class FinallyExample {
public static void main(String arg[]) {
try{
int d=25/0;//
}catch(ArithmeticException e){
System.out.println(e);}
finally{ 
System.out.print("finally block is always executed");
}
}
}
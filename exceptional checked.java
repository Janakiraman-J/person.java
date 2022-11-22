class ExceptionExample {
public static void main(String[] args) {
try{var d=100/0; //code that may raise exception
}catch(ArithmeticException e) {
System.out.println(e);}
System.out.println("...."); 
    
}
    
}
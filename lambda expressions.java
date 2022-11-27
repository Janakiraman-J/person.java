//Example Lambda Expression with Single parameter

interface Sayable {
String say(String name); }
public class LambdaDemo1 {
public static void main(String arg[]) {
Sayable s=(name)->{return "Hi Lambda: "+name;};
System.out.println(s.say("Raju"));
}
}


//Java Lambda Expression with multiple statements

interface Sayable{
String say(String msg); }
public class LambdaDemo4{
public static void main(String arg[]){
Sayable s=msg->{
String str1="I would like to say: ";
String str2=str1+msg;
return str2;};
System.out.println(s.say("Life is one short period use it properly"))
}
}
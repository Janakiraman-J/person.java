class Employee { // Parent or base
double salary =40000;
}
class InheritanceDemo extends Employee { // child or derived class
int bonus=5000;
public static void main(String args[]) {
InheritanceDemo i=new InheritanceDemo();
System.out.println(i.salary);
System.out.println(i.bonus);
}
}
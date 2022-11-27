interface Drawable {
public void draw(); }
public class LambdaExpressionDemo {
public static void main(String args[]) {
Drawable d=()->System.out.println("Draw A Circle");
d.draw();
    
}
    
}
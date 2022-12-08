import java.util.Stack;
public class StackTest{
public static void main(String arg[]){
Stack<Integer> st=new Stack<Integer>();
System.out.println(st.empty());//true
st.push(10);
st.push(20);
st.push(30);
st.push(40);
System.out.println(st.empty());//false
System.out.println(st.get(2));}}
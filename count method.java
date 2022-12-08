package com.jojuskills;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamDemo3 {
public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<Integer> l=new ArrayList<Integer>();
l.add(8);
l.add(5);
l.add(3);
//l.forEach(System.out::println);
long no=l.stream().filter(n->n<10).count();
System.out.println(no);}}

// count method 

package com.jojuskills;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamDemo3 {
public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<Integer> marks=new ArrayList<Integer>();
marks.add(80);
marks.add(70);
marks.add(30);
marks.add(20);
//l.forEach(System.out::println);
long no=marks.stream().filter(n->n<35).count();
System.out.println(no);}}


import java.util.*;
import java.util.stream.Collectors;
public class StreamDemo1 {
public static void main(String args[]){
ArrayList<Integer> marks=new ArrayList<Integer>();
marks.add(70);
marks.add(55);
marks.add(25);
System.out.println(marks);
//filter the pass marks
List<Integer> passmark=marks.stream().filter(m->m>=35).collect(Collectors.toList());
System.out.println(passmark); }}

//StreamDemo2.java

package com.jojuskills;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class StreamDemo2 {
public static void main(String[] args) {
ArrayList<Integer> m=new ArrayList<Integer>();
m.add(75);
m.add(62);
m.add(45);
m.add(35);
m.forEach(System.out::println);
System.out.println("after updated marks");//we want add grace marks
List<Integer> updatemarks=m.stream().map(i->i+5).collect(Collectors.toList());
updatemarks.forEach(System.out::println);}}
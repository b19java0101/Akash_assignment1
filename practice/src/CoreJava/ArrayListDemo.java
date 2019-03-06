package CoreJava;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class ArrayListDemo {

    public static void main(String[] args)throws IOException {
      
      /*  ArrayList al=new ArrayList();
        al.add(10);
       al.add("ss");
        al.add(78.5f);      
        System.out.println("size="+al.size());
     
        al.remove(1);
        System.out.println("size="+al.size());
        System.out.println(al);
        for(Object x:al)
        {
            System.out.println(x);
        }*/
       Stack s = new Stack();
        s.add(10);
        s.add(20);
        s.add(30);
       // s.pop();
       // s.push(0);
        System.out.println("size="+s.size());
    /*   Iterator<Integer> i=s.iterator();
       while(i.hasNext())
       {
    	   System.out.println(i.next());
       }*/
        System.out.println(s);
        while(!(s.isEmpty())) {
        	System.out.println(s.pop());
        	
        }
//       
    /*  ArrayList<Student> a1=new ArrayList<Student>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        a2.add(21);
        a2.add(0);
        a2.add(1);
        a2.add(212);
        System.out.println(a2);
//      
//        Student s1=new Student();
//        Student s2=new Student();
//        Student s3=new Student();
//      
//      
//        a1.add(s1);
//        a1.add(s2);
//        a1.add(s3);
//        System.out.println(a1.size());
//        a1.remove(s3);
//        System.out.println(a1.size());
//        for(Student x:a1)
//        System.out.println(x.getName()+" "+x.getMarks());
  
        Collections.sort(a2);  
        System.out.println(a2);*/
    }

}
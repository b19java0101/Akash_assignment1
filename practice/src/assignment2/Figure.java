package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Figure {
	double pi=3.14;
	  double area;
	  double perimeter;
	  int rad;
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	abstract void findArea();
	abstract void findPerimeter();

	}
	class Circle extends Figure 
	{
	    Circle() throws IOException
	    {
	           
	           System.out.println("Enter the radius of circle");
	           rad=Integer.parseInt(br.readLine());
	    
	    }
	 void findArea() 
	 {
	 
	   area=pi*rad*rad;


	   System.out.println("AREA OF CIRCLE"+area);
	     
	}
	 void findPerimeter()
	 {
	     
	     
	    perimeter=2*pi*rad;
	     
	     System.out.println("PERIMETER  OF CIRCLE"+perimeter);
	 
	}
	}
	 
	class Rectangle extends Figure
	{
	    int length;
	    int breadth;

	    Rectangle()  throws IOException
	    {
	        
	    
	   
	    System.out.println("Enter length of rectangle");
	    length=Integer.parseInt(br.readLine());
	    System.out.println("Enter breadth of rectangle");
	    breadth=Integer.parseInt(br.readLine());
	        
	}
	   void findArea()
	   {
	       double area=length*breadth;
	        System.out.println("AREA OF RECTANGLE"+area);

	   }
	   void findPerimeter()
	   {
	       double perimeter=2*(length+breadth);
	       System.out.println("PERIMETER  RECTANGLE"+perimeter);

	   }
	   }

	class Triangle extends Figure
	{
	    int len;
	    int bre;
	    int hgt;
	    

	    Triangle() throws IOException
	    {
	  
	    System.out.println("Enter side of triangle");
	    len=Integer.parseInt(br.readLine());
	    System.out.println("Enter base of triangle");
	    bre=Integer.parseInt(br.readLine());
	    System.out.println("Enter height of triangle");
	    hgt=Integer.parseInt(br.readLine());
	      
	    }    
	    void findArea()
	   {
	       double area=1/2*bre*hgt;
	        System.out.println("AREA OF TRIANGLE"+area);

	   }
	   void findPerimeter()
	   
	   {
	       double perimeter=(len+bre+hgt);
	       System.out.println("PERIMETER  TRIANGLE"+perimeter);

	   }}


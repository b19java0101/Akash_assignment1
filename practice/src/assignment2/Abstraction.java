package assignment2;

import java.io.IOException;

public abstract class Abstraction {

	public static void main(String[] args) throws IOException {
		  {
		        //int i;
		        Circle c=new Circle();
		        Circle c1=new Circle();

		        Rectangle r=new Rectangle();
		        Rectangle r1=new Rectangle();
		 
		        Triangle t=new Triangle();
		        Triangle t1=new Triangle();

		        c.findArea();
		        c.findPerimeter();
		        r.findArea();
		        r.findPerimeter();
		        t.findArea();
		        t.findPerimeter();
		        c1.findArea();
		        c1.findPerimeter();
		        r1.findArea();
		        r1.findPerimeter();
		        t1.findArea();
		        t1.findPerimeter();  
		        
		}

	}

}

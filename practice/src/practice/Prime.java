package practice;
//import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		for(int a=2;a<=100;a++)
			if(a==2 || a==3 || a==5 || a==7) {
				System.out.println(a);}
			else if(a%2==0 || a%3==0 || a%5==0 || a%7==0)
		{   System.out.print("");}
		else
			 System.out.println(a);
	}}



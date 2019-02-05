package practice;

import java.util.Scanner;

public class Pallidrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int num=n;
		int r,a=0,temp=0;
		while(n>0) {
			n=n/10;
			a++;
			
		} n=num;
		while(n>0) {
			r=n%10;
			n=n/10;
			temp=temp+ (int)Math.pow(10, a-1)*r;
			a--;
		}
		if(num==temp)
			System.out.println("pallidrome");
		else
			System.out.println("not pallidrome");
		s.close();}}
     
	

	
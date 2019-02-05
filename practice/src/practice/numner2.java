package practice;
import java.util.Scanner;

public class numner2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
	int x;
	for(int i=1;i<=n;i++)
	{	x=97;
	for(int k=n-1;k>=i;k--)
	System.out.print(" ");
	for(int j=1;j<=i;j++)
	{  System.out.print((char)x);
	    x++;
	}
for(int t=2;t<=i;t++)
	{   x=x-2;
	System.out.print((char)x);
	x++;
	}
	
	System.out.println(" ");
	s.close();
}}}



package practice;

public class Ruff {

	public static void main(String[] args) {
		int x;
		for(int i=1;i<=5;i++)
		{	x=97;
		
	 if(i<=3)
		{
		for(int k=2;k>=i;k--)
		{
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{  System.out.print((char)x);
		    x++;
		}

		for(int t=2;t<=i;t++)
		
		{   x=x-2;
		System.out.print((char)x);
		x++;
		}
		}

		else
		{ x=97;
	for(int k=4;k<=i;k++)
	{
		System.out.print(" ");
	}
	
	
	for(int j=i;j<=5;j++)
	{System.out.print((char)x);
	x++;
	}  
	;

	for(int t=i;t<=4;t++)
		
	{   x=x-2;
	System.out.print((char)x);
	 
	}

	}
		System.out.println(" ");}}

	}



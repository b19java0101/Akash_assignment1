package practice;

public class LetterN {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for( i=1;i<=5;i++) 
		{   if(i<2) {
			for(j=1;j<=5;j++)	
			{  if(j==1 || j==5)
           System.out.print("*");
			else
				System.out.print(" ");}}
		 if(i==2) {
			for(j=1;j<=5;j++)	
			{  if(j==1||j==2||j==5)
           System.out.print("*");
			else
				System.out.print(" ");}}
		 if(i==3) {
			 for(j=1;j<=5;j++)	
				{  if(j==1||j==3||j==5)
	           System.out.print("*");
				else
					System.out.print(" ");}}
			  
		if(i==4) {
			for(j=1;j<=5;j++)	
			{  if(j==1||j==4||j==5)
           System.out.print("*");
			else
				System.out.print(" ");}}
		 if(i==5) {
				for(j=1;j<=5;j++)	
				{  if(j==1 || j==5)
	           System.out.print("*");
				else
					System.out.print(" ");}}
	
	System.out.println(" ");}}}
		
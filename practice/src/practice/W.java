package practice;

public class W {

	public static void main(String[] args) {
    int i,j;
   for(i=1;i<=3;i++) {
	   if(i==1) {
		   for(j=1;j<=7;j++) 
		   {  if(j==1||j==7)
		   { System.out.print("*");	   }
			   else
		  System.out.print(" ");}}
		   if(i==2) {
			   for(j=1;j<=7;j++) {
				   if(j==2||j==4||j==6)
			   { System.out.print("*");	   }
				   else
			System.out.print(" ");}}
		   if(i==3) {
			   for(j=1;j<=7;j++) {
				   if(j==3||j==5)
			   { System.out.print("*");	   }
				   else
			System.out.print(" ");}}
System.out.println(" ");}}}

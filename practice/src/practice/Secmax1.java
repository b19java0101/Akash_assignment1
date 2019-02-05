package practice;

import java.util.Scanner;

public class Secmax1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number of elements ");
int row=s.nextInt();
int secmax,max,i;
int[]arr=new int[row];  
for (i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
max=arr[0];
for (i=0;i<arr.length;i++) 
if(arr[i]>max) {
	max=arr[i]; 
}
secmax=arr[0];
for (i=0;i<arr.length;i++) 
if(arr[i]>secmax && arr[i]<max) {
	secmax=arr[i]; 
}
	
System.out.println("max="+max);
System.out.println("secmax="+secmax);
s.close();
	}
	

}

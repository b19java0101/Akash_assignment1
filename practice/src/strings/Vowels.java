package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vowels {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter a string");
     String s=br.readLine();
     s=s.toLowerCase();
        int i;
        int count=0;
        int count1=0;
     
     char[] arr=new char[s.length()];
     char arr1[]=new char[s.length()];
     for(i=0;i<s.length();i++) {
    	 
    	 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
    		arr[count]=s.charAt(i);
    		 count++;
    		
    	 }
    	 else {
    		 arr1[count1]=s.charAt(i);
    		 count1++;
    		 
    	 }}
    	System.out.println("vowels are");
    	 for(i=0;i<count;i++) {
    		 System.out.println(arr[i]);
    		
    	 }
    	 System.out.println("consonants are");
    	 for(i=0;i<count1;i++) {
    		 System.out.println(arr1[i]);
    		 
    	 }
    	 
     }
	}



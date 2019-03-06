package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringPallindrome {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     System.out.println("Enter a string");
	     String s=br.readLine();
	     String s1="";
	     s=s.toLowerCase();
	     int i;
	    // String l=new string[s.length()];
	   //  char arr[]=new char[s.length()];
	     for(i=s.length()-1;i>=0;i--) {
	    	//arr[i]=s.charAt(i);
	    	//s1+=arr[i];
	    	s1+=s.charAt(i); 
	     }
	     System.out.println(s.equals(s1));
	     
	     System.out.println(s1);

	}

}

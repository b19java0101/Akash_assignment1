package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class subString {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        System.out.println("Enter a word to search");
        String s1=br.readLine();
        String s2="";
        int i,j=0,z;
        boolean flag=false;
        for(i=0;i<=s.length()-1;i++) {
        	s2="";
          if(s.charAt(i)==' '||i==s.length()-1)
          {
        		if(i==s.length()-1) {               //note
        			i=i+1;
        		}
        		for(z=j;z<i;z++) {
        			
        	    	s2+=s.charAt(z);
        	    	  } 
        		//s2=s.substring(j, i);
        		 if(s1.equals(s2)) {
        		  flag=true; 
        		  break;}
        		 else {
        		flag=false;
        		}
        		 j=i+1;
        	}
              
              }
        if(flag==true)
        	System.out.println("found");
        else
        	System.out.println("not found");
	}

}

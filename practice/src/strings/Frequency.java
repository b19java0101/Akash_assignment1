package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frequency {

	public static void main(String[] args) throws IOException {
		char a[]= {'0','1','2','3','4','5','6','7','8','9'};
		int i,j,count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your mobile no"); 
		String s=br.readLine();
         for(i=0;i<a.length;i++) {
        	 for(j=0;j<s.length();j++) {
        		 if(a[i]==s.charAt(j)) {
        			 count+=1;
        		 }
        		 
        	 }
        	 System.out.println("freq of "+ " " + i + " " + "is "+count+" times" );
        	 count=0;
         }
	}

}

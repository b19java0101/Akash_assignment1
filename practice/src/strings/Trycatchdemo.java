package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trycatchdemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("enter first no=");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		System.out.println("enter second no=");
		int b=Integer.parseInt(br.readLine());
		int c=0;
/*try {
	c=a/b;
}
catch(ArithmeticException e){
	System.out.println(e);
}*/
		c=a/b;
System.out.println(c);
	}

}

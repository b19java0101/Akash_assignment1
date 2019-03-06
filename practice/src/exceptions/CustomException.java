package exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InvalidAmtException extends Exception
{
    InvalidAmtException(String s)
    {
        super(s);
    }
}


public class CustomException {

public static void main(String[] args) {
        
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("Enter the Amt");
double a= Double.parseDouble(br.readLine());
if(a<10000 || a>12000)
    throw new InvalidAmtException("Gareeb");
}
catch(InvalidAmtException e)
{
    e.printStackTrace();
}
catch(IOException e1)
{
    
}
    System.out.println("hello");

}

}
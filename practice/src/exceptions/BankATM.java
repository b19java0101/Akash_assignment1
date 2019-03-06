package exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InvalidAmountException extends Exception
{
    InvalidAmountException(String s)
    {
        super(s);
    }
}

public class BankATM {
static double atmpin=1234;
static double balance=50000;
static double ave=1000;
static double amt;
double bal;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
void withdraw() throws NumberFormatException, IOException {
	System.out.println("enter withdrwal money=");
	amt=Double.parseDouble(br.readLine());	
}
void deposit(double amt){
	System.out.println("ur amount is deposited");
}

void balance_enquiry() {
	bal=balance-amt;
	System.out.println("your balance is"+" "+bal);
}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter ur atm pin=");
		int a=Integer.parseInt(br.readLine());
		if(a==atmpin) {	
			try {
			BankATM b=new BankATM();
			b.withdraw();
			if(amt>balance) {
			throw new InvalidAmountException("Amount is invalid");
			}
			else if(amt<=ave) {
				throw new InvalidAmountException("Amount is less than average balance");	
			}
			else {
				System.out.println("Amount is deducted");
				b.balance_enquiry();
			}
			}
	catch(InvalidAmountException e)
		{
		    System.out.println(e);
		}
			catch(IOException e)
			{
			    
			}
		}
		else {
			System.out.println("atm pin is incorrect");
		}
	}}
	


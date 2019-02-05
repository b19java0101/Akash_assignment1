package assignment1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManageEmployee {
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choice=1,no_of_leaves;
		char leaveType;
		
		//Parent's reference can hold child's object
		/*A a1=new A();
		or
		A a1; 
		a1=new A();
		*/
		
	permanentEmp p=new permanentEmp();	
			do
		{
			System.out.println("Enter 1 if you want to print leave details");
			System.out.println("Enter 2 if you want to check balance leave");
			System.out.println("Enter 3 if you want to avail leave ");
			System.out.println("Enter 4 if you want to calculate salary");
			System.out.println("Enter 5 if you want to exit");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
					p.print_leave_details();
					break;
			case 2:
				p.calculate_balance_leaves();
				break;
			case 3:
				System.out.println("Please enter the number of leaves=");
				no_of_leaves=Integer.parseInt(br.readLine());
				System.out.println("Please enter the type of leave");
				leaveType=br.readLine().charAt(0);
				boolean flag=p.avail_leave(no_of_leaves,leaveType);
				if(flag==true)
				{
					System.out.println("leave Granted!!");
				}
				else
				{
					System.out.println("Sorry leave balance not available");
				}
				break;
			case 4:
				p.calculate_salary();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("please enter right choice\n\n");
			}
		}while(choice!=5);
		
		//TemporaryEmp t=new TemporaryEmp();
		
	}

}




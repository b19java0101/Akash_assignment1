package assignment1;

import java.io.IOException;

public class permanentEmp extends Employee {
	int paid_leave=5,sick_leave=3,casual_leave=2;
	double basic,hra,pfa;
  boolean flag;
 permanentEmp() throws IOException {
	 System.out.println("pls enter your basic salary");
	 basic=Double.parseDouble(br.readLine());
 }
void print_leave_details() {
	System.out.println("your paid leaves are="+paid_leave);
	System.out.println("your sick leaves are="+sick_leave);
	System.out.println("your casual leaves are="+casual_leave);
}
void calculate_balance_leaves() {
	total_leaves=total_leaves+paid_leave+sick_leave+casual_leave;
	System.out.println(total_leaves);
}
boolean avail_leave(int no_of_leaves,char type_of_leave) {
	if(type_of_leave=='p') 
	{	
		
		if(no_of_leaves<=paid_leave)
		{
			flag=true;
			paid_leave=paid_leave-no_of_leaves;
		}
		else 
		{
			flag=false;
		}
		
	}
	else if(type_of_leave=='s') 
	{	
		
		if(no_of_leaves<=sick_leave)
		{
			flag=true;
			sick_leave=sick_leave-no_of_leaves;
		}
		else 
		{
			flag=false;
		}
		
	}
	else if(type_of_leave=='c') 
	{	
		
		if(no_of_leaves<=casual_leave)
		{
			flag=true;
			casual_leave=casual_leave-no_of_leaves;
		}
		else 
		{
			flag=false;
		}
	}
	
	return flag;
}
void calculate_salary()
{
	pfa = (12/100)*basic;
	hra = (50/100)*basic;
	total_salary=basic+hra-pfa;
System.out.println(total_salary);

}}
	

	






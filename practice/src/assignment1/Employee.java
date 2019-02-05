package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	int empId;
	String empName;
	int total_leaves=15;
	double total_salary;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Employee() throws IOException{
		System.out.println("enter your id=");
		empId=Integer.parseInt(br.readLine());
		System.out.println("enter your name=");
		empName=br.readLine();
		
	}
	
	void calculate_balance_leaves() {
	
	}
	boolean avail_leave(int no_of_leaves,char type_of_leave) {
		return false;
		
	}
	void calculate_salary() {
		
	}}

	


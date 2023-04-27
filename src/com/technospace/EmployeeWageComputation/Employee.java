package com.technospace.EmployeeWageComputation;

import java.util.Random;

public class Employee {

	public static void main(String[] args) {
		
		//Welcome message for user
System.out.println("Welcome to Employee Wage Computation Program");
		
		int attendance ;
		final int IS_ABSENT=0;
		
		//Use Random class for Attendance check
		
		Random random=new Random();
		attendance=random.nextInt(2);
		
		System.out.println("Attendance=" +attendance);
		
		if(attendance == IS_ABSENT) {
			System.out.println("Employee is Absent");
		} else {
			System.out.println("Employee is Present");
		}
	}

}

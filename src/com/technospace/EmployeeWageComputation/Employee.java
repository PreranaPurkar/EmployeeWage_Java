package com.technospace.EmployeeWageComputation;

import java.util.Random;

public class Employee {

	public static void main(String[] args) {
		
		//Welcome message for user
System.out.println("Welcome to Employee Wage Computation Program");
		
		int attendance ;
		int daily_Wage=0;
		int empType;
		int monthly_Wage=0;
		int day=1;
		int total_hr=0;
		
		
		//Use Random class for Attendance check
		
		Random random=new Random();
		
		while(day != 21 && total_hr < 100){
		System.out.println("Day= "+day+ "     Total Hr= "+total_hr);	
		
		daily_Wage=0;
		
		attendance=random.nextInt(2);
		
		System.out.println("Attendance=" +attendance);
		
		if(attendance == Constants.IS_ABSENT) {
			System.out.println("Employee is Absent");
			} 
		else {
			System.out.println("Employee is Present");
			empType=random.nextInt(2);
			//Use Switch case for find the employee is Full time or Part time
			
			switch(empType){
			case Constants.IS_PART_TIME:
				System.out.println("Employee is Part Time");
				daily_Wage = Constants. WAGE_PER_HR * Constants.PART_TIME_HR;
				break;
				
			case Constants.IS_FULL_TIME:
				System.out.println("Employee is Full Time");
				daily_Wage = Constants.WAGE_PER_HR *Constants. FULL_TIME_HR;
				break;
			}
					
			}
		System.out.println("Daily Wage= "+daily_Wage);
		//Find the Monthly Wage
		
		monthly_Wage = monthly_Wage + daily_Wage;
		System.out.println("####################################");
		day++;
		
		}
		System.out.println("Total Monhtly Wage= "+monthly_Wage);		// Find the Daily wage of present Employee
	}

}

package com.technospace.EmployeeWageComputation;

import java.util.Random;

public class Employee {
	int attendance ;
	int daily_Wage=0;
	int empType;
	int monthly_Wage=0;
	int day=1;
	int total_hr=0;
	int wage_per_hr;
	int total_days;
	int total_working_hr;
	
	//Use Random class for Attendance check
	Random random=new Random();
	//Use class method to Compute Employee Wage
	
	public void calculateWage(String company,int wage_per_hr,int total_days,int total_working_hr){
		this.wage_per_hr=wage_per_hr;
		this.total_days=total_days;
		this.total_working_hr=total_working_hr;
		
		System.out.println("Company Name ="+company);
		System.out.println("Wage per Hour= "+wage_per_hr);
		System.out.println("Monthly total Days= "+total_days);
		System.out.println("Total Working Hr= "+total_working_hr);
		while(day != total_days && total_hr < total_working_hr){
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
					daily_Wage = wage_per_hr * Constants.PART_TIME_HR;
					total_hr=total_hr+Constants.PART_TIME_HR;
					break;
					
				case Constants.IS_FULL_TIME:
					System.out.println("Employee is Full Time");
					daily_Wage = wage_per_hr *Constants. FULL_TIME_HR;
					total_hr=total_hr+Constants.FULL_TIME_HR;
					break;
				}
						
			}
			System.out.println("Daily Wage= "+daily_Wage);
			//Find the Monthly Wage
			
			monthly_Wage = monthly_Wage + daily_Wage;
			System.out.println("####################################");
			day++;
			
			}
		System.out.println("Total Monhtly Wage= "+monthly_Wage);
	}
	
	public static void main(String[] args) {
		
		//Welcome message for user
		System.out.println("Welcome to Employee Wage Computation Program");
		
		Employee employee=new Employee();
		employee.calculateWage("TCS",22,28,125);
		Employee employee2=new Employee();
		employee2.calculateWage("Infosys",24,20,145);
		}
		
	
	}

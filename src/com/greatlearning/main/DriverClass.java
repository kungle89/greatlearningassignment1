package com.greatlearning.main;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.TechDepartment;


public class DriverClass {
	
	public static void main(String[] args)
	{
		
		String strWelcome = "Welcome to ";
		
		
		AdminDepartment admindepartment=new AdminDepartment();
		
		System.out.println(strWelcome + admindepartment.departmentName());
		System.out.println(admindepartment.getTodaysWork());
		System.out.println(admindepartment.getWorkDeadline());
		System.out.println(admindepartment.isTodayAHoliday());
		System.out.println();
		System.out.println();

		
		

		HrDepartment hrdepartment=new HrDepartment();
		
		System.out.println(strWelcome + hrdepartment.departmentName());
		System.out.println(hrdepartment.doActivity());
		System.out.println(hrdepartment.getTodaysWork());
		System.out.println(hrdepartment.getWorkDeadline());
		System.out.println(hrdepartment.isTodayAHoliday());
		System.out.println();
		System.out.println();

		
		
		TechDepartment techdepartment=new TechDepartment();
		
		System.out.println(strWelcome + techdepartment.departmentName());
		System.out.println(techdepartment.getTodaysWork());
		System.out.println(techdepartment.getWorkDeadline());
		System.out.println(techdepartment.doActivity());
		System.out.println(techdepartment.isTodayAHoliday());
		System.out.println();
		System.out.println();


	
	}
}
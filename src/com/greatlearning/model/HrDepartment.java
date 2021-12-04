package com.greatlearning.model;

public class HrDepartment extends SuperDepartment {
	
public String str;
	
	public String getStr() { return str; } 
	public void setStr(String str) {
		this.str = str; 
	}
	
	
	public String departmentName() {
		this.setStr("HR Department");
		return this.getStr();
		
	}
	
	public String getTodaysWork() {
		this.setStr("Fill today's worksheet and mark your attendance");
		return this.getStr();
	}
	
	public String getWorkDeadline() {
		this.setStr("Complete by EOD");
		return this.getStr();
	}

	public String doActivity() {
		this.setStr("team Lunch");
		return this.getStr();
	}

}

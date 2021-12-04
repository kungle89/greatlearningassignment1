package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {
	
		
		public String str;
		
		public String getStr() { return str; } 
		public void setStr(String str) {
			this.str = str; 
		}
		
		
		public String departmentName() {
			this.setStr("Admin Department");
			return this.getStr();
			
		}
		
		public String getTodaysWork() {
			this.setStr("Complete your documents Submission");
			return this.getStr();
		}
		
		public String getWorkDeadline() {
			this.setStr("Complete by EOD");
			return this.getStr();
		}
	}



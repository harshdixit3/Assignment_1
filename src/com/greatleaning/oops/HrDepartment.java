package com.greatleaning.oops;
//HrDEpartment inherited SuperDepartment
public class HrDepartment extends SuperDepartment {

	String departmentName() {
		System.out.println("Welcome to Hr Department");
		return null;
	}

	String getTodaysWork() {
		System.out.println("Fill today�s timesheet and mark your attendance");
		return null;

	}

	String getWorkDeadline() {
		System.out.println("Complete by EOD");
		return null;
	}

	String doActivity() {
		System.out.println("team Lunch");
		return null;

	}

}

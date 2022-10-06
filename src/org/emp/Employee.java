package org.emp;

public class Employee {
	public void empId() {
		System.out.println("My empId is : 001");
	}
	public void empName() {
		System.out.println("My empName is : Prasanth");
	}
	public void empDob() {
		System.out.println("My empDob is : 30/07/1992");	
	}
	public void empPhone() {
		System.out.println("My empPhone is : 7397489065");
	}
	public void empEmail() {
		System.out.println("My empEmail is : Prasanthraj095@gmail.com");
	}
	public void empAddress() {
		System.out.println("My empAddress is : Chennai");
	}
	public static void main(String[] args) {
	Employee call = new Employee();
	call.empId();
	call.empName();
	call.empDob();
	call.empPhone();
	call.empEmail();
	call.empAddress();
	}
}

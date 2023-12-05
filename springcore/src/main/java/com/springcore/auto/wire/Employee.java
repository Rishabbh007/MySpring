package com.springcore.auto.wire;

public class Employee {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("inside setter");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Address address) {
		
		super();
		System.out.println("Inside Constructor !!");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	

}

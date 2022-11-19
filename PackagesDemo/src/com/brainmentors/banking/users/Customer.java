package com.brainmentors.banking.users;

public class Customer {
	
	public String name;
	int age;
	protected String email;
	protected int acc_no;
	private double balance;
	
	public Customer() {
		
	}
	
	public Customer(String name, int age, String email, int acc_no, double balance) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.acc_no = acc_no;
		this.balance = balance;
	}
	
	public void showCustomer() {
		System.out.println("Name is : " + this.name);
		System.out.println("Email is : " + this.email);
		System.out.println("Acc No : " + this.acc_no);
	}

	public static void main(String[] args) {
		

	}

}

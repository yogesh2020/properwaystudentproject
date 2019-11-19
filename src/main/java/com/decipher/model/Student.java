package com.decipher.model;

public class Student 
{

	private String Username;
	private String Address;
	private int rollNumber;
	private String phone;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		this.Username = username;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	  @Override public String toString() { return "Student [name=" + Username +
	  ", address=" + Address + ", rollNumber=" + rollNumber + "]"; }
	 
}

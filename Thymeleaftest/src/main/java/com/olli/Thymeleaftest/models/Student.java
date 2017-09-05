package com.olli.Thymeleaftest.models;

public class Student {
	long index;
	String firstName;
	String lastName;
	String email;
	
	public Student(long index, String firstName, String lastName, String email) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public long getIndex() {
		return index;
	}
	
	public void setIndex(long index) {
		index = this.index;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		firstName = this.firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		lastName = this.lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		email = this.email;
	}
}

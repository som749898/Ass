package com.assessment2.springboot.assessment2.user;

import org.hibernate.validator.constraints.Length;

import java.persistence.Column;
import java.persistence.Entity;
import java.persistence.GeneratedValue;
import java.persistence.GenerationType;
import java.persistence.Id;
import java.persistence.Table;

@Entity
@Table(name = "userdetails")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(unique = true)
	private String userName;
	private String firstName;
	private String lastName;
	private String fullName;
	@Length(max = 12)
	private long aadharNumber;
	public User(int userId, String userName, String firstName, String lastName, String fullName, long aadharNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
		this.aadharNumber = aadharNumber;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		this.fullName = firstName + " " + lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", fullName=" + fullName + ", aadharNumber=" + aadharNumber + "]";
	}
	
	
}

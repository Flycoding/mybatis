package com.flyingh.mybatis.vo;

import java.util.Date;

public class Student {
	private Integer studId;
	private String name;
	private String email;
	private Date dob;
	private Address address;

	public Student() {
		super();
	}

	public Student(String name, String email, Date dob) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	public Student(Integer studId, String name, String email, Date dob) {
		super();
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", email=" + email + ", dob=" + String.format("%tF %<tT", dob) + ", address="
				+ address + "]";
	}

}

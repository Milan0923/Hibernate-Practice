package com.Hibernate.Pojo;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@Column
	@GeneratedValue	
	private int empId;
	
	@Column
	private String empName;
	
	@Column
	private Date joinDate;
	
	@ManyToMany
	@JoinTable(name = "ClientCode",
	joinColumns = {@JoinColumn(name = "empId")},
	inverseJoinColumns = {@JoinColumn(name = "meetingId")})
	private Set<Meeting> meeting;

	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Set<Meeting> getMeeting() {
		return meeting;
	}

	public void setMeeting(Set<Meeting> meeting) {
		this.meeting = meeting;
	}

	public Employee(int empId, String empName, Date joinDate, Set<Meeting> meeting) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.joinDate = joinDate;
		this.meeting = meeting;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", joinDate=" + joinDate + ", meeting=" + meeting
				+ "]";
	}

	

	
	
	
}
package Pojo.Hibernate.com;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionId;

@Entity
public class PojoClass {

	@Id
	@Column
	private int empId;
	@Column(length = 20)
	private String empName;
	@Column
	private double empSalary;
	@Column
	private Date joinDate;
	@Embedded
	private Address resAddress;
	@Override
	public String toString() {
		return "PojoClass [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", joinDate="
				+ joinDate + ", resAddress=" + resAddress + "]";
	}
	public PojoClass(int empId, String empName, double empSalary, Date joinDate, Address resAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.joinDate = joinDate;
		this.resAddress = resAddress;
	}
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
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Address getResAddress() {
		return resAddress;
	}
	public void setResAddress(Address resAddress) {
		this.resAddress = resAddress;
	}
	
	
	}

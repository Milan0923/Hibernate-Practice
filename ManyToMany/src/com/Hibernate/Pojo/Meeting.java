package com.Hibernate.Pojo;

import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity

public class Meeting {

	@Id
	@Column
	@GeneratedValue
		
	private int meetingId;
	
	@Column
	private String agenda;
	
	@Column
	private Date MeetiingDate;
	
	@Column
	private LocalTime meetingTime;
	
	@ManyToMany(mappedBy = "meeting")
	private Set<Employee> employee;

	public int getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public Date getMeetiingDate() {
		return MeetiingDate;
	}

	public void setMeetiingDate(Date meetiingDate) {
		MeetiingDate = meetiingDate;
	}

	public LocalTime getMeetingTime() {
		return meetingTime;
	}

	public void setMeetingTime(LocalTime meetingTime) {
		this.meetingTime = meetingTime;
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Meeting [meetingId=" + meetingId + ", agenda=" + agenda + ", MeetiingDate=" + MeetiingDate
				+ ", meetingTime=" + meetingTime + ", employee=" + employee + "]";
	}

	public Meeting(int meetingId, String agenda, Date meetiingDate, LocalTime meetingTime, Set<Employee> employee) {
		super();
		this.meetingId = meetingId;
		this.agenda = agenda;
		MeetiingDate = meetiingDate;
		this.meetingTime = meetingTime;
		this.employee = employee;
	}

	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

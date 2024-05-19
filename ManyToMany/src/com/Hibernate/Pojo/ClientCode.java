package com.Hibernate.Pojo;

import java.sql.Date;
import java.time.LocalTime;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ClientCode {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.obtainSessionFactory();

		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();
		
		Employee emp1 = new Employee();
		emp1.setEmpId(212);
		emp1.setEmpName("Milan");
		emp1.setJoinDate(Date.valueOf("2024-01-10"));
		
		HashSet<Employee> hs1 = new HashSet<Employee>();
		hs1.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setEmpId(213);
		emp2.setEmpName("Shivam");
		emp2.setJoinDate(Date.valueOf("2024-01-11"));

		HashSet<Employee> hs2 = new HashSet<Employee>();
		hs2.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setEmpId(214);
		emp3.setEmpName("Ritik");
		emp3.setJoinDate(Date.valueOf("2024-01-12"));
		
		HashSet<Employee> hs3 = new HashSet<Employee>();
		hs3.add(emp3);
		
		Meeting mt1 = new Meeting();
		mt1.setMeetingId(2211);
		mt1.setAgenda("Chai pena hai??");
		mt1.setMeetiingDate(Date.valueOf("2024-01-08"));
		mt1.setMeetingTime(LocalTime.of(13, 15));
		
		mt1.setEmployee(hs2);
		session.save(mt1);
		mt1.setEmployee(hs2);
		session.save(mt1);
		
		
		Meeting mt2 = new Meeting();
		mt2.setMeetingId(2212);
		mt2.setAgenda("Class karna hai??");
		mt2.setMeetiingDate(Date.valueOf("2024-01-09"));
		mt2.setMeetingTime(LocalTime.of(13, 30));
		
		mt2.setEmployee(hs2);
		session.save(mt2);
		mt2.setEmployee(hs2);
		session.save(mt2);
		
		Meeting mt3 = new Meeting();
		mt3.setMeetingId(2213);
		mt3.setAgenda("Ye meeting kyu karna hai??");
		mt3.setMeetiingDate(Date.valueOf("2024-01-08"));
		mt3.setMeetingTime(LocalTime.of(14, 00));
		
		mt3.setEmployee(hs1);
		session.save(mt3);
		mt3.setEmployee(hs2);
		session.save(mt3);
		mt3.setEmployee(hs3);
		session.save(mt3);
		
		Meeting mt4 = new Meeting();
		mt4.setMeetingId(2214);
		mt4.setAgenda("To Chale fir??");
		mt4.setMeetiingDate(Date.valueOf("2024-01-12"));
		mt4.setMeetingTime(LocalTime.of(10, 30));
		
		mt4.setEmployee(hs2);
		session.save(mt4);
		mt4.setEmployee(hs2);
		session.save(mt4);
		
		Meeting mt5 = new Meeting();
		mt5.setMeetingId(2215);
		mt5.setAgenda("Kaha chalna hai??");
		mt5.setMeetiingDate(Date.valueOf("2024-01-10"));
		mt5.setMeetingTime(LocalTime.of(11, 30));
		
		mt5.setEmployee(hs3);
		session.save(mt5);
		mt5.setEmployee(hs3);
		session.save(mt5);
		
		
		Meeting mt6 = new Meeting();
		mt6.setMeetingId(2216);
		mt6.setAgenda("juice Peene??");
		mt6.setMeetiingDate(Date.valueOf("2024-01-09"));
		mt6.setMeetingTime(LocalTime.of(13, 00));
		
		mt6.setEmployee(hs3);
		session.save(mt6);
		mt6.setEmployee(hs3);
		session.save(mt6);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
			 
		txn.commit();
	}
}

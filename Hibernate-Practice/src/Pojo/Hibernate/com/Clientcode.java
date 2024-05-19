package Pojo.Hibernate.com;

import java.sql.Date;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;
import org.hibernate.service.ServiceRegistry;

import  Pojo.Hibernate.com.Clientcode;

public class Clientcode {


	public static void main(String[] args) {
		try {
			Configuration config=new Configuration().configure();
			ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			SessionFactory factory=config.buildSessionFactory(registry);
			Session session = factory.getCurrentSession();
			Transaction txn = session.beginTransaction();
			
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter Employee Id=");
//			int eid=sc.nextInt();
//			
//			System.out.println("Enter Employee Name=");
//			String enm=sc.next();
//			
//			System.out.println("Enter Employee Salary=");
//			double esal=sc.nextDouble();
//			
//			System.out.println("Enter Joining Date[yyyy-MM-dd]=");
//			Date dt=Date.valueOf(sc.next());
//			
			
			Address ad= new Address("Laxmi Chowk", "Pune", "MH", 375485);
			PojoClass emp=new PojoClass(123,"Swapnil",874785,Date.valueOf("2023-06-04"), ad);
			session.save(emp);
			System.out.println("Saved!");
			
			txn.commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
}




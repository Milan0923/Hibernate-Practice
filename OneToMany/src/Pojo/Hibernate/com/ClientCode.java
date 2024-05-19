package Pojo.Hibernate.com;

import java.sql.Date;
import java.util.Set;
import java.util.TreeSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import Pojo.Hibernate.com.Director;
import Pojo.Hibernate.com.Movie;
import Pojo.Hibernate.com.HibernateUtility;

public class ClientCode {

public static void main(String[] args) {
		

		SessionFactory factory = HibernateUtility.obtainSessionFactory();

		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();

		//create department object & save it
		Director dir1 = new Director();
		dir1.setDirectorId(1);
		dir1.setDirectorName("raju");
		  session.save(dir1);
		  
		  Director dir2 = new Director();
		  dir2.setDirectorId(2);
			dir2.setDirectorName("baburao");
			  session.save(dir2);
		      
			  Movie m1 = new Movie("hero",Date.valueOf("2021-11-01"),500.00,dir1);
			  Movie m2 = new Movie("dar",Date.valueOf("2023-12-01"),500.00,dir1);
			  
			  Movie m3 = new Movie("zanjeer",Date.valueOf("2025-6-01"),500.00,dir1);
			  Movie m4 = new Movie("kaho na",Date.valueOf("2027-2-01"),500.00,dir2);
			  Movie m5 = new Movie("pyaar",Date.valueOf("2025-9-01"),500.00,dir2);
			  Movie m6 = new Movie("hai",Date.valueOf("2023-1-01"),500.00,dir2);
			  
			  session.save(m1); 
			  session.save(m2);	  
			  session.save(m3);	
			  session.save(m4);	
			  session.save(m5);	
			  session.save(m6);	
			  
			  
			  txn.commit();
		
		
	}
}

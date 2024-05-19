package com.Hibernate.seed;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class ClientCode {

	public static void main(String[] args) {
		
		try {
			Configuration config=new Configuration().configure();
			ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			SessionFactory factory=config.buildSessionFactory(registry);
			Session session = factory.getCurrentSession();
			Transaction txn = (Transaction) session.beginTransaction();
			
			Batsman plr1=new Batsman(45,"Rohit","India","245",10674); 
			Bowler plr2=new Bowler(99, "Ashwin", "India",309,457);
			
			session.save(plr1);
			session.save(plr2);	
			txn.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

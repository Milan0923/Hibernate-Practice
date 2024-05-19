package com.Hibernate.seed;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ClientCode1 {

public static void main(String[] args) {
		
//		try {
//			Configuration config=new Configuration().configure();
//			ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
//			SessionFactory factory=config.buildSessionFactory(registry);
//			Session session = factory.getCurrentSession();
//			Transaction txn = (Transaction) session.beginTransaction();
//			
//			Batsmans plr1=new Batsmans(45,"Rohit","India",245,10674); 
//			Bowlers plr2=new Bowlers(99, "Ashwin", "India",309,457);
//			
//			session.save(plr1);
//			session.save(plr2);	
//			txn.commit();
//		} catch (HibernateException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	try {
		Configuration config=new Configuration().configure();
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory factory=config.buildSessionFactory(registry);
		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();
	
		int payerid=45;
		Players plr=(Players) session.get(Players.class,payerid);
		
		if(plr!=null){
			System.out.println("Players Id="+plr.getPayerId());
			System.out.println("Players Name="+plr.getPlayerName());
			System.out.println("Players country="+plr.getCountry());
			System.out.println("no. of matches="+plr.getNumMatches());
			if(plr instanceof Batsmans)
			{
				Batsmans e=(Batsmans) plr;
				System.out.println("Dept="+e.getNumRuns());
			}
			if(plr instanceof Bowlers)
			{
				Bowlers e=(Bowlers) plr;
				System.out.println("Contractor Name="+e.getNumWickets());
			}
			
		}
		else
		{
			System.out.println("Record Not Found");
		}
		txn.commit();
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
	
	}

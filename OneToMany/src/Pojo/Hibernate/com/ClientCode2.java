package Pojo.Hibernate.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Pojo.Hibernate.com.Director;
import Pojo.Hibernate.com.Movie;
import Pojo.Hibernate.com.HibernateUtility;

import oracle.jdbc.proxy.annotation.GetCreator;

public class ClientCode2 {

public static void main(String[] args) {
		

		SessionFactory factory = HibernateUtility.obtainSessionFactory();

		Session session = factory.getCurrentSession();
		Transaction txn = session.beginTransaction();

		//create department object & save it
//		Director dir1 = new Director();
//		dir1.setDirectorId(1);
//		dir1.setDirectorName("raju");
//		  session.save(dir1);
//		  
//		  Director dir2 = new Director();
//		  dir2.setDirectorId(2);
//			dir2.setDirectorName("baburao");
//			  session.save(dir2);
			  
			  
				 //print employee details based on movie id 
			  int movieno = 1;
				Director dir= (Director) session.get(Director.class,movieno);
				if(dir !=null){
						System.out.println("Director Name="+dir.getDirectorName());
						System.out.println("Movie List");
						//using for-each loop				
					for (Movie e: dir.getMovie()) {
						
						System.out.println(e.getMovieId()+" " +e.getMovieName() +" "+e.getReleaseDate());	
					}
				}
				else
				{
					System.out.println("Movie not found!!");
				}
				
				  txn.commit();
				
	}
}

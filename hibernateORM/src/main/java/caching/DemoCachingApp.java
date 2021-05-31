package caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

public class DemoCachingApp {
	public static void main(String[] args) {
		Alien alien1 = new Alien();
		alien1.setAlienId(101);
		alien1.setaName("joshua");
		alien1.setColor("jade");

		//addAnnotatedClass - to specify which entity we are working with
		Configuration con = new Configuration().configure("hbm_caching.cfg.xml").addAnnotatedClass(Alien.class);
		
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);

		//Session 1 fetches data
		Session session1 = sf.openSession();
		session1.beginTransaction();
		session1.save(alien1);
		Alien a = session1.get(Alien.class,101);
		System.out.println("session 1 output:"+a);
		session1.getTransaction().commit();
		session1.close();

		Session session2 = sf.openSession();		
		session2.beginTransaction();
		Alien b = session2.get(Alien.class,101);
		System.out.println("session 2 output:"+b);
		session2.getTransaction().commit();
		session2.close();
		
		//Use second level cache for user queries
		Session session3 = sf.openSession();		
		session3.beginTransaction();
		Query q3=session3.createQuery("from Alien_Table where alienId=101");
		q3.setCacheable(true);
		Alien a3 = (Alien) q3.uniqueResult();
		System.out.println("session 3 output:"+a3);
		session3.getTransaction().commit();
		session3.close();
	
		Session session4 = sf.openSession();		
		session4.beginTransaction();
		Query q4=session4.createQuery("from Alien_Table where alienId=101");
		q4.setCacheable(true);
		Alien a4 = (Alien) q4.uniqueResult();
		System.out.println("session 4 output:"+a4);
		session4.getTransaction().commit();
		session4.close();
		
		

	}
}

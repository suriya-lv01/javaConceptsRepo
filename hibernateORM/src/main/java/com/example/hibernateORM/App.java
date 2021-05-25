package com.example.hibernateORM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.internal.SessionFactoryServiceRegistryBuilderImpl;

public class App {
	public static void main(String[] args) {
		Alien alien1 = new Alien();
		alien1.setAlienId(101);
		alien1.setaName("joshua");
		alien1.setColor("jade");

		//addAnnotatedClass - to specify which entity we are working with
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
		
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		//Transaction object to comply with ACID
		Transaction tx	=	session.beginTransaction();
		session.save(alien1);
		

		tx.commit();
		
		//Query values from table
		Alien queriedAlien	=	session.get(Alien.class, 101);
		System.out.println(queriedAlien);
		

	}
}

package com.example.hibernateORM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Alien alien1 = new Alien();
		alien1.setAlienId(102);
		alien1.setaName("ryan");
		alien1.setColor("green");

		//addAnnotatedClass - to specify which entity we are working with
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		//Transaction object to comply with ACID
		Transaction tx	=	session.beginTransaction();
		session.save(alien1);
		tx.commit();

	}
}

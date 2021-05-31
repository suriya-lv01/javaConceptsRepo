package hql;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.query.sql.internal.NativeQueryImpl;
import org.hibernate.service.ServiceRegistry;

public class HqlDemoApp {
	public static void main(String[] args) {

		// addAnnotatedClass - to specify which entity we are working with
		Configuration con = new Configuration().configure("hbm_HQL.cfg.xml").addAnnotatedClass(Student.class);

		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();

		Random r = new Random();

		Transaction tx = session.beginTransaction();

		// Code block to create table and insert values
		for (int i = 1; i <= 10; i++) {
			Student student = new Student();
			student.setStudentId(i);
			student.setStudentName("Name " + i);
			student.setStudentMarks(r.nextInt(100));
			session.save(student);
		}

		tx.commit();

		Transaction tx2 = session.beginTransaction();

		// Code block to query details using HQL
		//Type 1 -Query all results
		Query q = session.createQuery("from Student_HQL");
		List<Student> studentList = q.list();
		for (Student s : studentList) {
			System.out.println(s);
		}

		//Type 2 -Query unique row
		Query q2 = session.createQuery("from Student_HQL where studentId=7");
		Student s2 = (Student) q2.uniqueResult();
		System.out.println("Unique Result"+s2);
		
		//Type 3 -Query specific columns
		Query q3 = session.createQuery("select studentId, studentName from Student_HQL");
		List<Object[]> studentsList = q3.list();
		for (Object[] student:studentsList) {
			System.out.println(student[0]+" : "+student[1]);
		}

		//Type 4 -Query specific columns
		Query q4 = session.createQuery("select studentId, studentName from Student_HQL where studentId=7");
		Object[] s4 = (Object[]) q4.uniqueResult();
		for (Object column:s4) {
			System.out.println(column);
		}
			
		//Type 5 - Prepared statement equivalent
//		int requiredId=7;
//		Query q5 = session.createQuery("from Student_HQL where studentId= :reqId");
//		q5.setParameter("reqId", requiredId);
//		Student s5 = (Student) q5.uniqueResult();
//		System.out.println("Unique Result"+s5);
		
		
		
		tx2.commit();



	}
}

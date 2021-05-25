package MappingRelations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class DemoMappingRelations {
	public static void main(String[] args) {

		Laptop l = new Laptop();
		l.setLaptopId(1);
		l.setLaptopName("Dell");

		Student s = new Student();
		s.setStudentId(101);
		s.setStudentName("Roshan");
		s.getStudentLaptop().add(l);

		l.getStudent().add(s);

		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);
		StandardServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session sess = sf.openSession();
		Transaction t = sess.beginTransaction();
		sess.save(l);
		sess.save(s);
		sess.getTransaction().commit();

	}

}

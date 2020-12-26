package onetomanypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class ManytoOneDemo{
	public static void main(String[] args)
	{
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
	
		Transaction t = session.beginTransaction();
		Depart d = new Depart(1000, "Development");
		session.persist(d);
		Empl e1 = new Empl(6001, "Naveen Kumar");
		Empl e2 = new Empl(6002, "kajdfjas");
		session.persist(e1);
		session.persist(e2);
		e1.setDepart(d);
		e2.setDepart(d);
		
		t.commit();
		System.out.println("Saved");
		session.close();
		sf.close();

	}
}
package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class OnetoOneDemo{
	public static void main(String[] args)
	{
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
	
		Transaction t = session.beginTransaction();
		
		Employee e = new Employee(100, "naveen");
		ParkingSpace p = new ParkingSpace(2000,"abcParking");
			
		session.persist(p);
		e.setSpcae(p);
		session.persist(e);
		t.commit();
		System.out.println("Saved");
		session.close();
		sf.close();
		
		
}
	}
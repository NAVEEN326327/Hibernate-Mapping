package bookpack;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class BookApp {

public static void main(String[] args) {
// create configuration object
Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//create session factory
SessionFactory sf = cfg.buildSessionFactory();
Session session = sf.openSession();
Transaction t = session.beginTransaction();

//Book b = new Book(5002,"story",5400);
//session.save(b);// object and method


//System.out.println("book saved ");
Query q = session.createQuery("from Book b order by b.name");

List<Book> books = q.list();

for(Book b : books)
{
	System.out.println(b.getId()+" "+b.getName()+" "+b.getPrice());
}


Book b1 = (Book)session.load(Book.class, 5002); //load throws ObjectNotFoundException
b1.setName("programming");
b1.setPrice(3445.00);
System.out.println("book is updated");

Query q1 = session.createQuery("from Book b order by b.name"); //Book refers to the POJO class
List<Book> books1 = q1.list();
for(Book b: books1)
{
	System.out.println(b.getId()+" "+b.getName()+" "+b.getPrice());
}



t.commit();

sf.close();



}

}
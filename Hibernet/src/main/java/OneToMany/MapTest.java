package OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapTest {
	public static void main(String[] args) {
		 SessionFactory sf = new Configuration().configure("OneToMany/hibernet.cfg.xml").buildSessionFactory();
		 Session session = sf.openSession();   //save method hai isliye
		  Transaction tr = session.beginTransaction();   //permanent change karna hai 
			Employees e1  = new Employees();
			e1.setEmp_id(101);
			e1.setEmp_name("Abhi");
			
			Laptop l1 = new Laptop();
			l1.setLaptop_id(201);
			l1.setLaptop_name("Hp");
			l1.setEmployee(e1);
			
			Laptop l2 = new Laptop();
			l2.setLaptop_id(202);
			l2.setLaptop_name("Asus");
			l2.setEmployee(e1);
			
			List<Laptop> list = new ArrayList();
			list.add(l1);
			list.add(l2);
			
			e1.setLaptop(list);
			
			session.save(e1);
			session.save(l1);
			session.save(l2);
			
			tr.commit();
			session.close();
			
	
	}

}

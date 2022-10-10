package ManyToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure("ManyToMany/hibernet.cfg.xml").buildSessionFactory();
		 Session session = sf.openSession();
		  Transaction tr = session.beginTransaction();
		 
		 Emp e1 = new Emp();
		 e1.setEmpId(101);
		 e1.setEmpName("ABhi");
		 
		 Emp e2 = new Emp();
		 e2.setEmpId(102);
		 e2.setEmpName("Shubham");
		 
		 Project p1 = new Project();
		 p1.setProjectId(201);
		 p1.setProjectName("FoodShop");
		
		 Project p2 = new Project();
		 
		 p2.setProjectId(202);
		 p2.setProjectName("Banking");
		 
		 ArrayList<Emp> eList  = new ArrayList<Emp>();
		 ArrayList<Project> pList = new ArrayList<Project>();
		 
		 eList.add(e1);
		 eList.add(e2);
		 
		 pList.add(p1);
		 pList.add(p2);
		 
		 e1.setProject(pList);
		 p1.setEmp(eList);
		 
 		 session.save(e1);
 		 session.save(e2);
 		 session.save(p1);
 		 session.save(p2);
 		 
 		 tr.commit();
 		 session.close();
 		 
 		
	}

}

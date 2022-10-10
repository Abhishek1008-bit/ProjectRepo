package com.thr.Hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure("com/thr/Hibernet/hibernet.cfg.xml").buildSessionFactory();
	    Session session = factory.openSession();
	    Employee employee =   (Employee)session.get(Employee.class,111);
	    System.out.println(employee);
	          
	          session.close();
	          factory.close();
	}

}

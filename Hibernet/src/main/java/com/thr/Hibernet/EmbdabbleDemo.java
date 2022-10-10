package com.thr.Hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbdabbleDemo {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("com/thr/Hibernet/hibernet.cfg.xml").buildSessionFactory();
    Employee e1 = new Employee();
    e1.setEno(100);
    e1.setEname("Gopal");
    e1.setSalary(10000);
    Certificate c1 = new Certificate();
    c1.setCourseName("Android");
    c1.setCourseDuration("3 months");
    e1.setCerti(c1);
	Session session = factory.openSession();
	    Transaction tt = session.beginTransaction();
	    session.save(e1);
	    tt.commit();
	    session.close();
	    factory.close();
}
}

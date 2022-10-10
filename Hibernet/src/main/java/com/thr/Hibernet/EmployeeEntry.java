package com.thr.Hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class EmployeeEntry 
{
    public static void main( String[] args )
    {
       /*System.out.println( "Project Started..." );
        Configuration config = new Configuration();
        config.configure("hibernet.cfg.xml");*/
        SessionFactory sf  = new Configuration().configure("com/thr/Hibernet/hibernet.cfg.xml").buildSessionFactory();
      
         Session session = sf.openSession();
         Transaction tr = session.beginTransaction();
        
    // creating a employee
        Employee e1=new Employee(); 
        e1.setEno(111); 
        e1.setEname("Manish");
        e1.setSalary(50000); 
        
        Employee e2=new Employee(); 
        e2.setEno(112);
        e2.setEname("Sanjay");
        e2.setSalary(1000);
        
        Employee e3=new Employee(); 
        e3.setEno(113);
        e3.setEname("Sonu");
        e3.setSalary(12000);
        
        Employee e4=new Employee(); 
        e4.setEno(114);
        e4.setEname("Sachin");
        e4.setSalary(13000);
        
       
        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(e4);
        
        tr.commit();
        session.close();
        
        
    }
}

package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapTest {
	public static void main(String[] args) {
		 SessionFactory sf = new Configuration().configure("com/OneToOne/hibernet.cfg.xml").buildSessionFactory();
		 Session session = sf.openSession();   //save method hai isliye
		  Transaction tr = session.beginTransaction();   //permanent change karna hai 
			
		  Question q1 = new Question();
		  q1.setQuestion_id(101);
		  q1.setQuestion("What is Java");
		 
		  Answer a1 = new Answer();
		  a1.setAnswer_id(201);
		  a1.setAnswer("Java is Programming language");
		  
		  q1.setAnswer(a1);
		  
		 /* Question q2 = new Question();
		  q2.setQuestion_id(102);
		  q2.setQuestion("What is Mysql");
		 
		  Answer a2 = new Answer();
		  a2.setAnswer_id(202);
		  a2.setAnswer("Mysql is Programming language");
		  
		  q2.setAnswer(a2);
		  
		 */
		
		  session.save(q1);
		//  session.save(q2);
		  session.save(a1);
		//  session.save(a2);
		  tr.commit();
		  
		 session.close();
	       
	       
	       
	}

}

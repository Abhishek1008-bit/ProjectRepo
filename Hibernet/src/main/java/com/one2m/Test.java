package com.one2m;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Test {
	public static void main(String[] args) {
	
			 SessionFactory sf = new Configuration().configure("com/One2m/hibernet.cfg.xml").buildSessionFactory();
			 Session session = sf.openSession();   //save method hai isliye
			  Transaction tr = session.beginTransaction();   //permanent change karna hai 
				
			  Question q1 = new Question();
			  q1.setQuestion_id(101);
			  q1.setQuestion("What is java");
			  
	Answer a1 = new Answer();
	a1.setAnswer_id(201);
	a1.setAnswer("Java is programming Language");
	a1.setQuestion(q1);
	
	Answer a2 = new Answer();
	a2.setAnswer_id(202);
	a2.setAnswer("Java is ABC Language");
	a2.setQuestion(q1);
	
	List<Answer> list = new ArrayList();
	q1.setAnswer(list);
	
	session.save(q1);
    session.save(a1);
    session.save(a2);
    
    tr.commit();
    session.close();
    
	}

}

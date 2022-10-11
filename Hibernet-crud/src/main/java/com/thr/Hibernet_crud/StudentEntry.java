package com.thr.Hibernet_crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentEntry {
	public static void main(String[] args) {
		Student s1 = new Student(101,"Abhi","HIndi",78954);
		Student s2 = new Student(102,"Manas","Arts",846275);
		Student s3 = new Student(103,"Sumit","HIndi",37824);
		Student s4 = new Student(104,"Aman","Bio",854732);
		
		
		
		//create session object
				Session session=Utility.getSessionFactory().openSession();
				//begin transaction
				Transaction tr=session.beginTransaction();
				//save
				session.save(s1); session.save(s2); session.save(s3); session.save(s4);
				//commit transaction
				tr.commit();
				//close the session
				session.close();
				
				System.out.println("Data Stored...!");
		
		
		
	}

}

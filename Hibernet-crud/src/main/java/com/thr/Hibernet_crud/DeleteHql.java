package com.thr.Hibernet_crud;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteHql {
	public static void main(String[] args) {
		// create a session object
				Session session = Utility.getSessionFactory().openSession();
				Transaction tn = session.beginTransaction();

				 Query q1 = session.createQuery("delete from Student where sId = 104");
				int i =   q1.executeUpdate();
				tn.commit();
				session.close();
				System.out.println("Data Successfully Deleted...   ");
				 
	}

}

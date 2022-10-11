package com.thr.Hibernet_crud;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateHql {
	public static void main(String[] args) {

		// create a session object
		Session session = Utility.getSessionFactory().openSession();
		Transaction tn = session.beginTransaction();

		String hql = "update Student set sName=:uuu where sId = :i";
		Query q1 = session.createQuery(hql);
		q1.setParameter("uu","Ashutoshs");
		q1.setParameter("i",101);
		
		int i = q1.executeUpdate();
		tn.commit();
		session.close();
		System.out.println(" Data Updated Successfully....");
	}
}

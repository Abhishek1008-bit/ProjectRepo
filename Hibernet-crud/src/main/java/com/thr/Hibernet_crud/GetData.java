package com.thr.Hibernet_crud;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class GetData {
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter Student Id");
	 int id = 	sn.nextInt();
		Session session = Utility.getSessionFactory().openSession();
		Transaction tn = session.beginTransaction();
		   Student s1 =  session.get(Student.class, id);
		System.out.println(s1.getsName()+"    "+s1.getsId()+"   "+s1.getSubject());
	}

}

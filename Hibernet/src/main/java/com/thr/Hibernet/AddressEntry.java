package com.thr.Hibernet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddressEntry {
public static void main(String[] args) throws IOException {
	
	
	SessionFactory sf  = new Configuration().configure("com/thr/Hibernet/hibernet.cfg.xml").buildSessionFactory();
    Session session = sf.openSession();
    Transaction tr = session.beginTransaction();
	Address a1 = new Address();
	a1.setAddressId(101);
	a1.setStreet("AA");
	a1.setCity("Indore");
	a1.setDate(new Date());
	a1.setX(4552.212);
	
	//Reading Image
	FileInputStream fis = new FileInputStream("src/main/java/RRRRR.jpg");
	byte[] bb = new byte[fis.available()];
	fis.read(bb);
	a1.setImage(bb);
	 session.save(a1);
     
     tr.commit();
     session.close();
}
}

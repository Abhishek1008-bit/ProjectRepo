package com.thr.Hibernet_crud;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
	public static SessionFactory getSessionFactory() {
		Configuration config=new Configuration().configure("com/thr/Hibernet_crud/hibernet.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		return sessionFactory;
	}
}

package com.hcl.DAO;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		return factory;
	}
}
